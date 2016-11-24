package  com.chexun.dealer.admin.controller.clue;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.clue.PhoneRecords;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.model.common.Province;
import com.chexun.dealer.model.permission.Component;
import com.chexun.dealer.service.clue.PhoneRecordsService;
import com.chexun.dealer.utils.MBaseController;

@Controller
@RequestMapping("/admin/clue/phonerecords")
public class PhoneRecordsController extends MBaseController {

	private static final Logger logger = Logger.getLogger(PhoneRecordsController.class);

	@Autowired
	private PhoneRecordsService phoneRecordsService;

	// 路径
	private String toList = "/admin/clue/phonerecords_list.httl";// 列表页
	private String toAdd = "/admin/clue/phonerecords_add.httl";// 添加页面
	private String toEdit = "/admin/clue/phonerecords_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(String province,String city,String begintime,String endtime,String companyName,String extensionNum,
			HttpServletRequest request, HttpServletResponse response, PhoneRecords query , @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView=this.getModelAndView(request, Component.ADMIN, toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new PhoneRecords();
			}
			List<City> citys = null;
			if(province != null && !province.equals("")){
				query.setProvinceid(province.trim());
				citys = phoneRecordsService.selectCityById(Long.parseLong(province));
			}
			if(city != null && !city.equals("")){
				query.setCityid(city.trim());
			}
			if(begintime != null && !begintime.equals("")){
				query.setBegintime(begintime.trim());
			}
			if(endtime != null && !endtime.equals("")){
				query.setEndtime(endtime.trim());
			}
			if(companyName != null && !companyName.equals("")){
				query.setCompanyName(companyName.trim());
			}
			if(extensionNum != null && !extensionNum.equals("")){
				query.setExtensionNum(Long.parseLong(extensionNum.trim()));
			}
			List<Province> provinces = phoneRecordsService.selectProvince();
			List<PhoneRecords> list = phoneRecordsService.selectPhoneRecordsPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("phoneRecordsList", list);
			modelAndView.addObject("provinceList", provinces);
			modelAndView.addObject("cityList", citys);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("PhoneRecordsController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}
	
	@ResponseBody 
	@RequestMapping(value="/city",method=RequestMethod.POST)
	public JSONArray getCity(String provinceid) {
		JSONArray json = new JSONArray();
		try {
			if(provinceid != null && !provinceid.equals("")){
				List<City> citys = phoneRecordsService.selectCityById(Long.parseLong(provinceid));
				json.addAll(citys);
			}
		} catch (Exception e) {
			logger.error("PhoneRecordsController.toAdd", e);
		}
		return json;
	}
	

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("PhoneRecordsController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			PhoneRecords phoneRecords = phoneRecordsService.getPhoneRecordsById(id);
			modelAndView.addObject(phoneRecords);
		} catch (Exception e) {
			logger.error("PhoneRecordsController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(PhoneRecords phoneRecords, HttpServletRequest request) {
		try {
//			SysUser seuser = (SysUser) this.getSessionAttribute(request, CoreConstant.SYS_USER_SESSION_NAME);
//			if(StringUtils.isNotEmpty(phoneRecords.getId())){
//				//phoneRecords.setMtime(new Date());
//				if (seuser != null) {
//					//phoneRecords.setMuser(String.valueOf(seuser.getId()));
//				}
//				phoneRecordsService.updatePhoneRecordsByObj(phoneRecords);
//			}else{
//				//phoneRecords.setCtime(new Date());
//				//phoneRecords.setMtime(new Date());
//				if (seuser != null) {
//					//phoneRecords.setCuser(String.valueOf(seuser.getId()));
//					//phoneRecords.setMuser(String.valueOf(seuser.getId()));
//				}
//				phoneRecordsService.addPhoneRecords(phoneRecords);
//			}
		} catch (Exception e) {
			logger.error("PhoneRecordsController.edit", e);
		}
		return new RedirectView("/manage/clue/phonerecords/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, PhoneRecords query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/clue/phonerecords/list");
		String[] idArray = ids.split(",");
		PhoneRecords phoneRecords = new PhoneRecords();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					phoneRecords.setId(Long.valueOf(id));
					//phoneRecords.setStatus(PhoneRecords.DELETE_STATUS);
					this.phoneRecordsService.updatePhoneRecordsByObj(phoneRecords);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("PhoneRecordsController.delete", e);
		}
		return rv;
	}
}

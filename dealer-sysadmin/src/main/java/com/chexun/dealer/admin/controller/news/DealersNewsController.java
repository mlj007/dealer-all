package  com.chexun.dealer.admin.controller.news;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.news.DealersNoticeCheap;
import com.chexun.dealer.model.news.RelevantCarSerices;
import com.chexun.dealer.service.news.DealersNewsService;
import com.chexun.dealer.utils.MBaseController;

@Controller
@RequestMapping("/admin/news")
public class DealersNewsController extends MBaseController {

	private static final Logger logger = Logger.getLogger(DealersNewsController.class);

	@Autowired
	private DealersNewsService dealersNewsService;

	// 路径
	private String toList = "/admin/news/news_list.httl";// 列表页
	private String toAdd = "/admin/news/news_add.httl";// 添加页面
	private String toEdit = "/admin/news/news_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, DealersNews query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersNews();
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
			String title    = request.getParameter("title");
			String starTime = request.getParameter("starTime");
			String endTime  = request.getParameter("endTime");
			String companyName   = request.getParameter("dealer");
			String newsType = request.getParameter("newsType");
			if(title != null && !title.equals("")){
				query.setTitle(title.trim());
			}
			if(starTime != null && !starTime.equals("")){
				query.setBegintime(starTime.trim());
			}
			if(endTime != null && !endTime.equals("")){
				query.setEndtime(endTime.trim());
			}
			if(companyName != null && !companyName.equals("")){
				query.setCompanyName(companyName.trim());
			}
			if(newsType != null && !newsType.equals("")){
				query.setType(Long.valueOf(newsType));
			}
			
			List<DealersNews> list = dealersNewsService.selectDealersNewsPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealersNewsList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersNewsController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("DealersNewsController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		String SeriesHtml = null;
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			DealersNews dealersNews = dealersNewsService.getDealersNewsById(id);
			Long dealerId = dealersNews.getDealerUserId();
			String seriesids = dealersNews.getSeriesids();
			//关联车系 获取当前经销商的所有车系
			List<RelevantCarSerices> SeriesList = dealersNewsService.selectSeriesById(dealerId);
			if(SeriesList.size() > 0){
				if(seriesids != null && !"".equals(seriesids)){
				String[] seriesidList = seriesids.split(",");
					if(seriesidList.length > 0){
						for (String seriesid : seriesidList) {
							if(dealersNews.getType() == 2){
								DealersNoticeCheap dealersNoticeCheap = new DealersNoticeCheap();
								dealersNoticeCheap.setNewsId(id);
								dealersNoticeCheap.setUserId(dealersNews.getDealerUserId());
								dealersNoticeCheap.setSeriesId(Long.parseLong(seriesid));
								DealersNoticeCheap	noticeCheap = dealersNewsService.selectDealersNoticeCheapByObj(dealersNoticeCheap);
							}else{
								for (RelevantCarSerices carSerices : SeriesList) {
									if(carSerices.getSeriesId().equals(seriesid)){
										carSerices.setChecked(true);
									}
								}
								RelevantCarSerices carSerices = new RelevantCarSerices();
								carSerices.setUserId(id);
								carSerices.setSeriesId(seriesid);
								RelevantCarSerices selectSeriesById2 = dealersNewsService.selectSeriesById2(carSerices);
								SeriesHtml += "<div class=\"cx\"><a sId=\"" + selectSeriesById2.getSeriesId() + "\" class=\"close deleteSeries\">关闭</a>" + selectSeriesById2.getSeriesName() + "</div>";
							}
						}
					}
				}
			}
			modelAndView.addObject("seriesList",SeriesList);
			modelAndView.addObject("SeriesHtml",SeriesHtml);
			modelAndView.addObject("dealersNew",dealersNews);
		} catch (Exception e) {
			logger.error("DealersNewsController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(DealersNews dealersNews, HttpServletRequest request) {
		try {
//			SysUser seuser = (SysUser) this.getSessionAttribute(request, CoreConstant.SYS_USER_SESSION_NAME);
//			if(StringUtils.isNotEmpty(dealersNews.getId())){
//				//dealersNews.setMtime(new Date());
//				if (seuser != null) {
//					//dealersNews.setMuser(String.valueOf(seuser.getId()));
//				}
//				dealersNewsService.updateDealersNewsByObj(dealersNews);
//			}else{
//				//dealersNews.setCtime(new Date());
//				//dealersNews.setMtime(new Date());
//				if (seuser != null) {
//					//dealersNews.setCuser(String.valueOf(seuser.getId()));
//					//dealersNews.setMuser(String.valueOf(seuser.getId()));
//				}
//				dealersNewsService.addDealersNews(dealersNews);
//			}
		} catch (Exception e) {
			logger.error("DealersNewsController.edit", e);
		}
		return new RedirectView("/manage/news/dealersnews/list");
	}

	@RequestMapping("/delete")
	public ModelAndView delete(String id, HttpServletRequest request,HttpServletResponse response, DealersNews query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		//RedirectView rv = new RedirectView("/manage/news/dealersnews/list");
		ModelAndView modelAndView = new ModelAndView(toList);
		ServletOutputStream out;
		DealersNews dealersNews = new DealersNews();
		try {// 软删除状态设置为2
			if (!"".equals(id)) {
				String typeId = id.split("#")[1];
				if("2".equals(typeId)){
					dealersNews.setId(Long.valueOf(id.split("#")[0]));
					dealersNews.setState(DealersNews.FREEZE_STATUS);
					this.dealersNewsService.updateDealersNewsById(dealersNews);
				}else if ("1".equals(typeId)) {
					dealersNews.setId(Long.valueOf(id.split("#")[0]));
					dealersNews.setState(DealersNews.DELETE_STATUS);
					this.dealersNewsService.updateDealersNewsById(dealersNews);
				}
				out = response.getOutputStream(); 
				out.print("1");
				out.flush();
				out.close();
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("DealersNewsController.delete", e);
		}
		return modelAndView;
	}
}

package com.chexun.dealer.dao.impl.permission;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.dealer.dao.permission.PermissionDao;
import com.chexun.dealer.model.permission.Permission;
import com.chexun.dealer.vo.permission.PermissionUserVo;

/**
 *
 * PermissionUser User: Date: 2016-10-13
 */
@Repository("permissionDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class PermissionDaoImpl extends GenericDaoImpl implements PermissionDao {
	private static final Logger logger = Logger.getLogger(PermissionDaoImpl.class);
	public Permission getPermissionGroupIdListByMap(Permission permission) {
		try {
			Map map = BeanMapConvertor.convertBean(permission);
			map.put("userName", permission.getUserName());
			return this.selectOne("com.chexun.dealer.model.permission.PermissionMapper.selectPermissionGroupIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IntrospectionException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return null;

	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Permission> getPermissionPrivilegeListByMap(Permission permission) {
		try {
			Map map = BeanMapConvertor.convertBean(permission);
			permission=this.getPermissionGroupIdListByMap(permission);
			map.put("groupIdList", permission.getGroupIdList());
        	return this.selectList("com.chexun.dealer.model.permission.PermissionMapper.selectPermissionPrivilegeListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IntrospectionException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Permission> getPermissionParentMenuByMap(Permission permission){
		try {
			List<Permission> list=getPermissionPrivilegeListByMap(permission);
			String privilegeStr="";
			for(Permission p:list){
				privilegeStr+=p.getPrivilegeList();
			}
			privilegeStr=getPrivilegeStr(privilegeStr);
			Map map = BeanMapConvertor.convertBean(permission);
			map.put("privilegeList", privilegeStr);
			map.put("moduleRel", permission.getModuleRel());
        	return this.selectList("com.chexun.dealer.model.permission.PermissionMapper.selectPermissionParentMenuByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IntrospectionException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	public String getPrivilegeStr(String privilegeStr){
		String privileges[]=privilegeStr.split(",");
		String str="";
		Set set=new HashSet();
		for(String privilege:privileges){
			if(set.add(privilege)){
				str+=privilege+",";
			}
		}
		return str;
	}
	@Override
	public List<Permission> getPermissionModuleByMap(Permission permission) {
		try {
			List<Permission> list=getPermissionPrivilegeListByMap(permission);
			String privilegeStr="";
			for(Permission p:list){
				privilegeStr+=p.getPrivilegeList();
			}
			privilegeStr=getPrivilegeStr(privilegeStr);
			Map map = BeanMapConvertor.convertBean(permission);
			map.put("privilegeList", privilegeStr);
			map.put("moduleRel", permission.getModuleRel());
        	return this.selectList("com.chexun.dealer.model.permission.PermissionMapper.selectPermissionModuleByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IntrospectionException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
}

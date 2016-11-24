package com.chexun.dealer.service.permission.base.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.dealer.dao.permission.PermissionDao;
import com.chexun.dealer.model.permission.Permission;
import com.chexun.dealer.service.permission.base.PermissionBaseService;
import com.chexun.dealer.vo.permission.PermissionUserVo;
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
//@Service("permissionUserService")
public class PermissionBaseServiceImpl  implements PermissionBaseService{
	@Autowired
    private PermissionDao permissionDao;
	public List<Permission> getPermissionParentMenu(Permission permission){
		return permissionDao.getPermissionParentMenuByMap(permission);
	}
	public List<Permission> getPermissionModule(Permission permission){
		return permissionDao.getPermissionModuleByMap(permission);
	}
	
	
}
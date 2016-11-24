package com.chexun.dealer.service.permission.base;

import java.util.List;

import com.chexun.dealer.model.permission.Permission;
import com.chexun.dealer.vo.permission.PermissionUserVo;
import com.chexun.base.framework.core.entity.PageEntity; 
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
public interface PermissionBaseService {

	public List<Permission> getPermissionParentMenu(Permission permission);
	public List<Permission> getPermissionModule(Permission permission);
    
}
package com.chexun.dealer.dao.permission;
import java.util.List;
import java.util.Map;

import com.chexun.dealer.model.permission.Permission;
import com.chexun.dealer.vo.permission.PermissionUserVo;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
public interface PermissionDao {
	//根据用户名,获取用户角色所包含的权限组集合
	public Permission getPermissionGroupIdListByMap(Permission permission) ;
	//根据权限组ID，获取权限组列表中全部功能集合
	public List<Permission> getPermissionPrivilegeListByMap(Permission permission);
	//根据功能集合，查找功能主菜单
	public List<Permission> getPermissionParentMenuByMap(Permission permission);
	//根据功能集合，查找功能子菜单
	public List<Permission> getPermissionModuleByMap(Permission permission);
	
}
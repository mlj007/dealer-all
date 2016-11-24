package com.chexun.dealer.service.permission;

import com.chexun.dealer.service.permission.base.PermissionUserBaseService;
import com.chexun.dealer.vo.permission.PermissionUserVo;
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
public interface PermissionUserService extends PermissionUserBaseService{
	public Long savePermissionUser(PermissionUserVo permissionUserVo);
    
    
}
package com.chexun.dealer.service.permission.impl;

import org.springframework.stereotype.Service;

import com.chexun.dealer.model.permission.PermissionUser;
import com.chexun.dealer.service.permission.PermissionUserService;
import com.chexun.dealer.service.permission.base.base.impl.PermissionUserBaseServiceImpl;
import com.chexun.dealer.vo.permission.PermissionUserVo;
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
@Service("permissionUserService")
public class PermissionUserServiceImpl extends PermissionUserBaseServiceImpl  implements PermissionUserService{
	
	public Long savePermissionUser(PermissionUserVo permissionUserVo) {
		PermissionUser permissionUser=new PermissionUser();
		permissionUser.setUserName(permissionUserVo.getUserName());
		permissionUser.setRoleCode(permissionUserVo.getRoleCode());
		PermissionUser user=getPermissionUserByObj(permissionUser);
		if(null!=user&&user.getId()!=null&&user.getId()>0){
			return updatePermissionUser(user);
		}else{
			return insertPermissionUser(permissionUser);
		}
	}
	
}
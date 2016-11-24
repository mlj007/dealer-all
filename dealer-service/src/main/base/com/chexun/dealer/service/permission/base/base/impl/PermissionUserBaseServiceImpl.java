package com.chexun.dealer.service.permission.base.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.permission.PermissionUserDao;
import com.chexun.dealer.model.permission.PermissionUser;
import com.chexun.dealer.service.permission.base.PermissionUserBaseService;
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
//@Service("permissionUserService")
public class PermissionUserBaseServiceImpl implements PermissionUserBaseService{

 	@Autowired
    private PermissionUserDao permissionUserDao;
    /**
     * 添加PermissionUser
     * @param permissionUser 要添加的PermissionUser
     * @return id
     */
    public Long addPermissionUser(PermissionUser permissionUser){
    	Long res = permissionUserDao.addPermissionUser(permissionUser);
    	return res;
    }
	public Long insertPermissionUser(PermissionUser permissionUser){
		Long res = permissionUserDao.insertPermissionUser(permissionUser);
		
    	return res;
	}
    /**
     * 根据id删除一个PermissionUser
     * @param id 要删除的id
     */
    public Long deletePermissionUserById(Long id){
    	return permissionUserDao.deletePermissionUserById(id);
    }
	public Long deletePermissionUserByObj(PermissionUser permissionUser){
        return permissionUserDao.deletePermissionUserByObj(permissionUser);
    }
    public Long deletePermissionUserByIdList(List<Long > ids){
    	
    	return permissionUserDao.deletePermissionUserByIdList(ids);
    }
    /**
     * 修改PermissionUser
     * @param permissionUser 要修改的PermissionUser
     */
    public Long updatePermissionUser(PermissionUser permissionUser){
     	return permissionUserDao.updatePermissionUser(permissionUser);
    }
    
    public Long updatePermissionUserByObj(PermissionUser permissionUser){
    	return permissionUserDao.updatePermissionUserByObj(permissionUser);
    }
    
    public Long updatePermissionUserByObjAndConditions(PermissionUser s,PermissionUser c){
    	return permissionUserDao.updatePermissionUserByObjAndConditions(s,c);
    }
	public void batchUpdatePermissionUser(List<PermissionUser> records){
		permissionUserDao.batchUpdatePermissionUser(records);
	}
    /**
     * 根据id获取单个PermissionUser对象
     * @param id 要查询的id
     * @return PermissionUser
     */
    
    public Integer getPermissionUserCountByObj(PermissionUser permissionUser){
    	return permissionUserDao.getPermissionUserCountByObj(permissionUser);
    }
    


    public PermissionUser getPermissionUserById(Long id){
    	return permissionUserDao.getPermissionUserById( id);
    }
    
     public PermissionUser getPermissionUserByObj(PermissionUser permissionUser) {
        return permissionUserDao.getPermissionUserByObj(permissionUser);
    }


    
    public List<PermissionUser> getPermissionUserListByObj(PermissionUser permissionUser){
        return permissionUserDao.getPermissionUserListByObj(permissionUser);
    }
    public List<PermissionUser> getPermissionUserListPage(PermissionUser permissionUser,Integer offset,Integer limit){
        return permissionUserDao.getPermissionUserListPage(permissionUser,offset,limit);
    }
    
    public List<PermissionUser> getPermissionUserPage(PermissionUser permissionUser,PageEntity page) {
        return permissionUserDao.getPermissionUserPage(permissionUser,page);
    }
}
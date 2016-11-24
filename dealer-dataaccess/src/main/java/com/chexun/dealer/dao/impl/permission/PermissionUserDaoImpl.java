package com.chexun.dealer.dao.impl.permission;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.chexun.dealer.model.permission.PermissionUser;
import com.chexun.dealer.dao.permission.PermissionUserDao;
import org.springframework.stereotype.Repository;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * PermissionUser
 * User:
 * Date: 2016-10-13
 */
 @Repository("permissionUserDao")
public class PermissionUserDaoImpl extends GenericDaoImpl implements PermissionUserDao{

    public Long addPermissionUser(PermissionUser permissionUser) {
        return this.insert("com.chexun.dealer.model.permission.PermissionUserMapper.createPermissionUser",permissionUser);
    }
	public Long insertPermissionUser(PermissionUser permissionUser){
		return this.insert("com.chexun.dealer.model.permission.PermissionUserMapper.insertPermissionUser",permissionUser);
	}
    public Long deletePermissionUserById(Long id){
        return this.delete("com.chexun.dealer.model.permission.PermissionUserMapper.deletePermissionUserById",id);
    }
    public Long deletePermissionUserByObj(PermissionUser permissionUser){
        return this.delete("com.chexun.dealer.model.permission.PermissionUserMapper.deletePermissionUserByObj",permissionUser);
    }
    
	public Long deletePermissionUserByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.permission.PermissionUserMapper.deletePermissionUserByIdList",ids);
	}
    public Long updatePermissionUser(PermissionUser permissionUser) {
        return this.update("com.chexun.dealer.model.permission.PermissionUserMapper.updatePermissionUser",permissionUser);
    }
    
    public Long updatePermissionUserByObj(PermissionUser permissionUser){
    	return this.update("com.chexun.dealer.model.permission.PermissionUserMapper.updatePermissionUserByObj",permissionUser);
    }
    
    public Long updatePermissionUserByObjAndConditions(PermissionUser s,PermissionUser c){
    	Map<String,PermissionUser> map = new HashMap<String,PermissionUser>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.permission.PermissionUserMapper.updatePermissionUserByObjAndConditions",map);
    }
	public void batchUpdatePermissionUser(List<PermissionUser> records){
		this.update("com.chexun.dealer.model.permission.PermissionUserMapper.batchUpdatePermissionUser",records);
	}
    public PermissionUser getPermissionUserById(Long id) {
        return this.selectOne("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserById",id);
    }
    
    public PermissionUser getPermissionUserByObj(PermissionUser permissionUser) {
        return this.selectOne("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserByObj",permissionUser);
    }

    
    public List<PermissionUser> getPermissionUserListByObj(PermissionUser permissionUser){
        return this.selectList("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserListByObj",permissionUser);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<PermissionUser> getPermissionUserListPage(PermissionUser permissionUser,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(permissionUser);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getPermissionUserCountByObj(PermissionUser permissionUser){
    	return this.selectOne("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserCountByObj", permissionUser);
    }
    
    public List<PermissionUser> getPermissionUserPage(PermissionUser permissionUser,PageEntity page) {
        Integer objectscount = getPermissionUserCountByObj(permissionUser);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getPermissionUserListPage(permissionUser,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getPermissionUserIdByObj(PermissionUser permissionUser) {
        return this.selectOne("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserIdByObj",permissionUser);
    }

    public List<Long> getPermissionUserIdList(PermissionUser permissionUser) {
        return this.selectList("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserIdList",permissionUser);
    }
    
    public List<Long> getPermissionUserIdListByObj(PermissionUser permissionUser){
        return this.selectList("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserIdListByObj",permissionUser);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getPermissionUserIdListPage(PermissionUser permissionUser,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(permissionUser);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.permission.PermissionUserMapper.getPermissionUserIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getPermissionUserIdPage(PermissionUser permissionUser,PageEntity page) {
        Integer objectscount = getPermissionUserCountByObj(permissionUser);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getPermissionUserIdListPage(permissionUser,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
}

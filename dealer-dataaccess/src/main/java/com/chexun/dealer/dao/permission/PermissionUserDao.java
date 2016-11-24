package com.chexun.dealer.dao.permission;
import java.util.List;
import com.chexun.dealer.model.permission.PermissionUser;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * PermissionUser管理接口
 * User: 
 * Date: 2016-10-13
 */
public interface PermissionUserDao {

    /**
     * 添加PermissionUser
     * @param permissionUser 要添加的PermissionUser
     * @return id
     */
    public Long addPermissionUser(PermissionUser permissionUser);
	public Long insertPermissionUser(PermissionUser permissionUser);
    /**
     * 根据id删除一个PermissionUser
     * @param id 要删除的id
     */
    public Long deletePermissionUserById(Long id);
    
    public Long deletePermissionUserByObj(PermissionUser permissionUser);

	public Long deletePermissionUserByIdList(List<Long > ids);

    /**
     * 修改PermissionUser
     * @param permissionUser 要修改的PermissionUser
     */
    public Long updatePermissionUser(PermissionUser permissionUser);
    
    public Long updatePermissionUserByObj(PermissionUser permissionUser);
    
    public Long updatePermissionUserByObjAndConditions(PermissionUser s,PermissionUser c);
    public void batchUpdatePermissionUser(List<PermissionUser> records);

    /**
     * 根据id获取单个PermissionUser对象
     * @param id 要查询的id
     * @return PermissionUser
     */
    public PermissionUser getPermissionUserById(Long id);
	public PermissionUser getPermissionUserByObj(PermissionUser permissionUser);
    /**
     * 根据条件获取PermissionUser列表
     * @param permissionUser 查询条件
     * @return List<PermissionUser>
     */
    public List<PermissionUser> getPermissionUserListByObj(PermissionUser permissionUser);
    public List<PermissionUser> getPermissionUserListPage(PermissionUser permissionUser,Integer offset,Integer limit);
    public Integer getPermissionUserCountByObj(PermissionUser permissionUser);
    public List<PermissionUser> getPermissionUserPage(PermissionUser permissionUser,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getPermissionUserIdByObj(PermissionUser permissionUser);
    /**
     * 根据条件获取PermissionUser列表
     * @param permissionUser 查询条件
     * @return List<PermissionUser>
     */
    public List<Long> getPermissionUserIdList(PermissionUser permissionUser);
    public List<Long> getPermissionUserIdListByObj(PermissionUser permissionUser);
    public List<Long> getPermissionUserIdListPage(PermissionUser permissionUser,Integer offset,Integer limit);
    public List<Long> getPermissionUserIdPage(PermissionUser permissionUser,PageEntity page);
}
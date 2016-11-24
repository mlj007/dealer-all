package com.chexun.dealer.model.permission;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Permission implements Serializable{
	private Long userId;
	private String userName;
	private Long moduleId;//模块ID
	private String moduleName;//模块名称
	private String moduleImg;//功能图标
	private String moduleUrl;//功能地址
	private Long moduleSuperLevelId;//主菜单ID
	private String groupIdList;//权限组ID
	private String privilegeList;//模块ID集合
	private String moduleRel; //组件名称  (admin,manage,ebuy)
    
}

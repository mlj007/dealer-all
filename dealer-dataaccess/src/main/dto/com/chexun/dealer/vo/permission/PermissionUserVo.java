package com.chexun.dealer.vo.permission;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionUserVo  implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private String userName;
	private Long roleCode;
	
}

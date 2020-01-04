package com.macro.mall.service;

import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 * Created by macro on 2018/9/30.
 */
public interface UmsRoleService {
    /**
     * 添加角色
     */
    @Transactional
    int create(UmsRole role,List<Long> permissionIds);

    /**
     * 修改角色信息
     */
    int update(Long id, UmsRole role);

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);

    /**
     * 获取指定角色权限
     */
    List<UmsPermission> getPermissionList(Long roleId);

    /**
     * 修改指定角色的权限
     */
    @Transactional
    int updatePermission(UmsRole role, List<Long> permissionIds);

    /**
     * 获取角色列表
     */
    List<UmsRole> list();
}

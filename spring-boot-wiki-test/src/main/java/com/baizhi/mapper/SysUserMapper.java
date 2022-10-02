package com.baizhi.mapper;

import com.baizhi.entity.SysUser;

import java.util.List;

public interface SysUserMapper {
    SysUser selectById(Long id);

    List<SysUser> queryUsers();

    int insert(SysUser sysUser);

    int insertSelective(SysUser sysUser);

    int delete(Long id);
}

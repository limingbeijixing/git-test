package com.baizhi.service;

import com.baizhi.entity.SysUser;

import java.util.List;

public interface ISysUserService {
    SysUser unique(Long id);

    List<SysUser> queryUsers();

    boolean insert(SysUser sysUser);
}

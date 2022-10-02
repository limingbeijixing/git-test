package com.baizhi.service.impl;

import com.baizhi.entity.SysUser;
import com.baizhi.mapper.SysUserMapper;
import com.baizhi.service.ISysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class SysUserServiceImpl implements ISysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public SysUser unique(Long id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<SysUser> queryUsers() {
        return sysUserMapper.queryUsers();
    }

    @Override
    public boolean insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser) > 0;
    }
}

package com.baizhi.biz.service;

import com.baizhi.entity.SysUser;
import com.baizhi.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceTest {
    @Resource
    private ISysUserService sysUserService;

    @Test
    public void unique() {
        SysUser sysUser = sysUserService.unique(3L);
        System.out.println(sysUser);
    }

    @Test
    public void queryUsers() {
        List<SysUser> sysUsers = sysUserService.queryUsers();
        System.out.println(sysUsers);
    }

    @Test
    public void insert() {
        SysUser sysUser = new SysUser();
        sysUser.setId(3L);
        sysUser.setIdentityCard("411224199204194510");
        sysUser.setUsername("zgx");
        sysUser.setPassword("123456");
        sysUser.setNick("xxx");
        sysUser.setSex("女");
        sysUser.setAge(18);
        sysUser.setEmail("1321883365@qq.com");
        sysUser.setPhone("13939050464");
        sysUser.setStatus("0");
        sysUser.setSalt("abc");
        sysUser.setGmtCreate(new Date());
        sysUser.setGmtModified(new Date());
        SysUser unique = sysUserService.unique(3L);
        if (unique == null) {
            boolean flag = sysUserService.insert(sysUser);
            System.out.println(flag);
        }
    }
}

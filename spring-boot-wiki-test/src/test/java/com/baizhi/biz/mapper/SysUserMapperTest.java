package com.baizhi.biz.mapper;

import com.baizhi.entity.SysUser;
import com.baizhi.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    public void selectById() {
        SysUser sysUser = sysUserMapper.selectById(1L);
        System.out.println(sysUser);
    }

    @Test
    public void queryUsers() {
        List<SysUser> sysUsers = sysUserMapper.queryUsers();
        System.out.println(sysUsers);
    }

    @Test
    public void insert() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1L);
        sysUser.setIdentityCard("411224199204194514");
        sysUser.setUsername("ljh");
        sysUser.setPassword("123456");
        sysUser.setNick("xhh");
        sysUser.setSex("男");
        sysUser.setAge(18);
        sysUser.setEmail("1321883365@qq.com");
        sysUser.setPhone("13939050464");
        sysUser.setStatus("0");
        sysUser.setSalt("abc");
        sysUser.setGmtCreate(new Date());
        sysUser.setGmtModified(new Date());
        SysUser unique = sysUserMapper.selectById(1L);
        if (unique == null) {
            int flag = sysUserMapper.insert(sysUser);
            System.out.println(flag);
        }
    }

    @Test
    public void insertSelective() {
        SysUser sysUser = new SysUser();
        sysUser.setId(2L);
        sysUser.setIdentityCard("411224199204193510");
        sysUser.setUsername("ljb");
        sysUser.setPassword("123456");
        sysUser.setNick("xbb");
        sysUser.setSex("男");
        sysUser.setAge(18);
        sysUser.setEmail("1321883365@qq.com");
        sysUser.setPhone("13939050464");
        sysUser.setStatus("0");
        sysUser.setSalt("abc");
        sysUser.setGmtCreate(new Date());
        sysUser.setGmtModified(new Date());
        SysUser unique = sysUserMapper.selectById(2L);
        if (unique == null) {
            int flag = sysUserMapper.insertSelective(sysUser);
            System.out.println(flag);
        }
    }

    @Test
    public void delete() {
        int flag = sysUserMapper.delete(4L);
        System.out.println(flag);
    }
}

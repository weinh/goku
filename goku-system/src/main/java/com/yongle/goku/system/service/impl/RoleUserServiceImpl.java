package com.yongle.goku.system.service.impl;

import com.yongle.goku.base.service.impl.BaseServiceImpl;
import com.yongle.goku.model.system.SysRoleUser;
import com.yongle.goku.model.system.SysRoleUserExample;
import com.yongle.goku.system.mapper.SysRoleUserMapper;
import com.yongle.goku.system.service.RoleUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author weinh
 */
@Service
public class RoleUserServiceImpl extends BaseServiceImpl implements RoleUserService {

    @Resource
    private SysRoleUserMapper roleUserMapper;

    @Override
    public Set<String> findRoles(Long userId) {
        SysRoleUserExample example = new SysRoleUserExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<SysRoleUser> roleUserList = roleUserMapper.selectByExample(example);
        Set<String> roles = new HashSet<>(roleUserList.size());
        for (SysRoleUser roleUser : roleUserList) {
            roles.add(roleUser.getRoleId().toString());
        }
        return roles;
    }
}
package earth.tiangong.footprint.backend.service.impl;

import earth.tiangong.footprint.backend.entity.SysRoles;
import earth.tiangong.footprint.backend.entity.SysUserRoles;
import earth.tiangong.footprint.backend.mapper.SysUserRolesMapper;
import earth.tiangong.footprint.backend.service.ISysRolesService;
import earth.tiangong.footprint.backend.service.ISysUserRolesService;
import earth.tiangong.footprint.backend.util.ColumnNameUtil;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-02-13
 */
@Service
public class SysUserRolesServiceImpl extends ServiceImpl<SysUserRolesMapper, SysUserRoles> implements ISysUserRolesService {
    @Autowired
    SysUserRolesMapper sysUserRolesMapper;

    public List<SysUserRoles> getByUserId(Long userId) {
        QueryWrapper<SysUserRoles> queryWrapper = new QueryWrapper<SysUserRoles>();
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("userId"), userId);
        return sysUserRolesMapper.selectList(queryWrapper);
    }

    @Autowired
    ISysRolesService iSysRolesService;

    public List<SysRoles> getRolesByUserId(Long userId)
    {
        List<SysUserRoles> sysUserRoles = getByUserId(userId);
        List<SysRoles> sysRoles = new ArrayList<>();
        for (SysUserRoles sysUserRole : sysUserRoles)
        {
            SysRoles sysRole = iSysRolesService.getById(sysUserRole.getRoleId());
            sysRoles.add(sysRole);
        }
        return sysRoles;
    }

    // public Set<String> getRolePermissionByUserId(Long userId)
    // {
    //     List<SysUserRoles> sysUserRoles = getByUserId(userId);
    //     Set<String> permsSet = new HashSet<>();
    //     for (SysUserRoles sysUserRole : sysUserRoles)
    //     {
    //         SysRoles sysRole = iSysRolesService.getById(sysUserRole.getRoleId());
    //         if (StringUtils.isNotNull(sysRole.getName()))
    //         {
    //             permsSet.add(sysRole.getName());
    //         }
    //     }
    //     return permsSet;
    // }
}
package earth.tiangong.footprint.backend.service;

import earth.tiangong.footprint.backend.entity.SysRoles;
import earth.tiangong.footprint.backend.entity.SysUserRoles;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-02-13
 */
public interface ISysUserRolesService extends IService<SysUserRoles> {

    // Set<String> getRolePermissionByUserId(Long userId);
    List<SysRoles> getRolesByUserId(Long userId);

}

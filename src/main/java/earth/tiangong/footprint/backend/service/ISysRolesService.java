package earth.tiangong.footprint.backend.service;

import earth.tiangong.footprint.backend.entity.SysRoles;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-02-13
 */
public interface ISysRolesService extends IService<SysRoles> {
    SysRoles getById(Long id);
}

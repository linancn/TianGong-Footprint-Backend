package earth.tiangong.footprint.backend.service;

import earth.tiangong.footprint.backend.entity.FactorTransportation;
import earth.tiangong.footprint.backend.model.SelectItemData;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-18
 */
public interface IFactorTransportationService extends IService<FactorTransportation> {
    List<SelectItemData> getTransportModeSelectItems();
}

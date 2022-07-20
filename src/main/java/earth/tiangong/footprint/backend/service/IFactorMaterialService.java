package earth.tiangong.footprint.backend.service;

import earth.tiangong.footprint.backend.entity.FactorMaterial;
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
public interface IFactorMaterialService extends IService<FactorMaterial> {
    List<SelectItemData> getMaterialCategorySelectItems();
    List<SelectItemData> getMaterialTypeSelectItems(String category);
}

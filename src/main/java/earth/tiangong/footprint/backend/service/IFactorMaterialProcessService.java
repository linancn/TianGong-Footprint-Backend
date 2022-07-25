package earth.tiangong.footprint.backend.service;

import earth.tiangong.footprint.backend.entity.FactorMaterialProcess;
import earth.tiangong.footprint.backend.model.SelectItemData;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-19
 */
public interface IFactorMaterialProcessService extends IService<FactorMaterialProcess> {
    List<SelectItemData> getProcessCategorySelectItems(String materialType);

    List<SelectItemData> getProcessTypeSelectItems(String materialType, String processCategory);

    FactorMaterialProcess getByProcessType(String materialType, String processCategory,String processType);

}

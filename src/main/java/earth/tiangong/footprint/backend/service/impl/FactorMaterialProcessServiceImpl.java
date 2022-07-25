package earth.tiangong.footprint.backend.service.impl;

import earth.tiangong.footprint.backend.entity.FactorMaterialProcess;
import earth.tiangong.footprint.backend.mapper.FactorMaterialProcessMapper;
import earth.tiangong.footprint.backend.model.SelectItemData;
import earth.tiangong.footprint.backend.service.IFactorMaterialProcessService;

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
 * @since 2022-07-19
 */
@Service
public class FactorMaterialProcessServiceImpl extends ServiceImpl<FactorMaterialProcessMapper, FactorMaterialProcess> implements IFactorMaterialProcessService {
    @Autowired
    FactorMaterialProcessMapper factorMaterialProcessMapper;

    public List<SelectItemData> getProcessCategorySelectItems(String materialType) {
        List<SelectItemData> records = new ArrayList<SelectItemData>();
        QueryWrapper<FactorMaterialProcess> queryWrapper = new QueryWrapper<FactorMaterialProcess>();
        queryWrapper.eq("material_type", materialType);
        queryWrapper.select("process_category").orderByAsc("process_category");
        List<FactorMaterialProcess> datas = factorMaterialProcessMapper.selectList(queryWrapper);
        for (FactorMaterialProcess data : datas) {
            SelectItemData sid = new SelectItemData();
            sid.setLabel(data.getProcessCategory());
            sid.setValue(data.getProcessCategory());
            records.add(sid);
        }
        return records;
    }

    public List<SelectItemData> getProcessTypeSelectItems(String materialType, String processCategory) {
        List<SelectItemData> records = new ArrayList<SelectItemData>();
        QueryWrapper<FactorMaterialProcess> queryWrapper = new QueryWrapper<FactorMaterialProcess>();
        queryWrapper.eq("material_type", materialType);
        queryWrapper.eq("process_category", processCategory);
        queryWrapper.select("process_type").orderByAsc("process_type");
        List<FactorMaterialProcess> datas = factorMaterialProcessMapper.selectList(queryWrapper);
        for (FactorMaterialProcess data : datas) {
            SelectItemData sid = new SelectItemData();
            sid.setLabel(data.getProcessType());
            sid.setValue(data.getProcessType());
            records.add(sid);
        }
        return records;
    }

    public FactorMaterialProcess getByProcessType(String materialType, String processCategory, String processType) {
        QueryWrapper<FactorMaterialProcess> queryWrapper = new QueryWrapper<FactorMaterialProcess>();
        queryWrapper.eq("material_type", materialType);
        queryWrapper.eq("process_category", processCategory);
        queryWrapper.eq("process_type", processType);

        FactorMaterialProcess data = factorMaterialProcessMapper.selectOne(queryWrapper);

        return data;
    }
}

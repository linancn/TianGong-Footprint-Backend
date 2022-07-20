package earth.tiangong.footprint.backend.service.impl;

import earth.tiangong.footprint.backend.entity.FactorMaterial;
import earth.tiangong.footprint.backend.mapper.FactorMaterialMapper;
import earth.tiangong.footprint.backend.model.SelectItemData;
import earth.tiangong.footprint.backend.service.IFactorMaterialService;
// import earth.tiangong.footprint.backend.util.ColumnNameUtil;

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
 * @since 2022-07-18
 */
@Service
public class FactorMaterialServiceImpl extends ServiceImpl<FactorMaterialMapper, FactorMaterial> implements IFactorMaterialService {
    @Autowired
    FactorMaterialMapper factorMaterialMapper;
    // public String[] categorySelectItemColumns = {
    // ColumnNameUtil.toDatabaseName("materialCategory") };

    public List<SelectItemData> getMaterialCategorySelectItems() {
        List<SelectItemData> records = new ArrayList<SelectItemData>();
        QueryWrapper<FactorMaterial> queryWrapper = new QueryWrapper<FactorMaterial>();
        queryWrapper.select("Distinct material_category").orderByAsc("material_category");
        List<FactorMaterial> factorMaterials = factorMaterialMapper.selectList(queryWrapper);
        for (FactorMaterial f : factorMaterials) {
            SelectItemData d = new SelectItemData();
            d.setLabel(f.getMaterialCategory());
            d.setValue(f.getMaterialCategory());
            records.add(d);
        }
        return records;
    }

    public List<SelectItemData> getMaterialTypeSelectItems(String category) {
        List<SelectItemData> records = new ArrayList<SelectItemData>();
        QueryWrapper<FactorMaterial> queryWrapper = new QueryWrapper<FactorMaterial>();
        queryWrapper.eq("material_category", category);
        queryWrapper.select("material_type").orderByAsc("material_type");
        List<FactorMaterial> factorMaterials = factorMaterialMapper.selectList(queryWrapper);
        for (FactorMaterial f : factorMaterials) {
            SelectItemData d = new SelectItemData();
            d.setLabel(f.getMaterialType());
            d.setValue(f.getMaterialType());
            records.add(d);
        }
        return records;
    }
}

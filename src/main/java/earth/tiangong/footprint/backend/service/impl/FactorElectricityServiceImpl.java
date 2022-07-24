package earth.tiangong.footprint.backend.service.impl;

import earth.tiangong.footprint.backend.entity.FactorElectricity;
import earth.tiangong.footprint.backend.mapper.FactorElectricityMapper;
import earth.tiangong.footprint.backend.model.SelectItemData;
import earth.tiangong.footprint.backend.service.IFactorElectricityService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-18
 */
@Service
public class FactorElectricityServiceImpl extends ServiceImpl<FactorElectricityMapper, FactorElectricity> implements IFactorElectricityService {
    @Autowired
    FactorElectricityMapper factorElectricityMapper;

    public List<SelectItemData> getElectricitySourceSelectItems(){
        List<SelectItemData> records = new ArrayList<SelectItemData>();
        QueryWrapper<FactorElectricity> queryWrapper = new QueryWrapper<FactorElectricity>();
        queryWrapper.select("Distinct electricity_source").orderByAsc("electricity_source");
        List<FactorElectricity> datas = factorElectricityMapper.selectList(queryWrapper);
        for (FactorElectricity data : datas) {
            SelectItemData sid = new SelectItemData();
            sid.setLabel(data.getElectricitySource());
            sid.setValue(data.getElectricitySource());
            records.add(sid);
        }
        return records;
    }
}

package earth.tiangong.footprint.backend.service.impl;

import earth.tiangong.footprint.backend.entity.FactorTransportation;
import earth.tiangong.footprint.backend.mapper.FactorTransportationMapper;
import earth.tiangong.footprint.backend.model.SelectItemData;
import earth.tiangong.footprint.backend.service.IFactorTransportationService;

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
public class FactorTransportationServiceImpl extends ServiceImpl<FactorTransportationMapper, FactorTransportation> implements IFactorTransportationService {
    @Autowired
    FactorTransportationMapper factorTransportationMapper;

    public List<SelectItemData> getTransportModeSelectItems() {
        List<SelectItemData> records = new ArrayList<SelectItemData>();
        QueryWrapper<FactorTransportation> queryWrapper = new QueryWrapper<FactorTransportation>();
        queryWrapper.select("Distinct transport_mode").orderByAsc("transport_mode");
        List<FactorTransportation> datas = factorTransportationMapper.selectList(queryWrapper);
        for (FactorTransportation data : datas) {
            SelectItemData sid = new SelectItemData();
            sid.setLabel(data.getTransportMode());
            sid.setValue(data.getTransportMode());
            records.add(sid);
        }
        return records;
    }

    public FactorTransportation getByTransportMode(String transportMode){
        QueryWrapper<FactorTransportation> queryWrapper = new QueryWrapper<FactorTransportation>();
        queryWrapper.eq("transport_mode", transportMode);
        FactorTransportation data = factorTransportationMapper.selectOne(queryWrapper);
        return data;
    }
}

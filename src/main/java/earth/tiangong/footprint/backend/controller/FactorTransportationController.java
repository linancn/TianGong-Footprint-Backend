package earth.tiangong.footprint.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import earth.tiangong.footprint.backend.service.IFactorTransportationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import earth.tiangong.footprint.backend.model.SelectItemData;

import static org.springframework.http.ResponseEntity.ok;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-18
 */
@Controller
@RequestMapping("/factorTransportation")
public class FactorTransportationController {
    @Autowired
    private IFactorTransportationService iFactorTransportationService;
    
    @GetMapping("/getTransportModeSelectItems")
    public ResponseEntity<List<SelectItemData>> getTransportModeSelectItems() throws Exception {
        return ok(iFactorTransportationService.getTransportModeSelectItems());
    }
}

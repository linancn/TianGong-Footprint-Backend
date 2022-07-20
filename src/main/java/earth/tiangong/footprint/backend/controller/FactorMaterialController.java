package earth.tiangong.footprint.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import earth.tiangong.footprint.backend.service.IFactorMaterialService;

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
@RequestMapping("/factorMaterial")
public class FactorMaterialController {

    @Autowired
    private IFactorMaterialService iFactorMaterialService;
    
    @GetMapping("/getMaterialCategorySelectItems")
    public ResponseEntity<List<SelectItemData>> getMaterialCategorySelectItems() throws Exception {
        return ok(iFactorMaterialService.getMaterialCategorySelectItems());
    }

    @GetMapping("/getMaterialTypeSelectItems/{category}")
    public ResponseEntity<List<SelectItemData>> getMaterialTypeSelectItems(@PathVariable String category) throws Exception {
        return ok(iFactorMaterialService.getMaterialTypeSelectItems(category));
    }
}

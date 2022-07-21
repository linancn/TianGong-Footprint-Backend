package earth.tiangong.footprint.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import earth.tiangong.footprint.backend.model.SelectItemData;
import earth.tiangong.footprint.backend.service.IFactorMaterialProcessService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import static org.springframework.http.ResponseEntity.ok;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-19
 */
@Controller
@RequestMapping("/factorMaterialProcess")
public class FactorMaterialProcessController {
    @Autowired
    private IFactorMaterialProcessService iFactorMaterialProcessService;

    @GetMapping("/getProcessCategorySelectItems/{materialType}")
    public ResponseEntity<List<SelectItemData>> getProcessCategorySelectItems(@PathVariable String materialType) throws Exception {
        return ok(iFactorMaterialProcessService.getProcessCategorySelectItems(materialType));
    }

    @GetMapping("/getProcessTypeSelectItems/{materialType}/{processCategory}")
    public ResponseEntity<List<SelectItemData>> getProcessTypeSelectItems(@PathVariable String materialType, @PathVariable String processCategory) throws Exception {
        return ok(iFactorMaterialProcessService.getProcessTypeSelectItems(materialType, processCategory));
    }
}

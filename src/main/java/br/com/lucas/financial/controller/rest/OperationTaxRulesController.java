package br.com.lucas.financial.controller.rest;

import br.com.lucas.financial.entity.OperationTaxRulesEntity;
import br.com.lucas.financial.service.OperationTaxRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperationTaxRulesController {

    @Autowired
    private OperationTaxRulesService service;

    @PostMapping("/saveOperationRules")
    public String saveUsers(@RequestBody List<OperationTaxRulesEntity> operationRules) {
        return this.service.saveOperationRulesList(operationRules);
    }

    @GetMapping("/getAllRules")
    public List<OperationTaxRulesEntity> getAllRules() {
        return this.service.getAllRules();
    }

    @GetMapping("/findOperationTaxRule/{id}")
    public OperationTaxRulesEntity findOperationTaxRule(@PathVariable Long id) {
        return this.service.findOperationTaxRule(id);
    }


}

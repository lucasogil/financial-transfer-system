package br.com.lucas.financial.service.impl;

import br.com.lucas.financial.entity.OperationTaxRulesEntity;
import br.com.lucas.financial.repository.OperationTaxRulesRepository;
import br.com.lucas.financial.service.OperationTaxRulesService;
import br.com.lucas.financial.util.OperationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationTaxRulesServiceImpl implements OperationTaxRulesService {

    @Autowired
    private OperationTaxRulesRepository repository;

    @Override
    public String saveOperationRulesList(List<OperationTaxRulesEntity> operationTaxRules) {
        try {
            this.repository.saveAll(operationTaxRules);
            return operationTaxRules.size() + " record saved";
        } catch (Exception e){
            return "Fail to record";
        }
    }

    @Override
    public List<OperationTaxRulesEntity> getAllRules() {
        return (List<OperationTaxRulesEntity>) this.repository.findAll();
    }

    @Override
    public OperationTaxRulesEntity findOperationTaxRule(Long daysBetweenInterval) {
        List<OperationTaxRulesEntity> allRules = getAllRules();
        return OperationUtil.selectRule(daysBetweenInterval, allRules);
    }

}

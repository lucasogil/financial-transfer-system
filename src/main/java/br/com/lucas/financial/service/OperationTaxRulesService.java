package br.com.lucas.financial.service;

import br.com.lucas.financial.entity.OperationTaxRulesEntity;

import java.util.List;

public interface OperationTaxRulesService {

    public String saveOperationRulesList(List<OperationTaxRulesEntity> operationTaxRules);

    public List<OperationTaxRulesEntity> getAllRules();

    public OperationTaxRulesEntity findOperationTaxRule(Long daysBetweenInterval);


}

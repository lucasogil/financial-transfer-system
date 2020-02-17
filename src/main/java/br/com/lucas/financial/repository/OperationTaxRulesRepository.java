package br.com.lucas.financial.repository;

import br.com.lucas.financial.entity.OperationTaxRulesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationTaxRulesRepository extends CrudRepository<OperationTaxRulesEntity, Integer> {

}

package br.com.lucas.financialTranferSystem.repository;

import br.com.lucas.financialTranferSystem.entity.OperationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperationRepository extends CrudRepository<OperationEntity, Integer> {

    List<OperationEntity> findByUserId(Integer userId);

}

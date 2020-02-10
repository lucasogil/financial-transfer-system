package br.com.lucas.financialTranferSystem.repository;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccountEntity, Integer> {

    List<BankAccountEntity> findByUserId(Integer userId);

    Optional<?> findByIdAndUserId(Integer id, Integer userId);
}

package br.com.lucas.financial.repository;

import br.com.lucas.financial.entity.BankAccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccountEntity, Integer> {

    List<BankAccountEntity> findByUserId(Integer userId);

    Optional<?> findByIdAndUserId(Integer id, Integer userId);
}

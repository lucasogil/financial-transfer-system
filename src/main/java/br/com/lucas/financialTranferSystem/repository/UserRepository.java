package br.com.lucas.financialTranferSystem.repository;

import br.com.lucas.financialTranferSystem.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}

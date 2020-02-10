package br.com.lucas.financialTranferSystem.service;

import br.com.lucas.financialTranferSystem.entity.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    public String saveUsersList(List<UserEntity> users);

    public List<UserEntity> getAllUsers();

    public UserEntity createUser(UserEntity userEntity);

    public UserEntity findUserById(Integer id);

    public UserEntity updateUser(UserEntity userEntity);

    public ResponseEntity<?> deleteUser(UserEntity userEntity);

}

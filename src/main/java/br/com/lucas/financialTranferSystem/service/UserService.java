package br.com.lucas.financialTranferSystem.service;

import br.com.lucas.financialTranferSystem.entity.UserEntity;

import java.util.List;

public interface UserService {

    public String saveUsersList(List<UserEntity> users);

    public List<UserEntity> getAllUsers();

    public UserEntity findUserById(Integer id);

    public String updateUser(UserEntity user);

    public String deleteUser(UserEntity user);

}

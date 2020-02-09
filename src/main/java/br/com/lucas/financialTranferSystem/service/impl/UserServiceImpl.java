package br.com.lucas.financialTranferSystem.service.impl;

import br.com.lucas.financialTranferSystem.repository.UserRepository;
import br.com.lucas.financialTranferSystem.service.UserService;
import br.com.lucas.financialTranferSystem.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public String saveUsersList(List<UserEntity> users) {
        try {
            this.userRepository.saveAll(users);
            return users.size() + " record saved";
        } catch (Exception e){
            return "Fail to record";
        }
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) this.userRepository.findAll();
    }

    @Override
    public UserEntity findUserById(Integer id) {
        Optional<UserEntity> userOptional = this.userRepository.findById(id);
        return userOptional.orElseGet(UserEntity::new);
    }

    @Override
    public String updateUser(UserEntity user) {
        try {
            this.userRepository.save(user);
            return "Update success";
        } catch (Exception e) {
            return "Not possible to update User "+user.getName()+" information";
        }

    }

    @Override
    public String deleteUser(UserEntity user) {
        try{
            this.userRepository.delete(user);
            return "Delete complete";
        } catch (Exception e) {
            return "User "+user.getName()+" not deleted";
        }
    }
}

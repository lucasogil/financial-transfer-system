package br.com.lucas.financial.service.impl;

import br.com.lucas.financial.exception.ResourceNotFoundException;
import br.com.lucas.financial.repository.UserRepository;
import br.com.lucas.financial.service.UserService;
import br.com.lucas.financial.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public UserEntity createUser(UserEntity userEntity) {
        return this.userRepository.save(userEntity);
    }

    @Override
    public UserEntity findUserById(Integer id) {
        Optional<UserEntity> userOptional = this.userRepository.findById(id);
        return userOptional.orElseGet(UserEntity::new);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
       return this.userRepository.findById(userEntity.getId()).map(user -> {
           user.setId(userEntity.getId());
           user.setName(userEntity.getName());
           return this.userRepository.save(user);
       }).orElseThrow(() -> new ResourceNotFoundException("User Id "+ userEntity.getId() + " not found"));

    }

    @Override
    public ResponseEntity<?> deleteUser(UserEntity userEntity) {
        return this.userRepository.findById(userEntity.getId()).map(user -> {
            this.userRepository.delete(user);
            return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("UserId " + userEntity.getId() + " not found"));
    }
}

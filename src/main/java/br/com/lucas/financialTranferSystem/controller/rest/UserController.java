package br.com.lucas.financialTranferSystem.controller.rest;

import br.com.lucas.financialTranferSystem.service.UserService;
import br.com.lucas.financialTranferSystem.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/saveUsers")
    public String saveUsers(@RequestBody List<UserEntity> users) {
        return this.service.saveUsersList(users);
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return this.service.getAllUsers();
    }

    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return this.service.createUser(userEntity);
    }

    @GetMapping("/findUserById/{id}")
    public UserEntity findUserById(@PathVariable Integer id) {
        return this.service.findUserById(id);
    }

    @PostMapping("/updateUser")
    public UserEntity updateUser(@RequestBody UserEntity userEntity) {
        return this.service.updateUser(userEntity);
    }

    @PostMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestBody UserEntity userEntity) {
        return this.service.deleteUser(userEntity);
    }

}

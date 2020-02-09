package br.com.lucas.financialTranferSystem.controller;

import br.com.lucas.financialTranferSystem.service.UserService;
import br.com.lucas.financialTranferSystem.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUsers")
    public String saveUsers(@RequestBody List<UserEntity> users) {
        return this.userService.saveUsersList(users);
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/findUserById/{id}")
    public UserEntity findUserById(@PathVariable Integer id) {
        return this.userService.findUserById(id);
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody UserEntity user) {
        return this.userService.updateUser(user);
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestBody UserEntity user) {
        return this.userService.deleteUser(user);
    }

}

package br.com.lucas.financial.controller.rest;

import br.com.lucas.financial.entity.BankAccountEntity;
import br.com.lucas.financial.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService service;

    @GetMapping("/getAllBankAccountsByUserId/{userId}")
    public List<BankAccountEntity> getAllBankAccountsByUserId(@PathVariable Integer userId) {
        return this.service.getAllBankAccountsByUserId(userId);
    }

    @GetMapping("/getAllBankAccounts")
    public List<BankAccountEntity> getAllBankAccounts(){
        return this.service.getAllBankAccounts();
    }

    @PostMapping("/createBankAccount/{userId}")
    public BankAccountEntity createBankAccount(@PathVariable Integer userId, @RequestBody BankAccountEntity bankAccountEntity) {
        return this.service.createBankAccount(userId, bankAccountEntity);
    }

    @GetMapping("/findBankAccountById/{id}")
    public BankAccountEntity findUserById(@PathVariable Integer id) {
        return this.service.findBankAccountById(id);
    }

    @PostMapping("/updateBankAccount/{userId}")
    public BankAccountEntity updateUser(@PathVariable Integer userId, @RequestBody BankAccountEntity bankAccountEntity) {
        return this.service.updateBankAccount(userId, bankAccountEntity);
    }

    @PostMapping("/deleteBankAccount/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer userId, @RequestBody BankAccountEntity bankAccountEntity) {
        return this.service.deleteBankAccount(userId, bankAccountEntity);
    }

}

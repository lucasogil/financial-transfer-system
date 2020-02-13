package br.com.lucas.financialTranferSystem.service;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import br.com.lucas.financialTranferSystem.entity.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BankAccountService {

    public List<BankAccountEntity> getAllBankAccountsByUserId(Integer userId);

    public List<BankAccountEntity> getAllBankAccounts();

    public BankAccountEntity createBankAccount(Integer userId, BankAccountEntity bankAccountEntity);

    public BankAccountEntity findBankAccountById(Integer id);

    public BankAccountEntity updateBankAccount(Integer userId, BankAccountEntity bankAccountEntity);

    public ResponseEntity<?> deleteBankAccount(Integer userId, BankAccountEntity bankAccountEntity);

}

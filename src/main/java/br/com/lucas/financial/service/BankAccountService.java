package br.com.lucas.financial.service;

import br.com.lucas.financial.entity.BankAccountEntity;
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

package br.com.lucas.financialTranferSystem.service.impl;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import br.com.lucas.financialTranferSystem.exception.ResourceNotFoundException;
import br.com.lucas.financialTranferSystem.repository.BankAccountRepository;
import br.com.lucas.financialTranferSystem.repository.UserRepository;
import br.com.lucas.financialTranferSystem.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<BankAccountEntity> getAllBankAccountsByUserId(Integer userId) {
        return this.bankAccountRepository.findByUserId(userId);
    }

    @Override
    public BankAccountEntity createBankAccount(Integer userId, BankAccountEntity bankAccountEntity) {
        return this.userRepository.findById(userId).map(user -> {
            bankAccountEntity.setUser(user);
            return this.bankAccountRepository.save(bankAccountEntity);
        }).orElseThrow(() -> new ResourceNotFoundException("User Id " + userId + " not found"));
    }

    @Override
    public BankAccountEntity findBankAccountById(Integer id) {
        Optional<BankAccountEntity> optId = bankAccountRepository.findById(id);
        return optId.orElseGet(BankAccountEntity::new);
    }

    @Override
    public BankAccountEntity updateBankAccount(Integer userId, BankAccountEntity bankAccountEntity) {
        if(!userRepository.existsById(userId)) {
            throw new ResourceNotFoundException("User Id "+ userId + " not found");
        }

        return bankAccountRepository.findById(bankAccountEntity.getId()).map(bankAccount ->{
            bankAccount.setType(bankAccountEntity.getType());
            bankAccount.setBalance(bankAccountEntity.getBalance());
            return bankAccountRepository.save(bankAccount);
        }).orElseThrow(() -> new ResourceNotFoundException("Bank Account Id "+ bankAccountEntity.getId() + " not found"));

    }

    @Override
    public ResponseEntity<?> deleteBankAccount(Integer userId, BankAccountEntity bankAccountEntity) {
        return bankAccountRepository.findByIdAndUserId(bankAccountEntity.getId(), userId).map( bankAccount ->{
            bankAccountRepository.delete(bankAccountEntity);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Bank Account Not Found with Id "+ bankAccountEntity.getId() + " and User Id "+userId));
    }

}

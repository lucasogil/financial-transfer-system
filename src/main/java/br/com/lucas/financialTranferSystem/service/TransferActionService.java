package br.com.lucas.financialTranferSystem.service;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import br.com.lucas.financialTranferSystem.entity.TransferActionEntity;
import br.com.lucas.financialTranferSystem.entity.TransferTaxTypeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TransferActionService {

    public List<TransferActionEntity> getAllTransactionsByUserId(Integer userId);

    public TransferTaxTypeEntity tranferValueToAccount(TransferActionEntity transferActionEntity);



}

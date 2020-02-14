package br.com.lucas.financialTranferSystem.service.impl;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import br.com.lucas.financialTranferSystem.entity.OperationEntity;
import br.com.lucas.financialTranferSystem.model.OperationInfoForm;
import br.com.lucas.financialTranferSystem.repository.BankAccountRepository;
import br.com.lucas.financialTranferSystem.repository.OperationRepository;
import br.com.lucas.financialTranferSystem.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationRepository operationRepository;

    @Autowired
    private BankAccountRepository bankAccountRepository;


    @Override
    public List<OperationEntity> getAllOperationsByUserId(Integer userId) {
        return this.operationRepository.findByUserId(userId);
    }

    @Override
    public OperationEntity getOperationById(Integer id) {
        return null;
    }

    @Override
    public OperationEntity submitOperation(OperationInfoForm operationInfoForm) {

        Optional<BankAccountEntity> originAccount = this.bankAccountRepository.findById(operationInfoForm.getOriginAccountId());

        OperationEntity operationEntity = new OperationEntity();

        return null;
    }


}

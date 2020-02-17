package br.com.lucas.financial.service.impl;

import br.com.lucas.financial.entity.BankAccountEntity;
import br.com.lucas.financial.entity.OperationEntity;
import br.com.lucas.financial.entity.UserEntity;
import br.com.lucas.financial.model.OperationInfoForm;
import br.com.lucas.financial.repository.BankAccountRepository;
import br.com.lucas.financial.repository.OperationRepository;
import br.com.lucas.financial.service.OperationService;
import br.com.lucas.financial.util.DateUtil;
import br.com.lucas.financial.util.OperationUtil;
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
        Optional<OperationEntity> operationOptional = this.operationRepository.findById(id);
        return operationOptional.orElseGet(OperationEntity::new);
    }

    @Override
    public OperationEntity submitOperation(OperationInfoForm operationInfoForm) {
//
//        Optional<BankAccountEntity> originAccount = this.bankAccountRepository.findById(operationInfoForm.getOriginAccountId());
//        Optional<BankAccountEntity> destinationAccount = this.bankAccountRepository.findById(operationInfoForm.getDestinationAccountId());
//
//        final long daysOperation = DateUtil.getDaysOperation(operationInfoForm.getSchedulingDate());
//
//        try {
//            OperationEntity operation = OperationUtil.applyTaxFeesForOperation(daysOperation, );
//
//        } catch (Exception e ) {
//
//        }
//
//        return this.operationRepository.save(operation);

        return null;
    }


}

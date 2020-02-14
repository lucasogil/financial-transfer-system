package br.com.lucas.financialTranferSystem.service.impl;

import br.com.lucas.financialTranferSystem.entity.OperationEntity;
import br.com.lucas.financialTranferSystem.model.OperationInfoForm;
import br.com.lucas.financialTranferSystem.repository.OperationRepository;
import br.com.lucas.financialTranferSystem.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationRepository repository;

    @Override
    public List<OperationEntity> getAllOperationsByUserId(Integer userId) {
        return this.repository.findByUserId(userId);
    }

    @Override
    public OperationEntity submitOperation(OperationInfoForm operationInfoForm) {

        

        return null;
    }

    @Override
    public OperationEntity getOperationById(Integer id) {
        return null;
    }
}

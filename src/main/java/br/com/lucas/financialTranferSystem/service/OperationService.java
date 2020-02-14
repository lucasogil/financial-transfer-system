package br.com.lucas.financialTranferSystem.service;

import br.com.lucas.financialTranferSystem.entity.OperationEntity;
import br.com.lucas.financialTranferSystem.model.OperationInfoForm;

import java.util.List;

public interface OperationService {

    public List<OperationEntity> getAllOperationsByUserId(Integer userId);

    public OperationEntity submitOperation(OperationInfoForm operationInfoForm);

    public OperationEntity getOperationById(Integer id);



}

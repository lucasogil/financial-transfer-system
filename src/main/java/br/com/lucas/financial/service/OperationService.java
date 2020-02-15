package br.com.lucas.financial.service;

import br.com.lucas.financial.entity.OperationEntity;
import br.com.lucas.financial.model.OperationInfoForm;

import java.util.List;

public interface OperationService {

    public List<OperationEntity> getAllOperationsByUserId(Integer userId);

    public OperationEntity getOperationById(Integer id);

    public OperationEntity submitOperation(OperationInfoForm operationInfoForm);

}

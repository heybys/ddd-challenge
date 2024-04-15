package com.java.dddchallenge.core.application.service;

import com.java.dddchallenge.core.application.persistence.CodePersistenceService;
import com.java.dddchallenge.core.application.model.CodeSaveCommand;
import com.java.dddchallenge.core.domain.Code;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService {

    CodePersistenceService codePersistenceService;

    @Override
    public void save(CodeSaveCommand command) {
        Code code = command.toDomainEntity();

        if (!code.isValid()) throw new IllegalArgumentException();

        codePersistenceService.save(code);
    }
}

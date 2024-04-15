package com.java.dddchallenge.core.infra;

import com.java.dddchallenge.core.application.persistence.CodePersistenceService;
import com.java.dddchallenge.core.domain.Code;
import org.springframework.stereotype.Repository;

@Repository
public class CodePersistenceServiceImpl implements CodePersistenceService {

    CodeJpaRepository codeJpaRepository;

    CodeMapper codeMapper;

    @Override
    public void save(Code code) {
        CodeJpaEntity codeJpaEntity = codeMapper.mapToJpaEntity(code);

        codeJpaRepository.save(codeJpaEntity);
    }
}

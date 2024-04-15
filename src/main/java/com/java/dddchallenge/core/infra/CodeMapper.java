package com.java.dddchallenge.core.infra;

import com.java.dddchallenge.core.domain.Code;

public interface CodeMapper {

    CodeJpaEntity mapToJpaEntity(Code code);

    Code mapToDomainEntity(CodeJpaEntity entity);
}

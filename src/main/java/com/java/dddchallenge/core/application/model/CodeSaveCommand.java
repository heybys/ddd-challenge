package com.java.dddchallenge.core.application.model;

import com.java.dddchallenge.core.domain.Code;
import com.java.dddchallenge.core.domain.GroupCode;
import com.java.dddchallenge.core.domain.GroupCode.GroupCodeId;
import lombok.Value;

@Value
public class CodeSaveCommand {
    Long groupCodeId;

    String code;

    String codeName;

    String codeDescription;

    Integer sort;

    public Code toDomainEntity() {
        return new Code(null, new GroupCodeId(groupCodeId), code, codeName, codeDescription, sort);
    }
}

package com.java.dddchallenge.core.domain;

import com.java.dddchallenge.core.domain.GroupCode.GroupCodeId;
import lombok.NonNull;
import lombok.Value;

@Value
public class Code {

    CodeId id;

    @NonNull
    GroupCodeId groupCodeId;

    @NonNull
    String value;

    @NonNull
    String name;

    String description;

    Integer sort;

    public boolean isValid() {
        return this.sort >= 0;
    }

    @Value
    public static class CodeId {
        Long value;
    }
}

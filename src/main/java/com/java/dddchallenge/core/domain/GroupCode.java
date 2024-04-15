package com.java.dddchallenge.core.domain;

import lombok.Value;

@Value
public class GroupCode {

    GroupCodeId id;

    String value;

    String name;

    String description;

    @Value
    public static class GroupCodeId {
        Long value;
    }
}

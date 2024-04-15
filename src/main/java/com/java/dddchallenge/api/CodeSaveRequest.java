package com.java.dddchallenge.api;

import com.java.dddchallenge.core.application.model.CodeSaveCommand;

public class CodeSaveRequest {

    public CodeSaveCommand toCommand() {
        return new CodeSaveCommand(1L, "", "", "", 0);
    }
}

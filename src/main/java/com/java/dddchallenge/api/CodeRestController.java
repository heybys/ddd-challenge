package com.java.dddchallenge.api;

import com.java.dddchallenge.core.application.model.CodeSaveCommand;
import com.java.dddchallenge.core.application.service.CodeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeRestController {

    CodeService codeService;

    public ResponseEntity<CodeSaveResponse> saveCode(CodeSaveRequest request) {

        CodeSaveCommand command = request.toCommand();

        codeService.save(command);

        CodeSaveResponse response = new CodeSaveResponse();

        return ResponseEntity.ok(response);
    }
}

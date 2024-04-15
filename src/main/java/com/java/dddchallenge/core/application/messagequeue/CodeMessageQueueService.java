package com.java.dddchallenge.core.application.messagequeue;

import com.java.dddchallenge.core.domain.Code;

public interface CodeMessageQueueService {
    void save(Code code);
}

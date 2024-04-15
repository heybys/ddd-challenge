package com.java.dddchallenge.core2.employee.infra;

import com.java.dddchallenge.core2.employee.domain.EmployeeJpaEntity;

public interface EmployeeJpaRepository {

    EmployeeJpaEntity findById(Long employeeId);
}

package com.java.dddchallenge.core2.employee.domain;

import static com.java.dddchallenge.core2.employee.domain.EmployeeStatus.LEAVE;
import static com.java.dddchallenge.core2.employee.domain.EmployeeStatus.NEGOTIATION;
import static com.java.dddchallenge.core2.employee.domain.EmployeeStatus.VACATION;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;

@Getter
public class Employee {

    private static final Integer MAX_SALARY_INCREASE_RATIO = 30;

    String name;

    String employeeNo;

    String departmentNo;

    Long salary;

    EmployeePosition position;

    EmployeeStatus status;

    LocalDate startDate;

    LocalDate endDate;

    public void negotiated() {
        if (List.of(LEAVE, VACATION).contains(status)) {
            throw new IllegalArgumentException();
        }

        this.status = NEGOTIATION;
    }

    public boolean negotiateWith(Employee employee) {
        if (!EmployeePosition.LEADER.equals(position)) throw new IllegalArgumentException();

        Integer salaryIncreaseRatio = calculateSalaryIncreaseRatio(employee.getSalary(), proposedSalary);

        return salaryIncreaseRatio <= MAX_SALARY_INCREASE_RATIO;
    }

    // move to math util
    public Integer calculateSalaryIncreaseRatio(Long fromSalary, Long toSalary) {
        return 0;
    }
}

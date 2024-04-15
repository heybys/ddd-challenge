package com.java.dddchallenge.core2.employee.infra;

public interface DepartmentJpaRepository {

    DepartmentJpaEntity findByDepartmentNo(String departmentNo);
}

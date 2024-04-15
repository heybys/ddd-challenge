package com.java.dddchallenge.core2.employee.service;

import com.java.dddchallenge.core2.employee.domain.Department;
import com.java.dddchallenge.core2.employee.infra.DepartmentJpaEntity;
import com.java.dddchallenge.core2.employee.infra.DepartmentMapper;
import com.java.dddchallenge.core2.employee.infra.DepartmentJpaRepository;
import com.java.dddchallenge.core2.employee.domain.Employee;
import com.java.dddchallenge.core2.employee.domain.EmployeeJpaEntity;
import com.java.dddchallenge.core2.employee.infra.EmployeeMapper;
import com.java.dddchallenge.core2.employee.infra.EmployeeJpaRepository;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeJpaRepository employeeJpaRepository;

    DepartmentJpaRepository departmentJpaRepository;

    EmployeeMapper employeeMapper;

    DepartmentMapper departmentMapper;

    @Override
    public void negotiateSalary(Long employeeId, Long salary) {

        EmployeeJpaEntity employeeJpaEntity = employeeJpaRepository.findById(employeeId);
        Employee employee = employeeMapper.mapToDomainEntity(employeeJpaEntity);

        // better
        // Employee employee = employeeRepository.findById(employeeId);

        employee.negotiated();

        String departmentNo = employee.getDepartmentNo();

        DepartmentJpaEntity departmentJpaEntity = departmentJpaRepository.findByDepartmentNo(departmentNo);
        Department department = departmentMapper.mapToDomainEntity(departmentJpaEntity);

        // better
        // Department department = departmentRepository.findByDepartmentNo(departmentNo);

        Employee leader = department.getLeader();

        boolean success = leader.negotiateWith(employee);

        //

    }
}

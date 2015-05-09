package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Employee;

import java.util.List;

/**
 * Created by Andrei on 5/7/2015.
 */
public interface EmployeeService {
    public List<Employee> findAllEmployees();
    public Employee getEmployee(int employeeId);
    public void deleteEmployee(int employeeId);
    public Employee insertEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
}

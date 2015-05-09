package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.EmployeeDao;
import ro.teamnet.zth.app.domain.Employee;

import java.util.List;

/**
 * Created by Andrei on 5/7/2015.
 */
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findAllEmployees() {
        EmployeeDao dao = new EmployeeDao();
        List<Employee> list = dao.getAllEmployees();
        return list;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return new EmployeeDao().getEmployeeById(employeeId);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        EmployeeDao dao = new EmployeeDao();
        dao.deleteEmployee(dao.getEmployeeById(employeeId));
    }

    @Override
    public Employee insertEmployee(Employee employee) {
        EmployeeDao dao = new EmployeeDao();
        return dao.insertEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        EmployeeDao dao = new EmployeeDao();
        return dao.updateEmployee(employee);
    }
}

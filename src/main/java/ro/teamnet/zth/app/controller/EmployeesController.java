package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Employee;
import ro.teamnet.zth.app.service.EmployeeServiceImpl;

import java.util.List;

/**
 * Created by Andrei on 5/6/2015.
 */
@Controller
@RequestMapping(value = "employees")
public class EmployeesController {

    public EmployeesController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Employee> getAllEmployees() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService.findAllEmployees();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{employeeId}")
    public
    @ResponseBody
    Employee getOneEmployee(@PathVariable("employeeId") int employeeId) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService.getEmployee(employeeId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{employeeId}")
    public void deleteOneEmployee(@PathVariable("employeeId") int employeeId) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.deleteEmployee(employeeId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Employee insertEmployee(@RequestBody Employee employee) {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService.insertEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody
    Employee updateEmployee(@RequestBody Employee employee) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService.updateEmployee(employee);
    }

}

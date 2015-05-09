package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Department;
import ro.teamnet.zth.app.domain.Department;
import ro.teamnet.zth.app.service.DepartmentServiceImpl;

import java.util.List;

/**
 * Created by Andrei on 5/6/2015.
 */
@Controller
@RequestMapping(value="/departments")
public class DepartmentsController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Department> getAllDepartments() {
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        return departmentService.findAllDepartments();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{departmentId}")
    public
    @ResponseBody
    Department getOneDepartment(@PathVariable("departmentId") int departmentId) {
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        return departmentService.getDepartment(departmentId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{departmentId}")
    public void deleteOneDepartment(@PathVariable("departmentId") int departmentId) {
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        departmentService.deleteDepartment(departmentId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Department insertDepartment(@RequestBody Department department) {

        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        return departmentService.insertDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody
    Department updateDepartment(@RequestBody Department department) {
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        return departmentService.updateDepartment(department);
    }
}

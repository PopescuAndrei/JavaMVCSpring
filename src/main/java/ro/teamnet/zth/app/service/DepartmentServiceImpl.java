package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.DepartmentDao;
import ro.teamnet.zth.app.domain.Department;

import java.util.List;

/**
 * Created by Andrei on 5/7/2015.
 */

public class DepartmentServiceImpl implements DepartmentService{

    @Override
    public List<Department> findAllDepartments() {
        DepartmentDao dao = new DepartmentDao();
        List<Department> list = dao.getAllDepartments();
        return list;
    }

    @Override
    public Department getDepartment(int departmentId) {
        return new DepartmentDao().getDepartmentById(departmentId);
    }

    @Override
    public void deleteDepartment(int departmentId) {
        DepartmentDao dao = new DepartmentDao();
        dao.deleteDepartment(dao.getDepartmentById(departmentId));
    }

    @Override
    public Department insertDepartment(Department department) {
        DepartmentDao dao = new DepartmentDao();
        return dao.insertDepartment(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        DepartmentDao dao = new DepartmentDao();
        return dao.updateDepartment(department);
    }
}

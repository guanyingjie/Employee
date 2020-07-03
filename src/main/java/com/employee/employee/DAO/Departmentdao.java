package com.employee.employee.DAO;

import com.employee.employee.pojo.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Departmentdao {
    //模拟数据库 的数据
    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();//创建一个部门表
        departments.put(1,new Department(1,"smart"));
        departments.put(2,new Department(2,"one piece"));
        departments.put(3,new Department(3,"Maybach"));
        departments.put(4,new Department(4,"AMG"));

    }
    //获取所有部门信息
    public Collection<Department> getDepartments(){

        return departments.values();
    }
    //通过ID搜索部门
    public Department getDepartmentById(Integer id){

        return departments.get(id);
    }


}

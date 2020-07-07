package com.employee.employee.DAO;

import com.employee.employee.pojo.Employee;
import com.employee.employee.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Employeedao {
    //模拟数据库数据
    private static Map<Integer,Employee> employees = null;
    @Autowired
    private Departmentdao departmentdao;
    static {
        employees = new HashMap<Integer,Employee>();//创建一个员工表
        employees.put(1,new Employee(1,"AAA","smart"));
        employees.put(2,new Employee(2,"BBB","Maybach"));
        employees.put(3,new Employee(3,"CCC","Maybach"));
    }
    //获得所有员工信息
    public Collection<Employee>getEmployee(){
        return employees.values();
    }
    //通过ID搜索员工信息
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //新增员工
    private static Integer initId = 5;
    public void addEmployee(Employee employee){
            employee.setId(initId++);
            employees.put(employee.getId(),employee);
    }
    //删除员工
    public void deleteEmployee(Integer id){
        employees.remove(id);
    }

}
//    public Employee updateEmployee


package com.employee.employee.controller;

import com.employee.employee.DAO.Departmentdao;
import com.employee.employee.DAO.Employeedao;
import com.employee.employee.pojo.Department;
import com.employee.employee.pojo.Employee;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.Collection;

@Controller
public class EmployeeController {
    //查询所有的员工，调DAO层（或service层）
    @Autowired
    Employeedao employeedao;

    @Autowired
    Departmentdao departmentdao;

    @RequestMapping("/list")
    public String list(Model model){
        Collection<Employee>employees = employeedao.getEmployee();
        model.addAttribute("employee",employees);
        return "list";

    }

    @GetMapping("/addEmployee")
    //查部门信息
    public String selectDeptMessage(Model model){

        Collection<Department>departments = departmentdao.getDepartments();
        model.addAttribute("department",departments);
        return "/addEmployee";
    }
    @PostMapping("/addEmployee")
    public String addEmployee(
            Employee employee){
        //保存员工信息
        System.out.println(employee);
        employeedao.addEmployee(employee);

        return "redirect:/list.html";
    }


}

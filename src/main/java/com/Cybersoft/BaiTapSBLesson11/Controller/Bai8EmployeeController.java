package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai8EmployeeModel;
import com.Cybersoft.BaiTapSBLesson11.Service.Bai8EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class Bai8EmployeeController {

    private final Bai8EmployeeService employeeService;

    public Bai8EmployeeController(Bai8EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bai8EmployeeModel> bai8GetEmployeeById(
            @PathVariable int id) {

        return employeeService.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}
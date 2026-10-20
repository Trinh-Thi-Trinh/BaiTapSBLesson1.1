package com.Cybersoft.BaiTapSBLesson11.Service;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai8EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Bai8EmployeeService {

    private final List<Bai8EmployeeModel> employees = new ArrayList<>();

    public Bai8EmployeeService() {
        employees.add(new Bai8EmployeeModel(1, "Nguyen Van An", "Manager"));
        employees.add(new Bai8EmployeeModel(2, "Tran Thi Binh", "Developer"));
        employees.add(new Bai8EmployeeModel(3, "Le Van Cuong", "Tester"));
    }

    public Optional<Bai8EmployeeModel> getEmployeeById(int id) {
        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst();
    }
}


package com.Cybersoft.BaiTapSBLesson11.Service;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai5StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Bai5StudentService {

    private final List<Bai5StudentModel> students = new ArrayList<>();

    // Them sinh vien
    public Bai5StudentModel addStudent(Bai5StudentModel student) {
        students.add(student);
        return student;
    }

    // Tim sinh vien theo ID
    public Optional<Bai5StudentModel> getStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }
}

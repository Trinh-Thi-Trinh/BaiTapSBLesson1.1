
package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai5StudentModel;
import com.Cybersoft.BaiTapSBLesson11.Service.Bai5StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class Bai5StudentController {

    private final Bai5StudentService studentService;

    public Bai5StudentController(Bai5StudentService studentService) {
        this.studentService = studentService;
    }

    // POST /students
    // Them sinh vien tu JSON
    @PostMapping
    public ResponseEntity<Bai5StudentModel> addStudent(
            @RequestBody Bai5StudentModel student) {

        Bai5StudentModel savedStudent =
                studentService.addStudent(student);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedStudent);
    }

    // GET /students/{id}
    // Tim sinh vien theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Bai5StudentModel> getStudentById(
            @PathVariable int id) {

        return studentService.getStudentById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

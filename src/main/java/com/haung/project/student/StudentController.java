package com.haung.project.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>();

    @GetMapping(path = "/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping(path = "/student/{id}/{name}/{grade}")
    public void addStudent(@PathVariable Integer id, @PathVariable String name, @PathVariable Integer grade) {
        Student student = new Student(id, name, grade);
        students.add(student);
    }

    @GetMapping(path = "/topgrade")
    public Student getTopGrade() {

        Student studentWithHighestGrade = new Student(1, "random", 0);
        for (int i = 0 ; i < students.size() ; i = i + 1) {
            Student thisStudent = students.get(i);
            if (thisStudent.getGrade() > studentWithHighestGrade.getGrade()) {
                studentWithHighestGrade = thisStudent;
            }
        }
        return studentWithHighestGrade;
    }

    @GetMapping(path = "/fizzbuzz/{n}")
    public void fizzbuzz(@PathVariable Integer n) {
        for (int i = 1 ; i <= n ; i++ ){
           if (i % 3 == 0){
               System.out.print("fizz");

           }
           if (i % 5 == 0){
               System.out.print("buzz");

           }
           if (i % 3 != 0 && i % 5 != 0){
               System.out.print(i);

           }
           System.out.println();
        }
    }
}

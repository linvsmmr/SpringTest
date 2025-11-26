package com.eunbi.springtest.jpa.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/jpa/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/lombok")
    @ResponseBody
    public Student lombokTest() {
//        Student student = new Student(3,"김인규","010-1111-2222","inkyu@gmail.com", "개발자", LocalDateTime.now(), LocalDateTime.now());
        Student student = Student.builder()
                .name("김인규")
                .email("hagulu@gmail.com")
                .phoneNumber("010-1111-2222")
                .dreamJob("개발자")
                .build();
        return student;

    }

    @ResponseBody
    @GetMapping("/add")
    public Student addStudent() {

        Student student = studentService.createStudent("김인규", "010-1111-2222", "lecture@gm.com", "개발자");

        return student;

    }


    @ResponseBody
    @GetMapping("/modify")
    public Student modifyStudent() {

        Student student = studentService.updateStudent(3,"강사");

        return student;
    }



    @ResponseBody
    @GetMapping("/remove")
    public String removeStudent() {
        studentService.deleteStudent(2);

        return "삭제 성공";
    }




}

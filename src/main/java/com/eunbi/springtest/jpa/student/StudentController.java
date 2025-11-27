package com.eunbi.springtest.jpa.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/jpa/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    // 경고: 절대 컨트롤러에서 레퍼지토리 객체를 활용하지 않는다.
    // 다만 코드 작성 편의를 위해 임시로 활용

    @Autowired
    private StudentRepository studentRepository;

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


    @ResponseBody
    @GetMapping("/find")
    public List<Student>  findStudent() {
        // 모든 행 조회

        List<Student> studentList = null;
//        studentRepository.findAll();
//        studentList = studentRepository.findByName("김인규");
//        studentList = studentRepository.findBtOrderByIdDesc();
//        studentList = studentRepository.findTop2ByNameOrderByIdDesc("김인규");

        List<String> nameList = new ArrayList<>();

        nameList.add("유재석");
        nameList.add("김인규");

//        studentList = studentRepository.findByNameIn(nameList);
        studentList = studentRepository.selectByDreamJob("강사");


        return studentList;
    }






}

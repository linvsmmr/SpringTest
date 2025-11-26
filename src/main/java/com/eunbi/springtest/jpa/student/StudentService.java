package com.eunbi.springtest.jpa.student;

import com.eunbi.springtest.mybatis.test01.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student createStudent(String name,
                                 String phoneNumber,
                                 String email,
                                 String dreamJob) {


        Student student = Student.builder()
                .name(name)
                .phoneNumber(phoneNumber)
                .email(email)
                .dreamJob(dreamJob)
                .build();


        Student result = studentRepository.save(student);

        return result;

    }

    public Student updateStudent(int id, String dreamJob) {

        // optional : null일 가능성이 있는 객체를 감쌈
        // 그러므로 nullPointerException의 위험을 줄일 수 있어서 null일 수 있는 객체를 리턴하는 메서드에서 리턴 타입으로 활용됨
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            //null 이 아닌 경우를 뜻함
            Student student = optionalStudent.get();

            student = student.toBuilder().dreamJob(dreamJob).build();

            Student result = studentRepository.save(student);

            return result;

        } else {
            // null 인 경우를 뜻함
            return null;
        }

    }

    public void deleteStudent(int id) {

        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            studentRepository.delete(student);
        } else {

        }



    }

}

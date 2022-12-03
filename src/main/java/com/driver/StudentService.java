package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    static
    StudentRepository studentRepository;
public static void addTeacher(Teacher teacher){
studentRepository.saveTeacher(teacher);
}
public static void addStudent(Student student){
    studentRepository.saveStudent(student);
}
public static void addStudentTeacher(String student, String teacher){
    StudentRepository.saveTeacherStudent(student,teacher);
}
public static Student findStudent(String name){
    return StudentRepository.findAllStudent(name);

}
public static Teacher findTeacher(String name){
    return StudentRepository.findTeacher(name);
}

public static List<String> getStudentTeacher(String teacher){
return StudentRepository.findStudentTeacher(teacher);
}
public static List<String> getAll(){
    return StudentRepository.findAll();
}

public static void deleteTeacher(String teacher){
StudentRepository.deleteTeacher(teacher);
}

public static void deleteAll(){
    StudentRepository.deleteAllTeacher();


}

}

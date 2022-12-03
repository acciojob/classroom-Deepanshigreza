package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class StudentRepository {

private static HashMap<String,Teacher> teacherHashMap=new HashMap<String,Teacher>();
private static HashMap<String,Student> studentHashMap=new HashMap<String,Student>();
private static HashMap<String, List<String>> studentTeacherMap=new HashMap<String, List<String>>();

public static void saveTeacher(Teacher teacher ){
    teacherHashMap.put(teacher.getName(),teacher);
}
public static void saveStudent(Student student){
    studentHashMap.put(student.getName(),student);
}
public static void saveTeacherStudent(String student,String teacher){
if(studentHashMap.containsKey(student) && teacherHashMap.containsKey(teacher)){
    List<String> studentsList=new ArrayList<>();
    if(studentTeacherMap.containsKey(teacher)) studentsList=studentTeacherMap.get(teacher);
    studentsList.add(student);
    studentTeacherMap.put(teacher,studentsList);

}
}
public static Student findAllStudent(String name){
    return studentHashMap.get(name);
}
public static Teacher findTeacher(String name){
    return teacherHashMap.get(name);
}

public static List<String> findStudentTeacher(String teacher ){
List StudentTeacherList=new ArrayList<>();
if(studentTeacherMap.containsKey(teacher)) StudentTeacherList=studentTeacherMap.get(teacher);
    return StudentTeacherList;
}
public static List<String> findAll(){
return new ArrayList<>(studentHashMap.keySet());
}
public static void deleteTeacher(String teacher){
List<String> teacherll=new ArrayList();
if(studentTeacherMap.containsKey(teacher)){
    teacherll=studentTeacherMap.get(teacher);
    for (String teachers:teacherll){
        if(studentHashMap.containsKey(teachers)){
            studentHashMap.remove(teachers);
        }
    }
}

}
    public static void deleteAllTeacher(){
        HashSet<String> teachersSet=new HashSet<>();
        for(String teachers:studentTeacherMap.keySet()){
            for(String students:studentTeacherMap.get(teachers)){
                teachersSet.add(students);
            }
        }
        for(String student:teachersSet){
            if(studentHashMap.containsKey(student)){
                studentHashMap.remove(student);

            }
        }
    }


}

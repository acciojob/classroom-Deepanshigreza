package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

private HashMap<String,Teacher> teacherHashMap=new HashMap<String,Teacher>();
private HashMap<String,Student> studentHashMap=new HashMap<String,Student>();
private HashMap<String, List<String>> studentTeacherMap=new HashMap<String, List<String>>();

}

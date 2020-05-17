package com.group29.srs.services;

import com.group29.srs.model.StudentInfo;
import com.group29.srs.model.TakenCourses;
import com.group29.srs.model.WeeklySchedule;
import com.group29.srs.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public List<StudentInfo> getStudentInfoById(Long id){
        return studentRepository.getStudentInfoById(id);
    }

    public void insertStudent(long id, String firstname, String lastname, String mail, String password, String address, String gender, String birthday, String phone_number, String dept_code){
        studentRepository.insertStudent(id,firstname,lastname,mail,password,address,gender,birthday,phone_number, dept_code);
    }

    public List<WeeklySchedule> getStudentWeeklySchedule(Long id, String semester, int year ){
        return studentRepository.getStudentWeeklySchedule(id, semester , year);
    }

    public List<TakenCourses> getTakenCourses(Long id, String semester, int year ){
        return studentRepository.getTakenCourses(id, semester , year);
    }
}

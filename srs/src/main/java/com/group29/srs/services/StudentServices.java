package com.group29.srs.services;

import com.group29.srs.model.*;
import com.group29.srs.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<ButtonName> getButtonNames(Long id, String semester, int year ){
        return studentRepository.getButtonNames(id, semester , year);
    }

    public ArrayList<ArrayList<Grades>> getGrades(String semester,long student_id, int year){
        List<Grades> grades = studentRepository.getGrades(semester ,student_id, year );
        ArrayList<ArrayList<Grades>> course_grades =  new ArrayList<ArrayList<Grades>>();
        String current_course = "";
        int current_counter = -1;
        for (int i=0; i<grades.size(); i++){
            if (!current_course.equals(grades.get(i).getCoursename())){
                course_grades.add(new ArrayList<>());
                current_counter++;
                current_course = grades.get(i).getCoursename();
            }
            course_grades.get(current_counter).add(grades.get(i));
        }

        return course_grades;
    }

    public void updateStudent(long user_id, String password, String mail, String firstname, String lastname,
                              String address, String date_of_birth, String phone_number){
        studentRepository.updateStudent(user_id, password, mail, firstname, lastname, address, date_of_birth, phone_number);
    }
}

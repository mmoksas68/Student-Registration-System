package com.group29.srs.services;

import com.group29.srs.model.*;
import com.group29.srs.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<StudentInfo> getStudentInfoById(Long id){
        return studentRepository.getStudentInfoById(id);
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

    public int insertStudent(StudentRegister studentRegister){
        String encrypted = passwordEncoder.encode(studentRegister.getPassword());

        return studentRepository.insertStudent(studentRegister.getFirstname(), studentRegister.getLastname(), studentRegister.getMail(),
                                        encrypted, studentRegister.getAddress(), studentRegister.getGender(), studentRegister.getBirthday(),
                                        studentRegister.getPhone_number(), "CS", "student");
    }

    public List<Exchange_School> getExchangeInfoById(Long id) {
        return studentRepository.getExchangeInfoById(id);
    }

    public List<AvailableCourse> getAvailableCourses(long course_id){
        return studentRepository.getAvailableCourses(course_id);
    }

    public List<StudentRegistration> getRegistrableCourses(long student_id){
        return studentRepository.getRegistrableCourses(student_id);
    }

    public void applyExchange(long student_id, ExchangeApplication exchangeApplication){

        List<Exchange_School> schoolInfo = studentRepository.getAppliedSchoolID(student_id, exchangeApplication.getSchoolName1(), exchangeApplication.getSchoolSemester1());
        List<Exchange_School> schoolInfo1 = studentRepository.getAppliedSchoolID(student_id, exchangeApplication.getSchoolName2(), exchangeApplication.getSchoolSemester2());
        List<Exchange_School> schoolInfo2 = studentRepository.getAppliedSchoolID(student_id, exchangeApplication.getSchoolName3(), exchangeApplication.getSchoolSemester3());



        studentRepository.insertAppliedSchool(student_id, schoolInfo.get(0).getSchool_id(), exchangeApplication.getSchoolSemester1());
        studentRepository.insertAppliedSchool(student_id, schoolInfo1.get(0).getSchool_id(), exchangeApplication.getSchoolSemester1());
        studentRepository.insertAppliedSchool(student_id, schoolInfo2.get(0).getSchool_id(), exchangeApplication.getSchoolSemester1());

    }

    public void registerCourse(long student_id, long course_id, long section_id, int year, String semester){
        studentRepository.registerCourse(student_id, course_id, section_id, year, semester);
    }

    public void dropCourse(long student_id, long course_id, long section_id){
        studentRepository.dropCourse(student_id, course_id, section_id);
    }
}

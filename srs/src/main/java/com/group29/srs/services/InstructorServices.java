package com.group29.srs.services;

import com.group29.srs.model.InstructorGivenCourses;
import com.group29.srs.model.Ta_InstructorInfo;
import com.group29.srs.model.WeeklySchedule;
import com.group29.srs.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServices {
    @Autowired
    InstructorRepository instructorRepository;

    public List<InstructorGivenCourses> getTakenCourses(Long id, String semester, int year ){
        return instructorRepository.getInstructorGivenCourses(id, semester , year);
    }

    public List<Ta_InstructorInfo> getInstructorInfoById(Long id){
        return instructorRepository.getInstructorInfoById(id);
    }

    public void insertInstructor(long id, String firstname, String lastname, String mail, String password, String office_no, String office_hours, String phone_number, String dept_code){
        instructorRepository.insertInstructor(id, firstname, lastname, mail, password, office_no, office_hours,phone_number,dept_code);
    }

    public List<WeeklySchedule> getInstructorWeeklySchedule(Long id, String semester, int year ){
        return instructorRepository.getInstructorWeeklySchedule(id, semester , year);
    }
}

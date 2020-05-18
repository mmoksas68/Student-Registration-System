package com.group29.srs.services;

import com.group29.srs.model.*;
import com.group29.srs.repository.TeachingAssistantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeachingAssistantServices {
    @Autowired
    TeachingAssistantRepository teachingAssistantRepository;

    public List<TeachingAssistantGivenCourses> getTeachingAssistantGivenCourses(Long id, String semester, int year ){
        return teachingAssistantRepository.getTeachingAssistantGivenCourses(id, semester , year);
    }

    public List<Ta_InstructorInfo> getTeachingAssistantInfoById(Long id){
        return teachingAssistantRepository.getTeachingAssistantInfoById(id);
    }

    public void insertInstructor(long id, String firstname, String lastname, String mail, String password, String office_no, String office_hours, String phone_number, String dept_code){
        teachingAssistantRepository.insertTeachingAssistant(id, firstname, lastname, mail, password, office_no, office_hours,phone_number, dept_code);
    }

    public List<WeeklySchedule> getTeachingAssistantWeeklySchedule(Long id, String semester, int year ){
        return teachingAssistantRepository.getTeachingAssistantWeeklySchedule(id, semester , year);
    }

    public List<AssignmentGrades> getStudents(long section_id, long course_id,String semester, int year){
        return teachingAssistantRepository.getStudents(section_id,course_id,semester,year);
    }

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return teachingAssistantRepository.getButtonNames( id, semester, year);
    }

    public void setStudentGrades(long assignment_id, String title, String type, String date,
                                 Double average, Long course_id, Long section_id, int grade,Long student_id){
         teachingAssistantRepository.setStudentGrades(assignment_id,title,type,date,
                 average, course_id, section_id, grade,student_id);
    }
}

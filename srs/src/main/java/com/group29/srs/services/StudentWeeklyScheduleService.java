package com.group29.srs.services;


import com.group29.srs.model.WeeklySchedule;
import com.group29.srs.repository.StudentWeeklyScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentWeeklyScheduleService {
    @Autowired
    StudentWeeklyScheduleRepository studentWeeklyScheduleRepository;

    public List<WeeklySchedule> getStudentWeeklySchedule(Long id, String semester, int year ){
        return studentWeeklyScheduleRepository.getStudentWeeklySchedule(id, semester , year);
    }
}
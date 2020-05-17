package com.group29.srs.services;


import com.group29.srs.model.WeeklySchedule;
import com.group29.srs.repository.InstructorWeeklyScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorWeeklyScheduleService {
    @Autowired
    InstructorWeeklyScheduleRepository instructorWeeklyScheduleRepository;

    public List<WeeklySchedule> getInstructorWeeklySchedule(Long id, String semester, int year ){
        return instructorWeeklyScheduleRepository.getInstructorWeeklySchedule(id, semester , year);
    }
}
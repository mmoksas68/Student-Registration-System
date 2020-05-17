package com.group29.srs.services;


import com.group29.srs.model.WeeklySchedule;
import com.group29.srs.repository.TeachingAssistantWeeklyScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingAssistantWeeklyScheduleService {
    @Autowired
    TeachingAssistantWeeklyScheduleRepository teachingAssistantWeeklyScheduleRepository;

    public List<WeeklySchedule> getTeachingAssistantWeeklySchedule(Long id, String semester, int year ){
        return teachingAssistantWeeklyScheduleRepository.getTeachingAssistantWeeklySchedule(id, semester , year);
    }
}
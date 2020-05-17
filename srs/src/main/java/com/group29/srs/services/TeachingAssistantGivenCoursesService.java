package com.group29.srs.services;


import com.group29.srs.model.TeachingAssistantGivenCourses;
import com.group29.srs.repository.TeachingAssistantGivenCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingAssistantGivenCoursesService {
    @Autowired
    TeachingAssistantGivenCoursesRepository teachingAssistantGivenCoursesRepository;

    public List<TeachingAssistantGivenCourses> getTeachingAssistantGivenCourses(Long id, String semester, int year ){
        return teachingAssistantGivenCoursesRepository.getTeachingAssistantGivenCourses(id, semester , year);
    }
}
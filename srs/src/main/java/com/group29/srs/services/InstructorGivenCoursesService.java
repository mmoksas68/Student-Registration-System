package com.group29.srs.services;


import com.group29.srs.model.InstructorGivenCourses;
import com.group29.srs.repository.InstructorGivenCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorGivenCoursesService {
    @Autowired
    InstructorGivenCoursesRepository instructorGivenCoursesRepository;

    public List<InstructorGivenCourses> getTakenCourses(Long id, String semester, int year ){
        return instructorGivenCoursesRepository.getInstructorGivenCourses(id, semester , year);
    }
}
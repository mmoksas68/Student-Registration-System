package com.group29.srs.services;


import com.group29.srs.model.TakenCourses;
import com.group29.srs.repository.TakenCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakenCoursesService {
    @Autowired
    TakenCoursesRepository takenCoursesRepository;

    public List<TakenCourses> getTakenCourses(Long id, Enum semester,int year ){
        return takenCoursesRepository.getTakenCourses(id, semester , year);
    }
}
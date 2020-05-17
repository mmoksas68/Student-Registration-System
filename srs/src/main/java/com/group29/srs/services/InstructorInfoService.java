package com.group29.srs.services;

import com.group29.srs.model.Ta_InstructorInfo;
import com.group29.srs.repository.InstructorInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorInfoService {
    @Autowired
    InstructorInfoRepository instructorInfoRepository;
    public List<Ta_InstructorInfo> getInstructorInfoById(Long id){
        return instructorInfoRepository.getInstructorInfoById(id);
    }
}
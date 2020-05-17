package com.group29.srs.services;

import com.group29.srs.model.Ta_InstructorInfo;
import com.group29.srs.repository.TeachingAssistantInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingAssistantInfoService {
    @Autowired
    TeachingAssistantInfoRepository teachingAssistantInfoRepository;
    public List<Ta_InstructorInfo> getTeachingAssistantInfoById(Long id){
        return teachingAssistantInfoRepository.getTeachingAssistantInfoById(id);
    }
}
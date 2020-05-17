package com.group29.srs.services;

import com.group29.srs.model.StudentInfo;
import com.group29.srs.repository.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoService {
    @Autowired
    StudentInfoRepository studentInfoRepository;

    public List<StudentInfo> getStudentInfoById(Long id){
        return studentInfoRepository.getStudentInfoById(id);
    }
}
package com.group29.srs.services;



import com.group29.srs.repository.StudentSubmitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class StudentSubmitService {
    @Autowired
    StudentSubmitRepository studentSubmitRepository;

    public void insertStudent(long id, String firstname, String lastname, String mail, String password, String address, String gender, Date birthday, String phone_number){
        studentSubmitRepository.insertStudent(id,firstname,lastname,mail,password,address,gender,birthday,phone_number);
    }
}
package com.group29.srs.services;



import com.group29.srs.repository.InstructorSubmitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorSubmitService {
    @Autowired
    InstructorSubmitRepository instructorSubmitRepository;

    public void insertInstructor(long id, String firstname, String lastname, String mail, String password, String office_no, String office_hours, String phone_number, String dept_code){
        instructorSubmitRepository.insertInstructor(id, firstname, lastname, mail, password, office_no, office_hours,phone_number,dept_code);
    }
}
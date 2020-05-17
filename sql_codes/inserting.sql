SELECT * FROM student_system.User;
SELECT * FROM student_system.Student;
SELECT * FROM student_system.Instructor;
SELECT * FROM student_system.Has;


# USER
Insert into User (user_id, firstname, lastname, mail, password) values (2375, "Doğukan", "Köse", "d.kose@ug.bilkent.edu.tr", "dogukan123");
Insert into User (user_id, firstname, lastname, mail, password) values (1289, "Serkan", "Delil", "serkan.delil@ug.bilkent.edu.tr", "serkan123");
Insert into User (user_id, firstname, lastname, mail, password) values (2251, "Çağrı", "Güngör", "cagri.gungor@ug.bilkent.edu.tr", "cagri123");
Insert into User (user_id, firstname, lastname, mail, password) values (2984, "Muhammed Musab", "Okşaş", "m.oksas@ug.bilkent.edu.tr", "musab123");

Insert into User (user_id, firstname, lastname, mail, password) values (4000, "Özgür", "Ulusoy", "oulusoy@cs.bilkent.edu.tr", "ozgur123");
Insert into User (user_id, firstname, lastname, mail, password) values (4001, "Uğur", "Güdükbay", "gudukbay@cs.bilkent.edu.tr", "ugur123");

Insert into User (user_id, firstname, lastname, mail, password) values (3000, "Mustafa", "Çavdar", "mustafa.cavdar@ug.bilkent.edu.tr", "mustafa123");
Insert into User (user_id, firstname, lastname, mail, password) values (3001, "Duygu", "Durmuş", "duygu.durmus@ug.bilkent.edu.tr", "duygu123");


# STUDENT
Insert into Student (student_id, address, gpa, cpga, erasmus_application_point, gender, date_of_birth, current_semester) values (2375, "Eşme/Uşak Cumhuriyet Mah. Mustafa Kemal Cad. No79", 3.48, 3.68, 50, "Male", '1998-01-06', 5);
Insert into Student (student_id, address, gpa, cpga, erasmus_application_point, gender, date_of_birth, current_semester) values (1289, "İzmir", 3.45, 3.64, 68.32, "Male", '1997-01-08', 6);
Insert into Student (student_id, address, gpa, cpga, erasmus_application_point, gender, date_of_birth, current_semester) values (2251, "Samsun", 3.50, 3.70, 65.30, "Male", '1998-01-07', 5);
Insert into Student (student_id, address, gpa, cpga, erasmus_application_point, gender, date_of_birth, current_semester) values (2984, "Aksaray", 3.82, 3.80, 80.30, "Male", '1998-01-09', 5);

# D_member
Insert into D_Member values (2375, "CS");
Insert into D_Member values (1289, "CS");
Insert into D_Member values (2251, "CS");
Insert into D_Member values (2984, "CS");

# INSTRUCTOR
Insert into Instructor values (4000, "G17","Wednesday 13:40-15:30");
Insert into Instructor values (4001, "EA403","Wednesday 9:40-10:30");

# TA
Insert into TeachingAssistant values (3000, "EA405","Tuesday 13:40-15:30");
Insert into TeachingAssistant values (3001, "EA405","Tuesday 13:40-15:30");

# Task
Insert into Task values (1, "Homework 1");
Insert into Task values (2, "Project Proposal");

# Authorizes
Insert into Authorizes values(1, 4000, 3000);
Insert into Authorizes values(2, 4001, 3000);

# Department
Insert into Department values ("CS", "EA 4th Floor", "Computer Science");
Insert into Department values ("ME",  "EA 3rd Floor", "Mechanical Engineering");
Insert into Department values ("IE",  "EA 2nd Floor", "Industrial Engineering");
Insert into Department values ("EEE",  "EE", "Electrical And Electronics Engineering");

## Course
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (1, "CS353", "Database Systems", 3,"CS", 4000);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (2, "CS478", "Computational Geometry", 3,"CS", 4001);

# Assits
Insert into Assists values (3000, 1);
Insert into Assists values (3000, 2);
Insert into Assists values (3001, 1);

# Section 
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (1, 1, "EB104", 1, "spring", "2020", 5, 30, 4000);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (1, 2, "EE04", 2, "spring", "2020", 0, 20, 4001);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (2, 3, "EE03", 1, "spring", "2020", 3, 50, 4001);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (2, 4, "EA102", 2, "spring", "2020", 0, 40, 4000);

# TimeSlot
Insert into TimeSlot values (1, '08:40:00', '10:30:00', 'mon');
Insert into TimeSlot values (2, '10:40:00', '12:30:00', 'wed');
Insert into TimeSlot values (3, '13:40:00', '15:30:00', 'tue');
Insert into TimeSlot values (4, '15:40:00', '17:30:00', 'thu');
Insert into TimeSlot (start_time, end_time, start_day) values ('15:40:00', '17:30:00', 'fri');


# Has
Insert into Has values (1, 1, 1);
Insert into Has values (2, 1, 2);
Insert into Has values (3, 2, 3);
Insert into Has values (4, 2, 4);
Insert into Has values (4, 1, 1);
Insert into Has values (5, 1, 2);

# Scheduled Exam
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (1,'2020-05-17 18:00:00', "CS353 Midterm Exam", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (2,'2020-06-17 17:30:00', "CS478 Final", "17:30-19:30");

# Includes 
Insert into Includes (exam_id, course_id, section_id) values (1, 1, 1);
Insert into Includes (exam_id, course_id, section_id) values (1, 1, 2);
Insert into Includes (exam_id, course_id, section_id) values (2, 2, 3);
Insert into Includes (exam_id, course_id, section_id) values (2, 2, 4);


# classrooms
Insert into Classrooms (exam_id, classroom) values (1, "EB101");
Insert into Classrooms (exam_id, classroom) values (1, "EB102");
Insert into Classrooms (exam_id, classroom) values (1, "EB103");
Insert into Classrooms (exam_id, classroom) values (1, "EB104");
Insert into Classrooms (exam_id, classroom) values (2, "EE04");
Insert into Classrooms (exam_id, classroom) values (2, "EE02");
Insert into Classrooms (exam_id, classroom) values (2, "EE03");

# Assignment


# Contains


# Teaches


# Takes
Insert into Takes (s_id, course_id, section_id, year, semester) values (2251, 1, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2251, 2, 3, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2375, 1, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2375, 2, 3, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (1289, 1, 2, "98", 'A',2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (1289, 2, 4, "70", 'A-',2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (2984, 1, 1, "60", 'B+', 2019, 'spring');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (2984, 2, 3, "80", 'A-', 2019, 'spring');

# Attendance 


# Result


# Prereq


# Curriculum


# Phone



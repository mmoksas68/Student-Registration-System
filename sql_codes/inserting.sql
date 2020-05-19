SELECT * FROM student_system.User;
SELECT * FROM student_system.Student;
SELECT * FROM student_system.Instructor;
SELECT * FROM student_system.Has;
    

# USER
Insert into User (user_id, firstname, lastname, mail, password, role) values (2375, "Doğukan", "Köse", "d.kose@ug.bilkent.edu.tr", "dogukan123", 'student');
Insert into User (user_id, firstname, lastname, mail, password, role) values (1289, "Serkan", "Delil", "serkan.delil@ug.bilkent.edu.tr", "serkan123", 'student');
Insert into User (user_id, firstname, lastname, mail, password, role) values (2251, "Çağrı", "Güngör", "cagri.gungor@ug.bilkent.edu.tr", "cagri123", 'student');
Insert into User (user_id, firstname, lastname, mail, password, role) values (2984, "Muhammed Musab", "Okşaş", "m.oksas@ug.bilkent.edu.tr", "musab123", 'student');

Insert into User (user_id, firstname, lastname, mail, password, role) values (4000, "Özgür", "Ulusoy", "oulusoy@cs.bilkent.edu.tr", "ozgur123", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (4001, "Uğur", "Güdükbay", "gudukbay@cs.bilkent.edu.tr", "ugur123", 'instructor');

Insert into User (user_id, firstname, lastname, mail, password, role) values (3000, "Mustafa", "Çavdar", "mustafa.cavdar@ug.bilkent.edu.tr", "mustafa123", 'ta');
Insert into User (user_id, firstname, lastname, mail, password, role) values (3001, "Duygu", "Durmuş", "duygu.durmus@ug.bilkent.edu.tr", "duygu123", 'ta');

Insert into User (user_id, firstname, lastname, mail, password, role) values (9999, "admin", "adminoglu", "admin@bilkent.com", "admin123", 'admin');

# STUDENT
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (2375, "Eşme/Uşak Cumhuriyet Mah. Mustafa Kemal Cad. No79", 3.48, 3.68, 50, "Male", '1998-01-06', 5);
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (1289, "İzmir", 3.45, 3.64, 68.32, "Male", '1997-01-08', 6);
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (2251, "Samsun", 3.50, 3.70, 65.30, "Male", '1998-01-07', 5);
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (2984, "Aksaray", 3.82, 3.80, 80.30, "Male", '1998-01-09', 5);

# D_member
Insert into D_Member values (2375, "CS");
Insert into D_Member values (1289, "CS");
Insert into D_Member values (2251, "CS");
Insert into D_Member values (2984, "CS");
Insert into D_Member values (4000, "CS");
Insert into D_Member values (4001, "CS");
Insert into D_Member values (3000, "CS");
Insert into D_Member values (3001, "CS");

# INSTRUCTOR
Insert into Instructor values (4000, "G17","Wednesday 13:40-15:30");
Insert into Instructor values (4001, "EA403","Wednesday 9:40-10:30");

# Administrive Unit
Insert into Administrative_Unit (admin_id, office_no) values (9999, "BBC");

# Phone
Insert into Phone (phone_id, phone_number) values  (2375, "05006669988");
Insert into Phone (phone_id, phone_number) values  (1289, "05007775544");
Insert into Phone (phone_id, phone_number) values  (2251, "05005554433");
Insert into Phone (phone_id, phone_number) values  (2984, "05003332211");
Insert into Phone (phone_id, phone_number) values  (4000, "05003332266");
Insert into Phone (phone_id, phone_number) values  (4001, "05003332277");
Insert into Phone (phone_id, phone_number) values  (3001, "05003332299");
Insert into Phone (phone_id, phone_number) values  (3000, "05003332200");

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
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (1, '08:40:00', '09:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (2, '09:40:00', '10:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (3, '10:40:00', '11:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (4, '11:40:00', '12:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (5, '13:40:00', '14:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (6, '14:40:00', '15:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (7, '15:40:00', '16:30:00', 'mon');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (8, '16:40:00', '17:30:00', 'mon');

Insert into TimeSlot (time_id, start_time, end_time, start_day) values (9, '08:40:00', '09:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (10, '09:40:00', '10:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (11, '10:40:00', '11:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (12, '11:40:00', '12:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (13, '13:40:00', '14:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (14, '14:40:00', '15:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (15, '15:40:00', '16:30:00', 'tue');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (16, '16:40:00', '17:30:00', 'tue');

Insert into TimeSlot (time_id, start_time, end_time, start_day) values (17, '08:40:00', '09:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (18, '09:40:00', '10:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (19, '10:40:00', '11:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (20, '11:40:00', '12:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (21, '13:40:00', '14:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (22, '14:40:00', '15:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (23, '15:40:00', '16:30:00', 'wed');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (24, '16:40:00', '17:30:00', 'wed');

Insert into TimeSlot (time_id, start_time, end_time, start_day) values (25, '08:40:00', '09:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (26, '09:40:00', '10:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (27, '10:40:00', '11:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (28, '11:40:00', '12:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (29, '13:40:00', '14:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (30, '14:40:00', '15:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (31, '15:40:00', '16:30:00', 'thu');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (32, '16:40:00', '17:30:00', 'thu');

Insert into TimeSlot (time_id, start_time, end_time, start_day) values (33, '08:40:00', '09:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (34, '09:40:00', '10:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (35, '10:40:00', '11:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (36, '11:40:00', '12:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (37, '13:40:00', '14:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (38, '14:40:00', '15:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (39, '15:40:00', '16:30:00', 'fri');
Insert into TimeSlot (time_id, start_time, end_time, start_day) values (40, '16:40:00', '17:30:00', 'fri');

# Has
Insert into Has values (1, 1, 1);
Insert into Has values (2, 1, 1);
Insert into Has values (17, 1, 1);

Insert into Has values (13, 1, 2);
Insert into Has values (14, 1, 2);
Insert into Has values (33, 1, 2);

Insert into Has values (23, 2, 3);
Insert into Has values (24, 2, 4);


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

# Assignment  #burada aggregation.avg kullanılacak
Insert into Assignment (title, date, type) values ("DB Proposal", "2020-04-15", "Project");
Insert into Assignment (title, date, type) values ("DB Design", "2020-05-15", "Project");
Insert into Assignment (title, date, type) values ("DB Lab 1 ", "2020-03-12", "Lab");
Insert into Assignment (title, date, type) values ("DB Quiz 1 ", "2020-04-12", "Quiz");
Insert into Assignment (title, date, type) values ("DB HW1 ", "2020-03-14", "Homework");

# Contains
Insert into Contains (assignment_id, course_id, section_id) values (1, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (1, 1, 2);
Insert into Contains (assignment_id, course_id, section_id) values (2, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (2, 1, 2);
Insert into Contains (assignment_id, course_id, section_id) values (3, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (3, 1, 2);
Insert into Contains (assignment_id, course_id, section_id) values (4, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (4, 1, 2);
Insert into Contains (assignment_id, course_id, section_id) values (5, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (5, 1, 2);

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
Insert into Result (student_id, assignment_id, grade) values (2375, 1, 98);
Insert into Result (student_id, assignment_id, grade) values (2375, 2, 70);
Insert into Result (student_id, assignment_id, grade) values (2375, 3, 50);
Insert into Result (student_id, assignment_id, grade) values (2375, 4, 30);
Insert into Result (student_id, assignment_id, grade) values (2375, 5, 60);
Insert into Result (student_id, assignment_id, grade) values (2251, 1, 90);
Insert into Result (student_id, assignment_id, grade) values (2251, 2, 100);
Insert into Result (student_id, assignment_id, grade) values (2251, 3, 80);
Insert into Result (student_id, assignment_id, grade) values (2251, 4, 75);
Insert into Result (student_id, assignment_id, grade) values (2251, 5, 50);

# Prereq

# Curriculum

# car sticker
Insert into Car_Sticker (sticker_id, plate_no, start_date, end_date, car_type, driver_licence_no, penalty_point) values (1, "64AAZ584", "2019-8-15", "2020-8-15", "Polo", "44332211", 0);






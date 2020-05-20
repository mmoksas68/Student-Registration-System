#student
Insert into User (user_id, firstname, lastname, mail, password, role) values (2375, "Dogukan", "Kose", "d.kose@ug.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'student');
Insert into User (user_id, firstname, lastname, mail, password, role) values (1289, "Serkan", "Delil", "serkan.delil@ug.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'student');
Insert into User (user_id, firstname, lastname, mail, password, role) values (2251, "Cagri", "Gungor", "cagri.gungor@ug.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'student');
Insert into User (user_id, firstname, lastname, mail, password, role) values (2984, "Muhammed Musab", "Oksas", "m.oksas@ug.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'student');

create trigger insertStudent
before insert
on Student
for each row
	set new.is_applied_erasmus= false;

create trigger age_setter
before insert
on Student
for each row
	set new.age = (select date_format(from_days(datediff(NOW(), NEW.date_of_birth)), "%Y")+0 as age);


# STUDENT
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (2375, "Esme/Usak Cumhuriyet Mah. Mustafa Kemal Cad. No79", 3.48, 3.68, 50, "Male", '1998-01-06', 5);
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (1289, "Izmir", 3.45, 3.64, 68.32, "Male", '1997-01-08', 6);
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (2251, "Samsun", 3.50, 3.70, 65.30, "Male", '1998-01-07', 5);
Insert into Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, current_semester) values (2984, "Aksaray", 3.82, 3.80, 80.30, "Male", '1998-01-09', 5);

# Phone
Insert into Phone (phone_id, phone_number) values  (2375, "05006669988");
Insert into Phone (phone_id, phone_number) values  (1289, "05007775544");
Insert into Phone (phone_id, phone_number) values  (2251, "05005554433");
Insert into Phone (phone_id, phone_number) values  (2984, "05003332211");

#admin
Insert into User (user_id, firstname, lastname, mail, password, role) values (9999, "admin", "adminoglu", "admin@bilkent.com", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'admin');
# Administrive Unit
Insert into Administrative_Unit (admin_id, office_no) values (9999, "BBC");

#instructor
Insert into User (user_id, firstname, lastname, mail, password, role) values (9100, "David", "Davenport", "david@cs.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9101, "Ozgur", "Ulusoy", "oulusoy@cs.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9102, "Ugur", "Güdükbay", "gudukbay@cs.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9200, "Dragan", "Ilic", "dragan@eng.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9201, "Buffy", "Buff", "buffy@eng.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9300, "Ali Sinan", "Sertoz", "ali@math.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9301, "Okan", "Tekman", "okan@math.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9302, "Aydan", "Pamir", "pamir@math.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9400, "Ozgur", "Sahin", "özgür@mbg.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9401, "Onur", "Onat", "onat@mbg.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9500, "Ali", "Kurt", "alikurt@turk.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');
Insert into User (user_id, firstname, lastname, mail, password, role) values (9501, "Gozde", "Bilgin", "bilgin@turk.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'instructor');

# INSTRUCTOR
Insert into Instructor values (9100, "G17","Friday 13:40-15:30");
Insert into Instructor values (9101, "SA03","Thursday 9:40-10:30");
Insert into Instructor values (9102, "G105","Tuesday 15:40-17:30");
Insert into Instructor values (9200, "G04","Monday 9:40-10:30");
Insert into Instructor values (9201, "G109","Monday 13:40-15:30");
Insert into Instructor values (9300, "EA403","Monday 9:40-10:30");
Insert into Instructor values (9301, "G202","Monday 13:40-15:30");
Insert into Instructor values (9302, "EA403","Wednesday 9:40-10:30");
Insert into Instructor values (9400, "G06","Wednesday 13:40-15:30");
Insert into Instructor values (9401, "EA401","Tuesday 9:40-10:30");
Insert into Instructor values (9500, "V105","Thursday 13:40-15:30");
Insert into Instructor values (9501, "V205","Wednesday 9:40-10:30");

# Phone
Insert into Phone (phone_id, phone_number) values  (9100, "05003332266");
Insert into Phone (phone_id, phone_number) values  (9101, "05003332233");
Insert into Phone (phone_id, phone_number) values  (9102, "05003332244");
Insert into Phone (phone_id, phone_number) values  (9200, "05003332277");
Insert into Phone (phone_id, phone_number) values  (9201, "05003334477");
Insert into Phone (phone_id, phone_number) values  (9300, "05103332299");
Insert into Phone (phone_id, phone_number) values  (9301, "05203332299");
Insert into Phone (phone_id, phone_number) values  (9302, "05303332299");
Insert into Phone (phone_id, phone_number) values  (9400, "05063332200");
Insert into Phone (phone_id, phone_number) values  (9401, "05053332200");
Insert into Phone (phone_id, phone_number) values  (9500, "05013332200");
Insert into Phone (phone_id, phone_number) values  (9501, "05023332200");

#ta
Insert into User (user_id, firstname, lastname, mail, password, role) values (3100, "Duygu", "Durmus", "duygu.durmus@g.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'ta');
Insert into User (user_id, firstname, lastname, mail, password, role) values (3200, "Mustafa", "Cavdar", "mustafa.cavdar@g.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'ta');
Insert into User (user_id, firstname, lastname, mail, password, role) values (3300, "Oguzhan", "Karakahya", "ozzy@g.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'ta');
Insert into User (user_id, firstname, lastname, mail, password, role) values (3400, "Ilayda", "Kara", "kara@g.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'ta');
Insert into User (user_id, firstname, lastname, mail, password, role) values (3500, "Doruk", "Durmaz", "durmaz@g.bilkent.edu.tr", "$2a$10$PzlHE9VlPFpfXa7f7eJHjOMSLuDtCNExIiJZfhB4zp8/m9tmialse", 'ta');

# TA
Insert into TeachingAssistant values (3100, "EA405","Tuesday 13:40-15:30");
Insert into TeachingAssistant values (3200, "EA406","Wednesday 13:40-15:30");
Insert into TeachingAssistant values (3300, "EA407","Thursday 13:40-15:30");
Insert into TeachingAssistant values (3400, "EA408","Friday 13:40-15:30");
Insert into TeachingAssistant values (3500, "EA409","Monday 13:40-15:30");

# Phone
Insert into Phone (phone_id, phone_number) values  (3100, "05350333333");
Insert into Phone (phone_id, phone_number) values  (3200, "05460222222");
Insert into Phone (phone_id, phone_number) values  (3300, "05460888888");
Insert into Phone (phone_id, phone_number) values  (3400, "05003332211");
Insert into Phone (phone_id, phone_number) values  (3500, "05250111111");

# Department
Insert into Department values ("CS", "EA 4th Floor", "Computer Science");
Insert into Department values ("ME",  "EA 3rd Floor", "Mechanical Engineering");
Insert into Department values ("IE",  "EA 2nd Floor", "Industrial Engineering");
Insert into Department values ("EEE",  "EE", "Electrical And Electronics Engineering");
Insert into Department values ("MATH", "SA Building", "Mathematics");
Insert into Department values ("MBG", "SB Building", "Molecular Biology");
Insert into Department values ("ENG", "G Building", "Faculty Academic English Program");
Insert into Department values ("TURK", "A Building", "Turkish Unit");

## Course
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (1, "CS101", "Algorithms and Programming I", 4,"CS", 9100);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (2, "ENG101", "English and Composition I", 3,"ENG", 9200);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (3, "Math101", "Calculus I", 4,"MATH", 9300);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (4, "MBG101", "Introduction to Modern Biology", 3,"MBG", 9400);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (5, "TURK101", "Turkish I", 2,"TURK", 9500);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (6, "CS102", "Algorithms and Programming II", 4,"CS", 9101);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (7, "ENG102", "English and Composition II", 3,"ENG", 9201);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (8, "Math102", "Calculus II", 4,"MATH", 9301);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (9, "Math132", "Discrete and Combinatorial Mathematics", 3,"MATH", 9302);
Insert into Course (course_id, course_code, name, credits, dept_code, coordinator_id) values (10, "TURK102", "Turkish II", 2,"TURK", 9501);

# Assits
Insert into Assists values (3100, 1);
Insert into Assists values (3200, 2);
Insert into Assists values (3300, 3);
Insert into Assists values (3400, 4);
Insert into Assists values (3500, 5);
Insert into Assists values (3100, 6);
Insert into Assists values (3200, 7);
Insert into Assists values (3300, 8);
Insert into Assists values (3400, 9);
Insert into Assists values (3500, 10);

# Prereq
Insert into PreReq (course_id, req_id) values (6, 1);
Insert into PreReq (course_id, req_id) values (7,2);
Insert into PreReq (course_id, req_id) values (8, 3);
Insert into PreReq (course_id, req_id) values (9,3);
Insert into PreReq (course_id, req_id) values (10,5);

# Curriculum
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 1, "must");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 2, "must");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 3, "must");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 4, "elective");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 5, "additional");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 6, "must");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 7, "must");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 8, "must");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 9, "elective");
Insert into Curriculum (dept_code, course_id, course_type) values ("CS", 10, "additional");

# Section  available_quota için trigger register olan kişi sayısını count olarak yapıp bularak
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (1, 1, "EB104", 1, "spring", "2020", 10, 10, 9100);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (1, 2, "EE04", 2, "spring", "2020", 10, 10, 9101);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (2, 1, "EE03", 1, "spring", "2020", 10, 10, 9200);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (3, 1, "EB101", 1, "spring", "2020", 10, 10, 9300);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (3, 2, "EE02", 2, "spring", "2020", 10, 10, 9301);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (4, 1, "EE01", 1, "spring", "2020", 10, 10, 9400);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (5, 1, "EB106", 1, "spring", "2020", 10, 10, 9500);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (6, 1, "EE115", 1, "spring", "2020", 10, 10, 9101);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (6, 2, "EB202", 2, "spring", "2020", 10, 10, 9102);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (7, 1, "EB204", 1, "spring", "2020", 10, 10, 9201);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (8, 1, "A03", 1, "spring", "2020", 10, 10, 9301);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (8, 2, "A102", 2, "spring", "2020", 10, 10, 9302);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (9, 1, "A104", 1, "spring", "2020", 10, 10, 9401);
Insert into Section (course_id, section_id, classroom, section_number, semester, year, available_quota, total_quota, teacher_id) values (10, 1, "A03", 1, "spring", "2020", 10, 10, 9501);


create trigger update_available_quota
after
delete
on Takes
for each row
	update Section s
	set s.available_quota = s.available_quota+1
    where s.section_id = OLD.section_id and s.course_id = OLD.course_id and OLD.year = s.year;
    
create trigger update_available_quota_insert
after
insert
on Takes
for each row
	update Section s
	set s.available_quota = s.available_quota-1
    where s.section_id = NEW.section_id and s.course_id = NEW.course_id and NEW.year = s.year;

# Takes
Insert into Takes (s_id, course_id, section_id, year, semester) values (2251, 1, 2, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2251, 2, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2251, 3, 2, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2375, 1, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2375, 2, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2375, 3, 1, 2020, 'spring');

Insert into Takes (s_id, course_id, section_id, year, semester) values (1289, 6, 2, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (1289, 7, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (1289, 8, 2, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2984, 6, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2984, 7, 1, 2020, 'spring');
Insert into Takes (s_id, course_id, section_id, year, semester) values (2984, 8, 1, 2020, 'spring');

Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (1289, 1, 1, "98", 'A',2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (1289, 2, 1, "70", 'A-',2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (1289, 3, 2, "50", 'B-',2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (2984, 1, 2, "45", 'C-', 2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (2984, 2, 1, "80", 'A-', 2019, 'fall');
Insert into Takes (s_id, course_id, section_id, final_grade, letter_grade, year, semester) values (2984, 3, 2, "80", 'A-', 2019, 'fall');



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
Insert into Has values (3, 1, 2);
Insert into Has values (4, 1, 2);
Insert into Has values (9, 2, 1);
Insert into Has values (10, 2, 1);
Insert into Has values (11, 3, 1);
Insert into Has values (12, 3, 1);
Insert into Has values (17, 3, 2);
Insert into Has values (18, 3, 2);
Insert into Has values (19, 4, 1);
Insert into Has values (20, 4, 1);
Insert into Has values (29, 5, 1);
Insert into Has values (30, 5, 1);
Insert into Has values (31, 6, 1);
Insert into Has values (32, 6, 1);
Insert into Has values (33, 6, 2);
Insert into Has values (34, 6, 2);
Insert into Has values (35, 7, 1);
Insert into Has values (36, 7, 1);
Insert into Has values (5, 8, 1);
Insert into Has values (6, 8, 1);
Insert into Has values (7, 8, 2);
Insert into Has values (8, 8, 2);
Insert into Has values (13, 9, 1);
Insert into Has values (14, 9, 1);
Insert into Has values (15, 10, 1);
Insert into Has values (16, 10, 1);

# Scheduled Exam
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (1,'2020-05-17 18:00:00', "CS101 Midterm", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (2,'2020-06-14 17:30:00', "ENG101 Midterm", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (3,'2020-05-13 18:00:00', "Math101 Midterm", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (4,'2020-06-16 17:30:00', "MBG101 Midterm", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (5,'2020-05-17 18:00:00', "TURK101 Midterm", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (6,'2020-06-18 17:30:00', "CS102 Midterm", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (7,'2020-05-20 18:00:00', "ENG102 Midterm", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (8,'2020-06-19 17:30:00', "Math102 Midterm", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (9,'2020-05-13 18:00:00', "Math132 Midterm", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (10,'2020-06-12 17:30:00',"TURK102 Midterm", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (11,'2020-05-02 18:00:00', "CS101 Quiz3", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (12,'2020-05-01 18:00:00', "Math101 Quiz2", "18:00-20:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (13,'2020-06-03 17:30:00', "MBG101 Quiz3", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (14,'2020-06-04 17:30:00', "CS102 Quiz2", "17:30-19:30");
Insert into ScheduledExam (exam_id,e_date, title, reserved_time) values (15,'2020-06-05 17:30:00', "Math102 Quiz3", "17:30-19:30");

# Includes 
Insert into Includes (exam_id, course_id, section_id) values (1, 1, 1);
Insert into Includes (exam_id, course_id, section_id) values (1, 1, 2);
Insert into Includes (exam_id, course_id, section_id) values (2, 2, 1);
Insert into Includes (exam_id, course_id, section_id) values (3, 3, 1);
Insert into Includes (exam_id, course_id, section_id) values (3, 3, 2);
Insert into Includes (exam_id, course_id, section_id) values (4, 4, 1);
Insert into Includes (exam_id, course_id, section_id) values (5, 5, 1);

Insert into Includes (exam_id, course_id, section_id) values (6, 6, 1);
Insert into Includes (exam_id, course_id, section_id) values (6, 6, 2);
Insert into Includes (exam_id, course_id, section_id) values (7, 7, 1);
Insert into Includes (exam_id, course_id, section_id) values (8, 8, 1);
Insert into Includes (exam_id, course_id, section_id) values (8, 8, 2);
Insert into Includes (exam_id, course_id, section_id) values (9, 9, 1);
Insert into Includes (exam_id, course_id, section_id) values (10, 10, 1);

Insert into Includes (exam_id, course_id, section_id) values (11, 1, 1);
Insert into Includes (exam_id, course_id, section_id) values (11, 1, 2);
Insert into Includes (exam_id, course_id, section_id) values (12, 3, 1);
Insert into Includes (exam_id, course_id, section_id) values (12, 3, 2);
Insert into Includes (exam_id, course_id, section_id) values (13, 4, 1);
Insert into Includes (exam_id, course_id, section_id) values (14, 6, 1);
Insert into Includes (exam_id, course_id, section_id) values (14, 6, 2);
Insert into Includes (exam_id, course_id, section_id) values (15, 8, 1);
Insert into Includes (exam_id, course_id, section_id) values (15, 8, 2);

# classrooms
Insert into Classrooms (exam_id, classroom) values (1, "EB101");
Insert into Classrooms (exam_id, classroom) values (1, "EB102");
Insert into Classrooms (exam_id, classroom) values (1, "EB103");
Insert into Classrooms (exam_id, classroom) values (1, "EB104");
Insert into Classrooms (exam_id, classroom) values (2, "EE04");
Insert into Classrooms (exam_id, classroom) values (3, "EE02");
Insert into Classrooms (exam_id, classroom) values (3, "EE03");
Insert into Classrooms (exam_id, classroom) values (3, "EB101");
Insert into Classrooms (exam_id, classroom) values (3, "EB102");
Insert into Classrooms (exam_id, classroom) values (4, "EB103");
Insert into Classrooms (exam_id, classroom) values (4, "EB104");
Insert into Classrooms (exam_id, classroom) values (5, "EE04");
Insert into Classrooms (exam_id, classroom) values (5, "EE02");
Insert into Classrooms (exam_id, classroom) values (6, "EE03");
Insert into Classrooms (exam_id, classroom) values (6, "EB101");
Insert into Classrooms (exam_id, classroom) values (6, "EB102");
Insert into Classrooms (exam_id, classroom) values (7, "EB103");
Insert into Classrooms (exam_id, classroom) values (8, "EB104");
Insert into Classrooms (exam_id, classroom) values (8, "EE04");
Insert into Classrooms (exam_id, classroom) values (8, "EE02");
Insert into Classrooms (exam_id, classroom) values (8, "EE03");
Insert into Classrooms (exam_id, classroom) values (9, "EB101");
Insert into Classrooms (exam_id, classroom) values (10, "EB102");
Insert into Classrooms (exam_id, classroom) values (10, "EB103");
Insert into Classrooms (exam_id, classroom) values (11, "EB104");
Insert into Classrooms (exam_id, classroom) values (11, "EE04");
Insert into Classrooms (exam_id, classroom) values (12, "EE02");
Insert into Classrooms (exam_id, classroom) values (12, "EE03");
Insert into Classrooms (exam_id, classroom) values (13, "EB104");
Insert into Classrooms (exam_id, classroom) values (13, "EE04");
Insert into Classrooms (exam_id, classroom) values (14, "EE02");
Insert into Classrooms (exam_id, classroom) values (15, "EE03");

# D_member
Insert into D_Member values (2375, "CS");
Insert into D_Member values (1289, "CS");
Insert into D_Member values (2251, "CS");
Insert into D_Member values (2984, "CS");

Insert into D_Member values (3100, "CS");
Insert into D_Member values (3200, "ENG");
Insert into D_Member values (3300, "MATH");
Insert into D_Member values (3400, "MBG");
Insert into D_Member values (3500, "TURK");

Insert into D_Member values (9100, "CS");
Insert into D_Member values (9101, "CS");
Insert into D_Member values (9102, "CS");
Insert into D_Member values (9200, "ENG");
Insert into D_Member values (9201, "ENG");
Insert into D_Member values (9300, "MATH");
Insert into D_Member values (9301, "MATH");
Insert into D_Member values (9302, "MATH");
Insert into D_Member values (9400, "MBG");
Insert into D_Member values (9401, "MBG");
Insert into D_Member values (9500, "TURK");
Insert into D_Member values (9501, "TURK");

# car sticker
Insert into Car_Sticker (sticker_id, plate_no, start_date, end_date, car_type, driver_licence_no, penalty_point, owner_id) values (1, "64AAZ584", "2019-8-15", "2020-8-15", "Polo", "44332211", 0, 2375);

# Assignment 
Insert into Assignment (title, date, type) values ("CS101-Lab 1", "2020-02-15", "Lab");
Insert into Assignment (title, date, type) values ("CS101-Quiz 1", "2020-03-6", "Quiz");
Insert into Assignment (title, date, type) values ("Math101-Quiz 1", "2020-03-12", "Quiz");
Insert into Assignment (title, date, type) values ("CS102-Lab 2 ", "2020-03-12", "Lab");
Insert into Assignment (title, date, type) values ("Math102-Quiz 2", "2020-03-12", "Quiz");
Insert into Assignment (title, date, type) values ("MBG101 Hw1", "2020-03-14", "Homework");

# Contains
Insert into Contains (assignment_id, course_id, section_id) values (1, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (1, 1, 2);
Insert into Contains (assignment_id, course_id, section_id) values (2, 1, 1);
Insert into Contains (assignment_id, course_id, section_id) values (2, 1, 2);
Insert into Contains (assignment_id, course_id, section_id) values (3, 3, 1);
Insert into Contains (assignment_id, course_id, section_id) values (3, 3, 2);
Insert into Contains (assignment_id, course_id, section_id) values (4, 6, 1);
Insert into Contains (assignment_id, course_id, section_id) values (4, 6, 2);
Insert into Contains (assignment_id, course_id, section_id) values (5, 8, 1);
Insert into Contains (assignment_id, course_id, section_id) values (5, 8, 2);
Insert into Contains (assignment_id, course_id, section_id) values (6, 4, 1);

# Result  #burada aggregation.avg kullanılacak
Insert into Result (student_id, assignment_id, grade) values (2375, 1, 98);
Insert into Result (student_id, assignment_id, grade) values (2375, 2, 70);
Insert into Result (student_id, assignment_id, grade) values (2375, 3, 60);
Insert into Result (student_id, assignment_id, grade) values (2375, 6, 100);

Insert into Result (student_id, assignment_id, grade) values (2251, 1, 50);
Insert into Result (student_id, assignment_id, grade) values (2251, 2, 30);
Insert into Result (student_id, assignment_id, grade) values (2251, 3, 60);
Insert into Result (student_id, assignment_id, grade) values (2251, 6, 50);

Insert into Result (student_id, assignment_id, grade) values (1289, 4, 60);
Insert into Result (student_id, assignment_id, grade) values (1289, 5, 90);
Insert into Result (student_id, assignment_id, grade) values (2984, 4, 100);
Insert into Result (student_id, assignment_id, grade) values (2984, 5, 80);


# Task
Insert into Task values (1, "Homework");
Insert into Task values (2, "Quiz");

# Authorizes öğretmen task oluşturduğunda bu tasklar otomatik olarak seçili ta ye atanacak trigger kullanılcak
Insert into Authorizes values(1, 9101, 3100);
Insert into Authorizes values(2, 9100, 3100);

## EXCHANGE
INSERT INTO ExchangeSchool(school_id , school_name , department ,available_semester , school_country ) Values( 1001, "Macquire University", "Computer Science", "fall", "Australia");
INSERT INTO ExchangeSchool(school_id , school_name , department ,available_semester , school_country ) Values( 1002, "National Taiwan University", "Computer Science", "fall", "Taiwan");
INSERT INTO ExchangeSchool(school_id , school_name , department ,available_semester , school_country ) Values( 1003, "Stanford University", "Computer Science", "Spring", "USA");
INSERT INTO ExchangeSchool(school_id , school_name , department ,available_semester , school_country ) Values( 1004, "Carneige Mellon University", "Computer Science", "fall", "USA");
INSERT INTO ExchangeSchool(school_id , school_name , department ,available_semester , school_country ) Values( 1005, "Queen's University", "Computer Science", "Spring", "Canada");

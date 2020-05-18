## Student Info
SELECT u.firstname, u.lastname, d.dept_name,s.student_id, s.cgpa, s.gpa, s.current_semester,p.phone_number, u.mail 
FROM Student s 
INNER JOIN student_system.User u on s.student_id=u.user_id 
INNER JOIN D_Member m ON u.user_id=m.user_id 
INNER JOIN Department d ON m.dept_code = d.dept_code
INNER JOIN Phone p ON p.phone_id= u.user_id 
WHERE s.student_id = 2375;

# Instructor Given Courses
# sec.class changed to sec.classroom, Instructor i changed to instructor k
SELECT c.course_code, sec.section_number, c.name, sec.classroom
FROM Instructor i
INNER JOIN Section sec ON sec.teacher_id=i.instructor_id
INNER JOIN Course c ON c.course_id = sec.course_id
WHERE i.instructor_id= 4001 AND sec.semester= "spring" AND sec.year= "2020";

## Instructor Info
SELECT u.firstname, u.lastname, d.dept_name, i.instructor_id, i.office_no, p.phone_number, u.mail
FROM Instructor i
INNER JOIN User u ON i.instructor_id= u.user_id
INNER JOIN D_Member m ON u.user_id = m.user_id
INNER JOIN Department d ON m.dept_code = d.dept_code
INNER JOIN Phone p ON p.phone_id= u.user_id
WHERE i.instructor_id = 4000;

# Instuctor Weekly Scedule
SELECT c.course_code, sec.section_number,
sec.classroom, ts.start_day, ts.start_time, ts.end_time
FROM Instructor i
INNER JOIN Section sec ON sec.teacher_id=i.instructor_id
INNER JOIN Course c ON c.course_id = sec.course_id 
INNER JOIN Has h ON sec.section_id = h.section_id
INNER JOIN TimeSlot ts ON ts.time_id = h.time_id
WHERE i.instructor_id= 4001 AND sec.semester= 'spring'
AND sec.year= 2020;

# Student weekly schedule
SELECT c.course_code, sec.section_number, sec.classroom, ts.start_day, ts.start_time, ts.end_time
FROM Student s
INNER JOIN Takes t ON t.s_id=s.student_id
INNER JOIN Section sec ON t.section_id=sec.section_id
INNER JOIN Course c ON c.course_id = sec.course_id
INNER JOIN Has h ON sec.section_id = h.section_id
INNER JOIN TimeSlot ts ON ts.time_id = h.time_id
WHERE s.student_id= 2375 AND
t.semester= 'spring' AND t.year= '2020';

# Get student taken courses
SELECT c.course_code, sec.section_number, c.name,u.firstname, u.lastname,c.credits FROM Student s 
INNER JOIN Takes t ON t.s_id=s.student_id
INNER JOIN Section sec ON t.section_id=sec.section_id
INNER JOIN Course c ON c.course_id = sec.course_id
INNER JOIN Instructor i ON i.instructor_id= sec.teacher_id
INNER JOIN User u ON i.instructor_id=u.user_id
WHERE s.student_id= 2375 AND
t.semester= 'spring' AND t.year= '2020';

#given courses ta
SELECT distinct c.course_code,  c.name
FROM TeachingAssistant ta
INNER JOIN Assists a ON a.ta_id = ta.ta_id
INNER JOIN Course c ON c.course_id = a.course_id
INNER JOIN Section sec ON c.course_id= sec.course_id
WHERE ta.ta_id= 3000 AND
sec.semester= 'spring' AND sec.year= '2020';

#Assistant info repository 
SELECT u.firstname, u.lastname, d.dept_name, ta.ta_id, ta.office_no, p.phone_number, u.mail
FROM TeachingAssistant ta
INNER JOIN User u ON ta.ta_id=u.user_id
INNER JOIN D_Member m ON u.user_id=m.user_id
INNER JOIN Department d ON m.dept_code = d.dept_code
INNER JOIN Phone p ON p.phone_id= u.user_id
WHERE ta.ta_id = 3000;

# ta weekly schedule

SELECT c.course_code, sec.section_number, sec.classroom, ts.start_day, ts.start_time, ts.end_time
FROM TeachingAssistant ta
INNER JOIN Assists a ON a.ta_id = ta.ta_id
INNER JOIN Course c ON c.course_id = a.course_id
INNER JOIN Section sec ON c.course_id= sec.course_id
INNER JOIN Has h on h.section_id = sec.section_id
INNER JOIN TimeSlot ts ON ts.time_id = h.time_id 
WHERE ta.ta_id= 3000 AND sec.semester= 'spring'
AND sec.year= '2020';


Select * from User;
select * from Student;
select * from Phone;
select * from D_Member;
delete from User where user_id = 3300;
delete from Phone where phone_id = 4002;
delete from Instructor where instructor_id = 4002;


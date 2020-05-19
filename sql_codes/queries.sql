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

# get button names
SELECT c.course_code, sec.section_number, c.name, sec.section_id
FROM Instructor i
INNER JOIN Section sec ON sec.teacher_id=i.instructor_id
INNER JOIN Course c ON c.course_id = sec.course_id
WHERE i.instructor_id= 4000 AND
sec.semester= 'spring' AND sec.year= 2020;

# get grades
SELECT u.user_id, u.firstname, u.lastname, t.final_grade
FROM Section sec
INNER JOIN Takes t ON t.section_id = sec.section_id
INNER JOIN Student s ON s.student_id = t.s_id
INNER JOIN User u ON s.student_id = u.user_id 
WHERE sec.section_id = 1 and t.semester = 'spring' and t.year = 2020; 

# letter grade 
UPDATE Takes t
SET letter_grade = 'A+'
WHERE t.section_id = 1 and t.semester = 'spring' and t.year = 2020 and t.s_id = 2375;

## get assistants
SELECT ta.ta_id, u.firstname, u.lastname
FROM Instructor i
INNER JOIN Authorizes a ON i.instructor_id = a.instructor_id
INNER JOIN Task t ON t.task_id=a.task_id
INNER JOIN TeachingAssistant ta ON ta.ta_id=a.ta_id
INNER JOIN Section sec ON sec.teacher_id = i.instructor_id
INNER JOIN User u ON u.user_id = ta.ta_id
WHERE sec.course_id = ? AND i.instructor_id=?;


# student get button names
SELECT c.course_code, sec.section_number, c.name
FROM Student s
INNER JOIN Takes t ON t.s_id=s.student_id
INNER JOIN Section sec ON t.section_id=sec.section_id
INNER JOIN Course c ON c.course_id = sec.course_id
WHERE s.student_id= 2375 AND
t.semester= 'spring' AND t.year= 2020;

SELECT * FROM Assigment;

#get grades
SELECT a.title, a.type, a.date, r.grade
FROM Result r
INNER JOIN Student s ON r.student_id = s.student_id
INNER JOIN Assignment a ON a.assignment_id=r.assignment_id
INNER JOIN Contains con ON con.assignment_id = a.assignment_id
INNER JOIN Section sec ON con.section_id=sec.section_id
INNER JOIN Course c ON c.course_id = sec.course_id
WHERE c.course_id = 1 AND s.student_id= 2251 and sec.section_id = 1;

# ta get students
SELECT distinct u.user_id, u.firstname, u.lastname
FROM Section sec
INNER JOIN Contains con ON con.section_id = sec.section_id
INNER JOIN Assignment a ON a.assignment_id = con.assignment_id
INNER JOIN Result r ON r.assignment_id= a.assignment_id
INNER JOIN Student s ON s.student_id = r.student_id
INNER JOIN User u ON s.student_id = u.user_id
WHERE sec.section_id = 1;



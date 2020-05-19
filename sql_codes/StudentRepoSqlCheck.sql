# getStudentinfo
SELECT u.firstname, u.lastname, d.dept_name,
s.student_id, s.cgpa, s.gpa, s.current_semester,
p.phone_number, u.mail 
FROM Student s 
INNER JOIN User u ON s.student_id=u.user_id 
INNER JOIN D_Member m ON u.user_id=m.user_id 
INNER JOIN Department d ON m.dept_code = d.dept_code 
INNER JOIN Phone p ON p.phone_id= u.user_id 
WHERE s.student_id = 2251;

# insert student

# weekly schedule
SELECT c.course_code, sec.section_number,
sec.classroom, ts.start_day, ts.start_time, ts.end_time
FROM Student s
INNER JOIN Takes t ON t.s_id=s.student_id
INNER JOIN Section sec ON t.section_id=sec.section_id AND t.course_id=sec.course_id
INNER JOIN Course c ON c.course_id = sec.course_id
INNER JOIN Has h ON sec.section_id = h.section_id AND sec.course_id = h.course_id
INNER JOIN TimeSlot ts ON ts.time_id = h.time_id
WHERE s.student_id= 2251 AND
t.semester= 'spring' AND t.year= 2020;

# get taken courses # t.course = sec.course  DÜZELTİLECEK --> course_id
SELECT c.course_code, sec.section_number,
c.name,u.firstname, u.lastname,c.credits FROM Student s 
INNER JOIN Takes t ON t.s_id=s.student_id 
INNER JOIN Section sec ON t.section_id=sec.section_id AND t.course_id=sec.course_id
INNER JOIN Course c ON c.course_id = sec.course_id 
INNER JOIN Instructor i ON i.instructor_id= sec.teacher_id
INNER JOIN User u ON i.instructor_id=u.user_id
WHERE s.student_id= 2251 AND
t.semester= 'spring' AND t.year= 2020;

# get button names
SELECT c.course_code, sec.section_number, c.name, sec.course_id, sec.section_id
FROM Student s
INNER JOIN Takes t ON t.s_id=s.student_id
INNER JOIN Section sec ON t.section_id=sec.section_id AND t.course_id=sec.course_id
 INNER JOIN Course c ON c.course_id = sec.course_id
WHERE s.student_id= 2251 AND
t.semester= 'spring' AND t.year= 2020;

# getgrades
SELECT c.name ,a.title, a.type, a.date, r.grade
FROM Result r
INNER JOIN Student s ON r.student_id = s.student_id
INNER JOIN Assignment a ON a.assignment_id=r.assignment_id
INNER JOIN Contains con ON con.assignment_id=a.assignment_id
INNER JOIN Section sec ON con.section_id=sec.section_id AND con.course_id=sec.course_id
INNER JOIN Course c ON c.course_id = sec.course_id
INNER JOIN Takes t on t.section_id = sec.section_id AND t.s_id = s.student_id AND t.course_id = sec.course_id
WHERE sec.semester = 'spring' AND s.student_id= 2251 AND sec.year = 2020 ; 
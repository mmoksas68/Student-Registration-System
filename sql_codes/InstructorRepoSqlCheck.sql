
## given courses
SELECT c.course_code, sec.section_number, c.name,sec.classroom 
FROM Instructor i 
INNER JOIN Section sec ON sec.teacher_id=i.instructor_id 
INNER JOIN Course c ON c.course_id = sec.course_id 
WHERE i.instructor_id= 9101 AND 
sec.semester= 'spring' AND sec.year= 2020 ;
                
## get instructor info
SELECT u.firstname, u.lastname, d.dept_name,
i.instructor_id, i.office_no, p.phone_number, u.mail 
FROM Instructor i 
INNER JOIN User u ON i.instructor_id= u.user_id 
INNER JOIN D_Member m ON u.user_id=m.user_id 
INNER JOIN Department d ON m.dept_code = d.dept_code 
INNER JOIN Phone p ON p.phone_id= u.user_id 
 WHERE i.instructor_id = 9101;

## get weeklyschedule
SELECT c.course_code, sec.section_number,
sec.classroom, ts.start_day, ts.start_time, ts.end_time
FROM Instructor i
INNER JOIN Section sec ON sec.teacher_id=i.instructor_id
INNER JOIN Course c ON c.course_id = sec.course_id
INNER JOIN Has h ON sec.section_id = h.section_id AND sec.course_id= h.course_id
INNER JOIN TimeSlot ts ON ts.time_id = h.time_id 
WHERE i.instructor_id= 9101 AND sec.semester= 'spring' 
AND sec.year= 2020;

##button names
SELECT c.course_code, sec.section_number, c.name, sec.section_id, sec.course_id
FROM Instructor i
INNER JOIN Section sec ON sec.teacher_id=i.instructor_id
INNER JOIN Course c ON c.course_id = sec.course_id
WHERE i.instructor_id= 9101 AND 
sec.semester= 'spring' AND sec.year= 2020 ;

# get grades
SELECT u.user_id, u.firstname, u.lastname, t.final_grade, c.course_code, sec.section_id
FROM Section sec
INNER JOIN Course c ON sec.course_id = c.course_id
INNER JOIN Instructor i ON sec.teacher_id = i.instructor_id
INNER JOIN Takes t ON t.section_id = sec.section_id AND t.course_id=sec.course_id
INNER JOIN Student s ON s.student_id = t.s_id
INNER JOIN User u ON s.student_id = u.user_id
WHERE i.instructor_id = 9101 AND t.semester= 'spring' AND t.year= 2020;

# setlettergrades
UPDATE Takes t 
SET letter_grade = ?
WHERE t.section_id = ? AND t.s_id = ?  AND t.semester = ?  AND t.year = ?;


#get tas  ## DÜZELTİLECEK Assist --> Assists ve "and c.course_id = sec.course_id" for Inner join Section
SELECT ta.ta_id, u.firstname, u.lastname, c.course_code, sec.section_id
FROM Instructor i
INNER JOIN Authorizes a ON i.instructor_id = a.instructor_id
INNER JOIN Task t ON t.task_id=a.task_id
INNER JOIN TeachingAssistant ta ON ta.ta_id=a.ta_id
INNER JOIN Assists asi ON asi.ta_id=ta.ta_id
INNER JOIN Course c ON c.course_id=asi.course_id
INNER JOIN Section sec ON sec.teacher_id = i.instructor_id and c.course_id = sec.course_id
INNER JOIN User u ON u.user_id = ta.ta_id
WHERE i.instructor_id = 9101 AND sec.semester= 'spring' AND sec.year= 2020;

# assign task
INSERT INTO Task (task_id, task_type) VALUES( ?, ?);
INSERT INTO Authorizes (task_id, instructor_id, ta_id ) VALUES( ?, ?, ?);
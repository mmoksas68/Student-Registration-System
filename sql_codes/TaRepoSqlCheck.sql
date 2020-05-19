# given courses
SELECT distinct c.course_code, c.name
FROM TeachingAssistant ta
INNER JOIN Assists a ON a.ta_id = ta.ta_id
INNER JOIN Course c ON c.course_id = a.course_id
INNER JOIN Section sec ON c.course_id= sec.course_id
WHERE ta.ta_id= 3100 AND
sec.semester= 'spring' AND sec.year= 2020 ;

# get teaching assistant info

SELECT u.firstname, u.lastname, d.dept_name,
ta.ta_id, ta.office_no, p.phone_number, u.mail
FROM TeachingAssistant ta
INNER JOIN User u ON ta.ta_id=u.user_id
INNER JOIN D_Member m ON u.user_id=m.user_id
INNER JOIN Department d ON m.dept_code = d.dept_code
INNER JOIN Phone p ON p.phone_id= u.user_id
WHERE ta.ta_id = 3100;

# Insert Ta
INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?);

INSERT INTO TeachingAssistant (ta_id, office_no, office_hours) VALUES (?, ?, ?);

INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?);

INSERT INTO D_Member (dept_code, user_id) VALUES( ?, ?);

# weekly schedule
SELECT c.course_code, sec.section_number,
sec.classroom, ts.start_day, ts.start_time, ts.end_time
FROM TeachingAssistant ta
INNER JOIN Assists a ON a.ta_id = ta.ta_id
INNER JOIN Course c ON c.course_id = a.course_id
INNER JOIN Section sec ON c.course_id= sec.course_id
INNER JOIN Has h ON sec.section_id = h.section_id AND sec.course_id = h.course_id
INNER JOIN TimeSlot ts ON ts.time_id = h.time_id 
WHERE ta.ta_id= 3100 AND sec.semester= 'spring'
AND sec.year= 2020;

# button names
SELECT c.course_code, sec.section_number, c.name, sec.section_id, sec.course_id
FROM TeachingAssistant ta
INNER JOIN Assists a ON a.ta_id=ta.ta_id
INNER JOIN Course c ON c.course_id = a.course_id
INNER JOIN Section sec ON c.course_id=sec.course_id
WHERE ta.ta_id= 3100 AND
sec.semester= 'spring' AND sec.year= 2020;

# get students
SELECT distinct u.user_id, u.firstname, u.lastname, c.course_code, sec.section_number
FROM TeachingAssistant ta
INNER JOIN Assists asi ON ta.ta_id=asi.ta_id
INNER JOIN Course c ON c.course_id = asi.course_id
INNER JOIN Section sec ON sec.course_id = c.course_id
INNER JOIN Takes t on t.course_id = sec.course_id and t.section_id = sec.section_id
INNER JOIN Student s ON s.student_id = t.s_id
INNER JOIN User u ON s.student_id = u.user_id
WHERE ta.ta_id = 3100
AND  t.semester= 'spring' AND t.year= 2020;

## set grade
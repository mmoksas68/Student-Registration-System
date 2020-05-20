Select c.course_id, c.course_code, c.name, course_type, sec.section_id, u.firstname, u.lastname, sec.available_quota, sec.total_quota from 
((Select c.course_id, c.course_code, c.name, cu.course_type
From Student s
Inner Join User u on u.user_id = s.student_id
Inner Join D_Member dm on u.user_id = dm.user_id
Inner Join Department d on d.dept_code = dm.dept_code
Inner Join Curriculum cu on cu.dept_code = d.dept_code
Inner Join Course c on c.course_id = cu.course_id
where student_id = 2984 and c.course_id not in
(Select p.course_id
From Student s
Inner Join User u on u.user_id = s.student_id
Inner Join D_Member dm on u.user_id = dm.user_id
Inner Join Department d on d.dept_code = dm.dept_code
Inner Join Curriculum cu on cu.dept_code = d.dept_code
Inner Join Course c on c.course_id = cu.course_id
Inner Join PreReq p on c.course_id = p.course_id
where student_id = 2984))
UNION
(Select p.course_id, c.course_code, c.name, cu.course_type
From Student s
Inner Join User u on u.user_id = s.student_id
Inner Join D_Member dm on u.user_id = dm.user_id
Inner Join Department d on d.dept_code = dm.dept_code
Inner Join Curriculum cu on cu.dept_code = d.dept_code
Inner Join Course c on c.course_id = cu.course_id
Inner Join PreReq p on c.course_id = p.course_id
where student_id = 2984 AND p.req_id in
(Select t.course_id
From Student s
Inner Join Takes t on t.s_id = s.student_id
where s.student_id = 2984 and t.letter_grade is not null and t.letter_grade NOT LIKE 'F%'))) as c
Inner Join Section sec on sec.course_id = c.course_id
Inner Join Instructor i on i.instructor_id = sec.teacher_id
Inner Join User u on u.user_id = i.instructor_id
where c.course_id not in (Select t.course_id
From Student s
Inner Join Takes t on t.s_id = s.student_id
where s.student_id = 2984 and t.letter_grade is not null and t.letter_grade NOT LIKE 'F%');



Select c.course_code, s.section_id, c.name, u.firstname, u.lastname, s.available_quota, s.total_quota from Course c
Inner Join Section s on c.course_id = s.course_id
Inner Join Instructor i on i.instructor_id = s.teacher_id
Inner Join User u on u.user_id = i.instructor_id
where c.course_id = 2;
create table User(
user_id 	INT PRIMARY KEY AUTO_INCREMENT,
firstname 	varchar(16) not null,
lastname 	varchar(16) not null,
mail		varchar(32) not null unique,
password	varchar(64) not null,
role		varchar(32) not null);

create table Phone(
phone_number varchar(32) NOT NULL,
phone_id	 int NOT NULL,
primary key(phone_number, phone_id),
foreign key(phone_id) references User(user_id));

create table Department(
dept_code 	varchar(8) primary key,
building	varchar(32),
dept_name	varchar(64) not null unique);

create table Student(
student_id	INT primary key,
address		VARCHAR(64) NOT NULL,
gpa			numeric(3,2),
cgpa		numeric(3,2),
erasmus_application_point double,
gender		enum('Male','Female') NOT NULL,
date_of_birth DATE,
age 		TINYINT,
current_semester	TINYINT,
is_applied_erasmus BOOL,
foreign key(student_id) references User(user_id),
check (gender in ('Male','Female')));

create table Instructor(
instructor_id	INT primary key,
office_no		varchar(16),
office_hours	varchar(32),
foreign key (instructor_id) references User(user_id));

create table TeachingAssistant(
ta_id 	INT primary key,
office_no	varchar(16),
office_hours	varchar(32),
Foreign key (ta_id) references User(user_id));

create table Administrative_Unit(
admin_id		INT PRIMARY KEY auto_increment,
office_no		varchar(8),
foreign key (admin_id) references User(user_id));

create table Task(
task_id		int primary key AUTO_INCREMENT,
task_type	varchar(32));

create table Course(
course_id		int primary key auto_increment,
course_code 	varchar(16) not null unique,
name 			varchar(64) not null unique,
credits 		int not null,
dept_code		varchar(8) not null,
coordinator_id 	int not null,
foreign key (coordinator_id) references Instructor(instructor_id),
foreign key (dept_code) references Department(dept_code));

create table Section(
course_id		int,
section_id		int,
classroom 			varchar(16) not null,
section_number	tinyint	not null,
semester		enum('fall','spring','summer') not null,
year			numeric(4,0) not null,
available_quota	tinyint,
total_quota		tinyint not null,
teacher_id 		int not null,
primary key(course_id, section_id),
foreign key (teacher_id) references Instructor(instructor_id),
foreign key (course_id) references Course(course_id),
check(semester in ('fall','spring','summer')));


CREATE TABLE ScheduledExam(
exam_id			INT PRIMARY KEY AUTO_INCREMENT,
e_date			DATETIME NOT NULL,
title			VARCHAR(32),
reserved_time	VARCHAR(32));


create table Assignment(
assignment_id 	int primary key auto_increment,
title			varchar(64) not null,
date			datetime,
type			varchar(16) not null);

## relations between tables

create table D_Member(
user_id 	int primary key,
dept_code	varchar(8) not null,
foreign key (user_id) references User(user_id),
foreign key (dept_code) references Department(dept_code));

## continue
create table Assists(
ta_id		int,
course_id 	int,
primary key (ta_id, course_id),
foreign key (ta_id) references TeachingAssistant(ta_id),
foreign key (course_id) references Course(course_id));

create table Authorizes(
task_id 	int,
instructor_id int,
ta_id		int,
primary key (task_id, instructor_id, ta_id),
foreign key(task_id) references Task(task_id),
foreign key(instructor_id) references Instructor(instructor_id),
foreign key(ta_id) references TeachingAssistant(ta_id));

create table Takes(
s_id 		int,
course_id 		int,
section_id		int,
final_grade		double,
letter_grade 	enum('A+','A','A-','B+','B','B-','C+','C','C-','D+','D','D-','F','FZ','W'),
year			smallint,
semester		enum('fall','spring','summer'),
primary key (s_id, course_id, section_id),
foreign key(s_id) references Student(student_id),
foreign key(course_id, section_id) references Section(course_id, section_id)
);


create table TimeSlot(
time_id 	int primary key auto_increment,
start_time	TIME,
end_time	TIME,
start_day	ENUM('mon','tue','wed','thu','fri','sat','sun'));

create table Has(
time_id 	int,
course_id	int,
section_id	int,
primary key (time_id, course_id, section_id),
foreign key(time_id) references TimeSlot(time_id),
foreign key(course_id, section_id) references Section(course_id, section_id));

create table Contains(
assignment_id	int,
course_id		int,
section_id		int,
primary key (assignment_id, course_id, section_id),
foreign key(assignment_id) references Assignment(assignment_id),
foreign key (course_id, section_id) references Section(course_id, section_id));

create table Attendance(
s_id				int,
course_id			int,
section_id			int,
att_date			date,
title				varchar(16),
attendance_count	tinyint,
lecture_count		tinyint,
primary key (s_id, course_id, section_id),
foreign key (s_id) references Student(student_id),
foreign key (course_id, section_id) references Section(course_id, section_id));

create table Result(
student_id		int,
assignment_id	int,
grade			double,
primary key (student_id, assignment_id),
foreign key (student_id) references Student(student_id),
foreign key (assignment_id) references Assignment(assignment_id));

create table Curriculum(
dept_code		varchar(8),
course_id		int,
course_type		enum('must', 'elective', 'additional'),
semester		enum('fall','spring','summer'),
year			numeric(4,0),
foreign key(dept_code) references Department(dept_code),
foreign key(course_id) references Course(course_id));


create table PreReq(
course_id	int,
req_id		int,
primary key (course_id, req_id),
foreign key(course_id) references Course(course_id),
foreign key(req_id) references Course(course_id));
    
CREATE TABLE Includes(
exam_id			INT,
course_id		INT,
section_id		INT,
PRIMARY KEY (exam_id, course_id, section_id),
FOREIGN KEY (exam_id) REFERENCES ScheduledExam(exam_id),
FOREIGN KEY (course_id, section_id) REFERENCES Section(course_id, section_id));

Create table Classrooms (
exam_id	int,
classroom varchar(32),
primary key (exam_id, classroom),
foreign key (exam_id) references ScheduledExam(exam_id));

create table Document(
document_id		int primary key auto_increment,
student_id		int,
type			varchar(16),
payment_method	varchar(16),
address			varchar(64),
foreign key (student_id) references Student(student_id));

create table ExchangeSchool(
school_id		int primary key,
school_name		varchar(64),
department		varchar(64),
available_semester	enum('fall','spring','summer'),
school_country	varchar(32)
);

Create index newName on ExchangeSchool(school_name);

create table ExchangeApplication(
student_id			int,
school_id			int,
application_status	varchar(12),
applied_semester	enum('fall', 'spring', 'summer'),
application_point	double,
year				smallint,
primary key (student_id, school_id),
foreign key (student_id) references Student(student_id),
foreign key (school_id) references ExchangeSchool(school_id));

create trigger application_status_setter
before insert
on ExchangeApplication
for each row
	set new.application_status = 'pending';

create trigger application_year_setter
before insert
on ExchangeApplication
for each row
	set new.year = date_format(NOW(), "%Y");
	


create table ResponsibleFor(
student_id 		int,
school_id		int,
admin_id		int,
primary key(student_id, school_id),
foreign key (student_id) references Student(student_id),
foreign key (school_id) references ExchangeSchool(school_id),
foreign key (admin_id) references Administrative_Unit(admin_id));

create table Car_Sticker(
sticker_id 	int primary key,
plate_no	varchar(10) not null unique,
start_date	Date not null,
end_date	date not null,
car_type	varchar(32) not null,
driver_licence_no 	varchar(32) not null,
penalty_point	int,
owner_id 		int,
foreign key (owner_id) references User(user_id));


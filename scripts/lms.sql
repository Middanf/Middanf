CREATE DATABASE lms;

USE lms;

CREATE TABLE ´user´ (
	user_id INT PRIMARY KEY auto_increment,
	name_user VARCHAR(50) NOT NULL,
	lastname VARCHAR(50) NOT NULL,
	login VARCHAR(50) NOT NULL,
	´password´ VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL UNIQUE,
	cellphone INT(10),
	created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE category (
	category_id INT PRIMARY KEY AUTO_INCREMENT,
	category_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE quiz (
	quiz_id INT PRIMARY KEY AUTO_INCREMENT,
    score INT NOT NULL
) ;

CREATE TABLE course (
	course_id INT PRIMARY KEY auto_increment,
	course_name VARCHAR(50) UNIQUE NOT NULL,
	category_id INT NOT NULL,
	quiz_id INT NOT NULL,
	CONSTRAINT course_category_fk FOREIGN KEY (category_id) REFERENCES category (category_id),
	CONSTRAINT course_quiz_fk FOREIGN KEY (quiz_id) REFERENCES quiz (quiz_id)
);

CREATE TABLE user_course (
	user_id INT NOT NULL,
    course_id INT NOT NULL,
    suscription_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT user_course_user_fk FOREIGN KEY (user_id) REFERENCES ´user´ (user_id),
    CONSTRAINT user_course_course_fk FOREIGN KEY (course_id) REFERENCES course (course_id)
);

ALTER TABLE user_course 
ADD CONSTRAINT user_course_pk PRIMARY KEY (user_id, course_id);

CREATE TABLE answer (
	answer_id INT PRIMARY KEY AUTO_INCREMENT,
    is_correct CHAR(1) NOT NULL,
    description TEXT NOT NULL,
    CONSTRAINT CHK_answer CHECK(is_correct = '1' OR is_correct = '0')
);


CREATE TABLE question (
	question_id INT PRIMARY KEY AUTO_INCREMENT,
    description TEXT NOT NULL,
    correct_answer INT NOT NULL,
    answer_id INT NOT NULL,
    quiz_id INT NOT NULL,
    CONSTRAINT question_answer_fk FOREIGN KEY (answer_id) REFERENCES answer (answer_id),
    CONSTRAINT question_quiz_fk FOREIGN KEY (quiz_id) REFERENCES quiz (quiz_id)
);


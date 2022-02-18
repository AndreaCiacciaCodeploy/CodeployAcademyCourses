CREATE TABLE courses (
	"name" varchar(20) NULL,
	description varchar(130) NULL,
	author varchar(80) NULL,
	languages varchar(5) NULL,
	course_id serial NOT NULL
);

INSERT INTO courses
("name", description, author, languages, course_id)
VALUES('cloud computing', 'corso fondamenti cloud', 'Andrea Gialli', 'IT', 1);
INSERT INTO courses
("name", description, author, languages, course_id)
VALUES('UX Design', 'ux and ui design', 'Federica Rossi', 'EN', 2);
INSERT INTO courses
("name", description, author, languages, course_id)
VALUES('aws fundamentals', 'introduzione servizi cloud aws', 'Paolo Verdi', 'IT', 3);

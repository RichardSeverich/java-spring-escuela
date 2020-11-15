CREATE TABLE users(
   id INT AUTO_INCREMENT,
   username VARCHAR(10) NOT NULL UNIQUE,
   password VARCHAR(10) NOT NULL,
   dni VARCHAR(7) NOT NULL UNIQUE,
   name VARCHAR(30) NOT NULL,
   father_last_name VARCHAR(30) NOT NULL,
   mother_last_name VARCHAR(30) NOT NULL,
   birth_date DATE NOT NULL,
   telephone TEXT NOT NULL,
   address TEXT NOT NULL,
   email TEXT NOT NULL,
   type VARCHAR(12) NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

CREATE TABLE students(
   id INT AUTO_INCREMENT,
   dni VARCHAR(10) NOT NULL UNIQUE,
   name VARCHAR(30) NOT NULL,
   father_last_name VARCHAR(30) NOT NULL,
   mother_last_name VARCHAR(30) NOT NULL,
   birth_date DATE NOT NULL,
   telephone TEXT NOT NULL,
   address TEXT NOT NULL,
   email TEXT NOT NULL,
   yunta TEXT NOT NULL,
   grade TEXT NOT NULL,
   weapon TEXT NOT NULL,
   promo TEXT NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

CREATE TABLE courses(
   id INT AUTO_INCREMENT,
   name TEXT NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

CREATE TABLE subjects(
   id INT AUTO_INCREMENT,
   name TEXT NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

CREATE TABLE courses_students(
   id INT AUTO_INCREMENT,
   id_course INT NOT NULL,
   id_student INT NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   FOREIGN KEY (id_course) REFERENCES courses(id),
   FOREIGN KEY (id_student) REFERENCES students(id),
   UNIQUE (id_course, id_student),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

CREATE TABLE courses_subjects(
   id INT AUTO_INCREMENT,
   id_course INT NOT NULL,
   id_subject INT NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   FOREIGN KEY (id_course) REFERENCES courses(id),
   FOREIGN KEY (id_subject) REFERENCES subjects(id),
   UNIQUE (id_subject, id_course),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

CREATE TABLE subjects_students(
   id INT AUTO_INCREMENT,
   id_subject INT NOT NULL,
   id_student INT NOT NULL,
   score TEXT NOT NULL,
   creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   update_date DATETIME ON UPDATE CURRENT_TIMESTAMP,
   created_by VARCHAR(10),
   updated_by VARCHAR(10),
   FOREIGN KEY (created_by) REFERENCES users(username),
   FOREIGN KEY (updated_by) REFERENCES users(username),
   FOREIGN KEY (id_subject) REFERENCES subjects(id),
   FOREIGN KEY (id_student) REFERENCES students(id),
   UNIQUE (id_subject, id_student),
   PRIMARY KEY (id)
)AUTO_INCREMENT=1000;

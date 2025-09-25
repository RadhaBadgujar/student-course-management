-- Roles
INSERT INTO role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, name) VALUES (2, 'ROLE_FACULTY');
INSERT INTO role (id, name) VALUES (3, 'ROLE_STUDENT');

-- Faculties
INSERT INTO faculty (id, name, email, phone, department)
VALUES (1, 'Dr. Sharma', 'sharma@college.com', '9876543210', 'Computer Science');

INSERT INTO faculty (id, name, email, phone, department)
VALUES (2, 'Prof. Mehta', 'mehta@college.com', '9876501234', 'Mathematics');

-- Courses
INSERT INTO course (id, title, code, description, faculty_id)
VALUES (1, 'Java Programming', 'CS101', 'Core Java and OOPs concepts', 1);

INSERT INTO course (id, title, code, description, faculty_id)
VALUES (2, 'Calculus I', 'MATH101', 'Introductory calculus course', 2);

-- Students
INSERT INTO student (id, first_name, last_name, email, password, phone, created_at)
VALUES (1, 'Radha', 'Patil', 'radha@student.com', 'password123', '9998887770', NOW());

INSERT INTO student (id, first_name, last_name, email, password, phone, created_at)
VALUES (2, 'Ankit', 'Sharma', 'ankit@student.com', 'password123', '9998881110', NOW());

-- Users (link to student/faculty)
INSERT INTO users (id, email, password, student_id, faculty_id)
VALUES (1, 'admin@scms.com', 'admin123', NULL, NULL);

INSERT INTO users (id, email, password, student_id, faculty_id)
VALUES (2, 'radha@student.com', 'password123', 1, NULL);

INSERT INTO users (id, email, password, student_id, faculty_id)
VALUES (3, 'sharma@college.com', 'password123', NULL, 1);

-- User ↔ Roles mapping
INSERT INTO users_roles (user_id, role_id) VALUES (1, 1); -- Admin
INSERT INTO users_roles (user_id, role_id) VALUES (2, 3); -- Student
INSERT INTO users_roles (user_id, role_id) VALUES (3, 2); -- Faculty

-- Enrollments
INSERT INTO enrolment (id, student_id, course_id, enrolled_on, status)
VALUES (1, 1, 1, NOW(), 'ACTIVE');

INSERT INTO enrolment (id, student_id, course_id, enrolled_on, status)
VALUES (2, 2, 2, NOW(), 'ACTIVE');

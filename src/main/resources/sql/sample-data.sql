INSERT INTO student (student_no, name, department, grade) VALUES
('2024001', '김민수', '컴퓨터공학과', 1),
('2023002', '이서연', '소프트웨어학과', 2),
('2022003', '박준호', '정보통신공학과', 3),
('2021004', '최지우', '인공지능학과', 4);

INSERT INTO professor (professor_no, name, department, office) VALUES
('P1001', '홍길동', '컴퓨터공학과', '공학관 301호'),
('P1002', '김영희', '소프트웨어학과', 'IT관 502호'),
('P1003', '이철수', '인공지능학과', 'AI센터 201호');

INSERT INTO course (course_code, course_name, credit, professor_id) VALUES
('CSE101', '자바프로그래밍', 3, 1),
('SWE201', '데이터베이스', 3, 2),
('AI301', '머신러닝개론', 3, 3),
('CSE202', '자료구조', 3, 1);

INSERT INTO enrollment (student_id, course_id, semester, status) VALUES
(1, 1, '2026-1', 'ENROLLED'),
(1, 2, '2026-1', 'ENROLLED'),
(2, 2, '2026-1', 'ENROLLED'),
(2, 3, '2026-1', 'ENROLLED'),
(3, 1, '2026-1', 'ENROLLED'),
(3, 4, '2026-1', 'CANCELLED'),
(4, 3, '2026-1', 'ENROLLED');

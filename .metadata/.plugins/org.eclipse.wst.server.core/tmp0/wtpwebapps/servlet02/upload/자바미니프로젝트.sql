CREATE TABLE tbl_java_user(
    id VARCHAR2(50) NOT NULL,
    PW VARCHAR2(50) NOT NULL,
    name VARCHAR2(20),
    admin VARCHAR2(1),
    email VARCHAR2(100),
    money NUMBER
);

ALTER TABLE tbl_java_user
ADD CONSTRAINT tbl_java_user_pk PRIMARY KEY(id);

INSERT INTO tbl_java_user
VALUES('admin', 'admin', 'PAKR','Y', 'admin@naver.com',0);
INSERT INTO tbl_java_user
VALUES('user1', 'user1', 'Michael','N', 'michael@naver.com',100000);

SELECT *
FROM tbl_java_user;


CREATE SEQUENCE num_seq
    start with 1
    increment by 1
    maxvalue 10000
    nocache
    nocycle;
    
CREATE TABLE tbL_java_product(
    num  NUMBER NOT NULL,
    name VARCHAR2(50),
    company VARCHAR2(50),
    price NUMBER,
    qty NUMBER
); 

ALTER TABLE tbL_java_product
ADD CONSTRAINT tbl_java_product_pk PRIMARY KEY(num);

INSERT INTO tbL_java_product
VALUES(num_seq.nextval, '혼자 공부하는 자바', '한빛미디어', 30000, 5);
INSERT INTO tbL_java_product
VALUES(num_seq.nextval, '같이 공부하는 자바', '한울', 10000, 0);

COMMIT;

select *
from tbL_java_product;

--1. 로그인 페이지 : 아이디 비밀번호 조회
SELECT id, pw, admin 
FROM tbl_java_user;
--WHERE id = 'admin';

COMMIT;

SELECT ID, PW
FROM tbl_java_user
WHERE id = 'user';
CREATE DATABASE db_name;

CREATE IF NOT EXISTS DATABASE db_name;

USE db_name;


CREATE TABLE `main`.`table_new` (.  //main 데이터베이스 안 table_new 테이블을 생성합니다
  `id` INT NOT NULL AUTO_INCREMENT, //첫번째 열 이름은 'id'며 INT형, NN, AI 입니다
  `name` VARCHAR(45) NOT NULL, //두번째 열 이름은 'name'이며 VARCHAR(45), NN 입니다
  `age` VARCHAR(45) NULL, //세번째 열 이름은 'age'이며 VARCHAR(45), NULL이 가능합니다
  PRIMARY KEY (`id`)); // 그 중 primary key는 'id' 입니다
  
  
  INSERT INTO table_new (id, name, age)
       VALUES (1, '김철수', 24);
       
       
  INSERT INTO table_new
       VALUES (2, '신짱구', 7);
  
  INSERT INTO table_new (name, age)
       VALUES ('신짱아', 7);

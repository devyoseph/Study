ALTER TABLE main.table_new
ADD CONSTRAINT rule_age CHECK (age<=100 AND age>5);

ALTER TABLE main.table_new DROP CONSTRAINT rule_age;

ALTER TABLE `main`.`practice2` 
ADD CONSTRAINT `practice_id`
  FOREIGN KEY (`id`)
  REFERENCES `main`.`practice` (`id`)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;


'CREATE TABLE `practice2` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Name` text,
  `Salary` double DEFAULT NULL,
  `Grade` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `practice_id` FOREIGN KEY (`id`) REFERENCES `practice` (`id`)
  ON DELETE RESTRICT ON UPDATE RESTRICT
)

ALTER TABLE `main`.`practice2` 
DROP FOREIGN KEY `practice_id`; //현재 외래키를 지우고
ALTER TABLE `main`.`practice2`  //다시 만듭니다
ADD CONSTRAINT `practice_id`
  FOREIGN KEY (`id`)
  REFERENCES `main`.`practice` (`id`)
  ON DELETE CASCADE //CASCADE 속성으로 바꿉니다
  ON UPDATE RESTRICT;
  
 DELETE FROM main.practice WHERE id>5 AND id<30;

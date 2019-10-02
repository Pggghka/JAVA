INSERT INTO PUBLIC.UNI_GROUP (UNI_GROUP_NUMBER)
VALUES (441),
       (451),
       (234);

INSERT INTO PUBLIC.STUDENT (FIRST_NAME, SECOND_NAME, MIDDLE_NAME, UNI_GROUP_ID)
VALUES ('Sergey', 'Agapov','Leonidovich' ,1),
       ('Pavel', 'Shlyuplkin', 'Alexandrovich', 1),
       ('Viktoria', 'Suslikova', 'Ivanovna', 3),
       ('Vartanian', 'Inna', 'Dmitrievna',2),
       ('Vartanian', 'Gotti', 'Vartgesovich',2);

SELECT * From STUDENT
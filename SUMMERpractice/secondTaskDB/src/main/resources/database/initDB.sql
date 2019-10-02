DROP TABLE IF EXISTS PUBLIC.UNI_GROUP;

CREATE TABLE PUBLIC.UNI_GROUP (
                                  ID          INTEGER      NOT NULL AUTO_INCREMENT,
                                  UNI_GROUP_NUMBER  INTEGER NOT NULL,
                                  CONSTRAINT GROUP_PRIMARY_KEY PRIMARY KEY (ID),
);

DROP TABLE IF EXISTS PUBLIC.STUDENT;

CREATE TABLE PUBLIC.STUDENT (
                                ID         INTEGER      NOT NULL AUTO_INCREMENT,
                                FIRST_NAME  VARCHAR(255) NOT NULL,
                                SECOND_NAME VARCHAR(255)   NOT NULL,
                                MIDDLE_NAME VARCHAR(255) NOT NULL,
                                UNI_GROUP_ID  INTEGER      NOT NULL,
                                CONSTRAINT STUDENT_PRIMARY_KEY PRIMARY KEY (ID),
                                CONSTRAINT UNI_GROUP_FOREIGN_KEY FOREIGN KEY (UNI_GROUP_ID) REFERENCES UNI_GROUP (ID)
);
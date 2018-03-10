DROP TABLE IF EXISTS
bug_detail, bug_project CASCADE;

CREATE TABLE bug_project
(id BIGINT PRIMARY KEY AUTO_INCREMENT
  ,name VARCHAR(50) NOT NULL
);

CREATE TABLE bug_detail
(id BIGINT PRIMARY KEY AUTO_INCREMENT
  ,projectId BIGINT NOT NULL
  ,severity INT NOT NULL
  ,title VARCHAR(50) NOT NULL
  ,reportUser VARCHAR(50)
  ,createDate TIMESTAMP NOT NULL
);

ALTER TABLE bug_detail
  ADD CONSTRAINT fk_projectId
FOREIGN KEY(projectId) REFERENCES bug_project(id);

INSERT INTO bug_project(name) VALUES ('System1');
INSERT INTO bug_project(name) VALUES ('System2');

INSERT INTO bug_detail(projectId, severity, title, reportUser, createDate)
VALUES (1, 10, 'title1', 'tom', now());
INSERT INTO bug_detail(projectId, severity, title, reportUser, createDate)
VALUES (1, 20, 'title2', 'jerry', now());
INSERT INTO bug_detail(projectId, severity, title, reportUser, createDate)
VALUES (1, 30, 'title3', 'ben', now());
-------------------------------------------------------
--                      USER                         --
-------------------------------------------------------

CREATE TABLE USER (
  USER_ID VARCHAR(36) NOT NULL PRIMARY KEY,
  FIRSTNAME VARCHAR(36) NOT NULL DEFAULT '',
  LASTNAME VARCHAR(36) NOT NULL DEFAULT '',
  EMAIL VARCHAR(50) NOT NULL DEFAULT '',
  USERNAME VARCHAR(36) NOT NULL DEFAULT '',
  PASSWORD VARCHAR(60) NOT NULL DEFAULT '',
  ENABLED TINYINT NOT NULL DEFAULT 1
) ;

-------------------------------------------------------
--                      ROLE                         --
-------------------------------------------------------

CREATE TABLE ROLE (
  ROLE_ID INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  ROLE VARCHAR(36) NOT NULL DEFAULT ''
) ;

-------------------------------------------------------
--                      USERROLE                     --
-------------------------------------------------------

CREATE TABLE USERROLES(
    USER_ID VARCHAR(36) NOT NULL,
    ROLE_ID INT(10) UNSIGNED NOT NULL,
    (USER_ID) REFERENCES USER(USER_ID),
    (ROLE_ID) REFERENCES ROLE(ROLE_ID)
);
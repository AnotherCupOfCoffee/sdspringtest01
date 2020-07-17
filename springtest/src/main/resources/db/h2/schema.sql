

drop table TAB_MASTER if exists;

CREATE TABLE TAB_MASTER (
	id     INTEGER IDENTITY PRIMARY KEY,
   entry_name VARCHAR(40),
  infotext VARCHAR(80),
  isbn VARCHAR(20)
  );

drop table TAB_USERS if exists;

CREATE TABLE TAB_USERS (
  nuser_id   INTEGER IDENTITY PRIMARY KEY,
   cuser_name VARCHAR(40),
   cuser_pwd VARCHAR(40),
  ccomment VARCHAR(80)
);

drop table USER if exists;

CREATE TABLE USER (
  id   INTEGER IDENTITY PRIMARY KEY,
   FULLNAME VARCHAR(80),
   PASSWORD VARCHAR(40),
  USERNAME VARCHAR(40)
);


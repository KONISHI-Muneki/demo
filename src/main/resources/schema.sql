CREATE TABLE PERSON (
	id varchar(10) NOT NULL,
	name varchar(100) NOT NULL,
	location varchar(100) NOT NULL,
	birth_date varchar(100) NOT NULL,
	primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
  VALUES
      ('1', 'Yamada', 'Hokkaido', '20220101')
    , ('2', 'Tanaka', 'Tokyo'   , '20220202')
    , ('3', 'Sato'  , 'Okinawa' , '20220303')
;
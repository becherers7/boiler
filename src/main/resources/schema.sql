DROP TABLE IF EXISTS people;

CREATE TABLE careers (
   id INT AUTO_INCREMENT PRIMARY KEY,
   career VARCHAR(250) NOT NULL
);

CREATE TABLE people (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career_id INT,
  foreign key (career_id) references careers(id)
);

INSERT INTO vocname (name) VALUES("Dmitry");
INSERT INTO vocname (name) VALUES("Bob");
INSERT INTO vocposition (position) VALUES("Engineer");
INSERT INTO vocposition (position) VALUES("Manager");

INSERT INTO absence (cause, name, position, absencedate, absencetime) VALUES("He is ill", "Dmitry", "Engineer", CURDATE(),'08:00:00');
INSERT INTO absence (cause, name, position, absencedate, absencetime) VALUES("He is late", "Bob", "Manager", CURDATE(),'08:00:00');
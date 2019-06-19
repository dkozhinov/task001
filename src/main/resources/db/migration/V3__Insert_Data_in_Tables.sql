INSERT INTO vocname (name) VALUES("Дмитрий Кожинов");
INSERT INTO vocname (name) VALUES("Иван Галкин");
INSERT INTO vocname (name) VALUES("Антон Семенов");
INSERT INTO vocposition (position) VALUES("Инженер");
INSERT INTO vocposition (position) VALUES("Начальник отдела");
INSERT INTO vocposition (position) VALUES("Ведущий инженер");

INSERT INTO absence (cause, name, position, absencedate, absencetime) VALUES("Был у врача", "Борис Ворошилов", "Рукводитель направления", '2019-06-19','02:10');
INSERT INTO absence (cause, name, position, absencedate, absencetime) VALUES("Находился в пробке", "Константин Логачев", "Водитель", '2019-06-17','04:00');
commit;
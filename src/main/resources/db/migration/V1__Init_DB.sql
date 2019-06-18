    create table absence (
        id int not null auto_increment,
        cause varchar(255),
        id_name int,
        id_position int,
        name varchar(255),
        position nvarchar(255),
        primary key (id)
    );

   create table vocposition (
        id int not null auto_increment,
        position nvarchar(255),
        primary key (id)
    );

   create table vocname (
        id int not null auto_increment,
        name nvarchar(255),
        primary key (id)
    );


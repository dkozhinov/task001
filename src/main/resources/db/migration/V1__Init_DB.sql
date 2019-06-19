    create table absence (
        id int not null auto_increment,
        cause varchar(255) null,
        name varchar(255) null,
        position varchar(255) null,
        primary key (id)
    );

   create table vocposition (
        id int not null auto_increment,
        position varchar(255),
        primary key (id)
    );

   create table vocname (
        id int not null auto_increment,
        name varchar(255),
        primary key (id)
    );


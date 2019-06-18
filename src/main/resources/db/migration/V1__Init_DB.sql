    create table dbo.absence (
        id int not null,
        cause varchar(255),
        id_name int,
        id_position int,
        name varchar(255),
        position nvarchar(255),
        primary key (id)
    )

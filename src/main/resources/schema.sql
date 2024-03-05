create table plants (
    id int not null primary key,
    name varchar(32) not null,
    description varchar(32),
    origin varchar(32) not null,
    hardiness_zone varchar(32) not null,
    soil_type varchar(32) not null
);
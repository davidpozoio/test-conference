create table if not exists conference (
    id serial primary key,
    description varchar(100) not null,
    city varchar(100) not null,
    total_assistants int not null
);

create table if not exists assitant(
    id serial primary key,
    full_name varchar(100) not null,
    role varchar(100) not null,
    age int not null,
    conference_id int not null,
    foreign key(conference_id) references conference(id)
);
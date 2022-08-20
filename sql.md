```mysql
create table user
(
    id       int auto_increment
        primary key,
    username varchar(255)                   not null,
    password varchar(255)                   not null,
    age      int                            null,
    sex      varchar(255) default 'unknown' not null,
    address  varchar(255) default 'unknown' not null,
    constraint user_id_uindex
        unique (id)
)
    auto_increment = 8;
```


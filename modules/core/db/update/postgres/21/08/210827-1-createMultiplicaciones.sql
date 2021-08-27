create table VITRONTRACK_MULTIPLICACIONES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MULTIPLICACION varchar(100) not null,
    ID_PADRE_ID uuid,
    --
    primary key (ID)
);
-- begin CONTENEDORES
create table CONTENEDORES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTENEDOR varchar(100) not null,
    TAG_ID varchar(100),
    --
    primary key (ID)
)^
-- end CONTENEDORES
-- begin VITRONTRACK_VARIEDADES
create table VITRONTRACK_VARIEDADES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VARIEDAD varchar(100) not null,
    --
    primary key (ID)
)^
-- end VITRONTRACK_VARIEDADES
-- begin VITRONTRACK_MULTIPLICACIONES
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
)^
-- end VITRONTRACK_MULTIPLICACIONES
-- begin VITRONTRACK_PRODUCCIONES
create table VITRONTRACK_PRODUCCIONES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DETALLE varchar(500) not null,
    FECHA date not null,
    CONTENEDOR_ID uuid not null,
    VARIEDAD_ID uuid not null,
    MULTIPLICACION_ID uuid not null,
    MEDIOS_ID uuid not null,
    CANTIDAD integer,
    --
    primary key (ID)
)^
-- end VITRONTRACK_PRODUCCIONES
-- begin VITRONTRACK_MEDIOS
create table VITRONTRACK_MEDIOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MEDIO varchar(100) not null,
    --
    primary key (ID)
)^
-- end VITRONTRACK_MEDIOS

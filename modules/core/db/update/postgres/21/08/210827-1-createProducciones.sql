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
    --
    primary key (ID)
);
create unique index IDX_CONTENEDORES_UK_TAG_ID on CONTENEDORES (TAG_ID) where DELETE_TS is null ;
create unique index IDX_CONTENEDORES_UK_CONTENEDOR on CONTENEDORES (CONTENEDOR) where DELETE_TS is null ;
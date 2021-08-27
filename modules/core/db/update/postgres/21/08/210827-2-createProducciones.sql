alter table VITRONTRACK_PRODUCCIONES add constraint FK_VITRONTRACK_PRODUCCIONES_ON_CONTENEDOR foreign key (CONTENEDOR_ID) references CONTENEDORES(ID);
alter table VITRONTRACK_PRODUCCIONES add constraint FK_VITRONTRACK_PRODUCCIONES_ON_VARIEDAD foreign key (VARIEDAD_ID) references VITRONTRACK_VARIEDADES(ID);
alter table VITRONTRACK_PRODUCCIONES add constraint FK_VITRONTRACK_PRODUCCIONES_ON_MULTIPLICACION foreign key (MULTIPLICACION_ID) references VITRONTRACK_MULTIPLICACIONES(ID);
alter table VITRONTRACK_PRODUCCIONES add constraint FK_VITRONTRACK_PRODUCCIONES_ON_MEDIOS foreign key (MEDIOS_ID) references VITRONTRACK_MEDIOS(ID);
create index IDX_VITRONTRACK_PRODUCCIONES_ON_CONTENEDOR on VITRONTRACK_PRODUCCIONES (CONTENEDOR_ID);
create index IDX_VITRONTRACK_PRODUCCIONES_ON_VARIEDAD on VITRONTRACK_PRODUCCIONES (VARIEDAD_ID);
create index IDX_VITRONTRACK_PRODUCCIONES_ON_MULTIPLICACION on VITRONTRACK_PRODUCCIONES (MULTIPLICACION_ID);
create index IDX_VITRONTRACK_PRODUCCIONES_ON_MEDIOS on VITRONTRACK_PRODUCCIONES (MEDIOS_ID);

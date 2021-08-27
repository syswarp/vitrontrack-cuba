alter table VITRONTRACK_PRODUCCIONES add column CANTIDAD integer ^
update VITRONTRACK_PRODUCCIONES set CANTIDAD = 0 where CANTIDAD is null ;
alter table VITRONTRACK_PRODUCCIONES alter column CANTIDAD set not null ;

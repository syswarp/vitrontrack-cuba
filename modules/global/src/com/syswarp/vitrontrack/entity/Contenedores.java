package com.syswarp.vitrontrack.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CONTENEDORES")
@Entity(name = "vitrontrack_Contenedores")
public class Contenedores extends StandardEntity {
    private static final long serialVersionUID = 4651465852639337877L;

    @NotNull
    @Column(name = "CONTENEDOR", nullable = false, unique = true, length = 100)
    private String contenedor;

    @Column(name = "TAG_ID", unique = true, length = 100)
    private String tag_id;

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public String getContenedor() {
        return contenedor;
    }

    public void setContenedor(String contenedor) {
        this.contenedor = contenedor;
    }
}
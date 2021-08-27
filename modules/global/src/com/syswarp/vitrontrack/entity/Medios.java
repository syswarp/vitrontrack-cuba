package com.syswarp.vitrontrack.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "VITRONTRACK_MEDIOS")
@Entity(name = "vitrontrack_Medios")
@NamePattern("%s|medio")
public class Medios extends StandardEntity {
    private static final long serialVersionUID = -1749988103789855047L;

    @NotNull(message = "No se puede dejar el campo vacio")
    @Column(name = "MEDIO", nullable = false, unique = true, length = 100)
    private String medio;

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
}
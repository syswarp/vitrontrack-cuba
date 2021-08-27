package com.syswarp.vitrontrack.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "VITRONTRACK_VARIEDADES")
@Entity(name = "vitrontrack_Variedades")
@NamePattern("%s|variedad")

public class Variedades extends StandardEntity {
    private static final long serialVersionUID = -479708701055148194L;

    @NotNull
    @Column(name = "VARIEDAD", nullable = false, unique = true, length = 100)
    @NotEmpty(message = "No se puede dejar el campo vacio")
    private String variedad;

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
}
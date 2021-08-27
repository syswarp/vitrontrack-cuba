package com.syswarp.vitrontrack.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "VITRONTRACK_MULTIPLICACIONES")
@Entity(name = "vitrontrack_Multiplicaciones")
@NamePattern("%s|multiplicacion")
public class Multiplicaciones extends StandardEntity {
    private static final long serialVersionUID = -6756434892922896005L;

    @NotNull
    @Column(name = "MULTIPLICACION", nullable = false, unique = true, length = 100)
    @NotEmpty(message = "El campo no puede quedar vacio")
    private String multiplicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PADRE_ID")
    private Multiplicaciones id_padre;

    public Multiplicaciones getId_padre() {
        return id_padre;
    }

    public void setId_padre(Multiplicaciones id_padre) {
        this.id_padre = id_padre;
    }

    public String getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(String multiplicacion) {
        this.multiplicacion = multiplicacion;
    }
}
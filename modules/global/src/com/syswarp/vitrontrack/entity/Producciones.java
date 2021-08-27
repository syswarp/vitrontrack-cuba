package com.syswarp.vitrontrack.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "VITRONTRACK_PRODUCCIONES")
@Entity(name = "vitrontrack_Producciones")
public class Producciones extends StandardEntity {
    private static final long serialVersionUID = -7945102120532004327L;

    @NotNull
    @Column(name = "DETALLE", nullable = false, length = 500)
    @NotEmpty(message = "El campo no puede quedar vacio")
    private String detalle;

    @NotNull(message = "El campo no puede quedar vacio")
    @Column(name = "FECHA", nullable = false)
    private LocalDate fecha;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CONTENEDOR_ID")
    private Contenedores contenedor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VARIEDAD_ID")
    @NotNull
    private Variedades variedad;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MULTIPLICACION_ID")
    private Multiplicaciones multiplicacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MEDIOS_ID")
    private Medios medios;

    public Medios getMedios() {
        return medios;
    }

    public void setMedios(Medios medios) {
        this.medios = medios;
    }

    public Multiplicaciones getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(Multiplicaciones multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public Variedades getVariedad() {
        return variedad;
    }

    public void setVariedad(Variedades variedad) {
        this.variedad = variedad;
    }

    public Contenedores getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedores contenedor) {
        this.contenedor = contenedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
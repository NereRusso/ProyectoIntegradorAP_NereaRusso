package com.portfolio.nr.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    //Contructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    //Getters y Setters
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}

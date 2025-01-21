package com.daw.services.dtos;

public class TopDTO {

    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Double total;

    public TopDTO(String nombre, String telefono, String email, String direccion, Double total) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.total = total;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}

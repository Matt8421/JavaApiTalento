//Paquete que contiene la clase modelo
package com.ArticuloApi.articulo.model;

//Clase que representa el articulo
public class Articulo {

    //Atributo que representa el ID unico del articulo
    private Long id;

    //Atributo que representa el nombre del articulo
    private String nombre;

    //Atributo que representa el precio del articulo    
    private double precio;

    //Constructor vacio requerido por frameworks como Spring y Jackson
    public Articulo() {}

    //Constructor con parametros para facilitar la creacion de objetos
    public Articulo(Long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos getter y setter para acceder y modificar los atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

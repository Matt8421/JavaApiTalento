//Paquete que contiene las interfaces del servicio
package com.ArticuloApi.articulo.service;

import com.ArticuloApi.articulo.model.Articulo;
import java.util.List;
import java.util.Optional;

//Interfaz que define los metodos del servicio de articulos
public interface ArticuloService {
    List<Articulo> listarArticulo();                      //Lista todos los articulos
    Optional<Articulo> obtenerArticuloPorId(Long id);   //Obtiene un articulo por ID
    Articulo guardarArticulo(Articulo articulo);          //Guarda un nuevo articulo
    Articulo actualizarArticulo(Long id,Articulo articulo);     //Actualiza un articulo existente
    void eliminarArticulo(Long id);                     //Elimina un articulo por ID
    
} 

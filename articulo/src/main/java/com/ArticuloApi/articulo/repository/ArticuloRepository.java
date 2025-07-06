//Paquete que contiene las interfaces de acceso a datos
package com.ArticuloApi.articulo.repository;

import com.ArticuloApi.articulo.model.Articulo;
import java.util.List;
import java.util.Optional;

//Interfaz que define operaciones de acceso a datos para articulos
public interface ArticuloRepository {
    List<Articulo> findAll();           //Metodo para obtener todos los articulos
    Optional<Articulo> findById(Long id);   //Metodo para obtener un articulo por id
    Articulo save(Articulo articulo);      //Metodo para guardar o actualizar un articulo
    void deleteById(Long id);                  //Metodo para eliminar un articulo por ID
}

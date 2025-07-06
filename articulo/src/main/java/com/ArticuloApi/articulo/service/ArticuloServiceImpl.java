//Paquete del servicio de implementacion
package com.ArticuloApi.articulo.service;

import com.ArticuloApi.articulo.model.Articulo;
import com.ArticuloApi.articulo.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Anotacion que indica que esta clase es un servicio de Spring
@Service

public class ArticuloServiceImpl  implements ArticuloService {

    //Inyeccion del repositorio que maneja los datos
    private final ArticuloRepository articuloRepository;

    //Constructor con @Autowired para inyectar dependencias
    @Autowired
    public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    //Implementacion para listar articulos
    @Override
    public List<Articulo> listarArticulo(){
        return articuloRepository.findAll();
    }

    //Implementacion para buscar articulo por ID
    @Override
    public Optional<Articulo> obtenerArticuloPorId(Long id){
        return articuloRepository.findById(id);
    }

    //Implementacion para guardar un nuevo articulo
    @Override
    public Articulo guardarArticulo(Articulo articulo){
        return articuloRepository.save(articulo);
    }

    //Implementacion para actualizar un articulo 
    @Override
    public Articulo actualizarArticulo(Long id, Articulo articulo){
        articulo.setId(id);                //Setea el ID existente
        return articuloRepository.save(articulo);
    }

    //Implementacion para eliminar un articulo
    @Override
    public void eliminarArticulo(Long id){
        articuloRepository.deleteById(id);
    }
    
}

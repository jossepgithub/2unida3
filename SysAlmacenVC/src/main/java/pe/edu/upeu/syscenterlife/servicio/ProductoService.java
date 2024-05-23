/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.edu.upeu.syscenterlife.modelo.Producto;
import pe.edu.upeu.syscenterlife.repositorio.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;
    
    // Create
    public Producto guardarEntidad(Producto producto) {
        return productoRepository.save(producto);
    }
    
    // Report
    public List<Producto> listarEntidad() {
        return productoRepository.findAll();
    }
    
    // Update
    public Producto actualizarEntidad(Producto producto) {
        return productoRepository.save(producto);
    }
    
    // Delete
    public void eliminarRegEntidad(Integer idProducto) {
        productoRepository.deleteById(idProducto);
    }
    
    // Buscar por ID
    public Producto buscarProducto(Integer idProducto) {
        return productoRepository.findById(idProducto).orElse(null);
    }
    

}


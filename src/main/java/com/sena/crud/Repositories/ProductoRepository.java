package com.sena.crud.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crud.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}

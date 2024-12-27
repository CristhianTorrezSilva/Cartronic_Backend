package com.example.cartronic_backend.Repository;

import com.example.cartronic_backend.Entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    List<History> findByUserId(Long userId); // Historial filtrado por usuario
    List<History> findByProductId(Long productId); // Historial filtrado por producto
}

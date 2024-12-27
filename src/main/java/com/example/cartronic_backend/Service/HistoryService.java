package com.example.cartronic_backend.Service;

import com.example.cartronic_backend.Dto.HistoryDto;

import java.util.List;

public interface HistoryService {
    HistoryDto getHistoryById(Long id);
    List<HistoryDto> getAllHistory();
    List<HistoryDto> getHistoryByUser(Long userId); // Nuevo método para filtrar por usuario
    List<HistoryDto> getHistoryByProduct(Long productId); // Nuevo método para filtrar por producto
    void deleteHistoryById(Long id);
}

package com.example.cartronic_backend.Mapper;

import com.example.cartronic_backend.Dto.HistoryDto;
import com.example.cartronic_backend.Entity.History;
import com.example.cartronic_backend.Entity.User;
import com.example.cartronic_backend.Entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HistoryMapper {

    // Convertir de History a HistoryDTO
    public static HistoryDto HistoryToHistoryDTO(History history) {
        if (history == null) return null;

        return new HistoryDto(
                history.getId(),
                history.getAction(),
                history.getDate(),
                history.getUser() != null ? history.getUser().getUsername() : null,
                history.getProduct() != null ? history.getProduct().getName() : null
        );
    }

    // Convertir de HistoryDTO a History
    public static History HistoryDTOToHistory(HistoryDto historyDto) {
        if (historyDto == null) return null;

        History history = new History();
        history.setId(historyDto.getId());
        history.setAction(historyDto.getAction());
        history.setDate(historyDto.getDate());

        return history;
    }

    // Método para establecer las relaciones después de la conversión
    public static History setRelations(History history, User user, Product product) {
        history.setUser(user);
        history.setProduct(product);
        return history;
    }

    // Convertir lista de Histories a lista de HistoryDTOs
    public static List<HistoryDto> HistoryToHistoryDTOList(List<History> histories) {
        if (histories == null) return null;

        return histories.stream()
                .map(HistoryMapper::HistoryToHistoryDTO)
                .collect(Collectors.toList());
    }
}
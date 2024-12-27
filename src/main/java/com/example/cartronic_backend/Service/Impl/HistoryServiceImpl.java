package com.example.cartronic_backend.Service.Impl;

import com.example.cartronic_backend.Dto.HistoryDto;
import com.example.cartronic_backend.Entity.History;
import com.example.cartronic_backend.Mapper.HistoryMapper;
import com.example.cartronic_backend.Repository.HistoryRepository;
import com.example.cartronic_backend.Service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {

    private final HistoryRepository historyRepository;
    private final HistoryMapper historyMapper;  // Inyectar el mapper

    @Override
    public HistoryDto getHistoryById(Long id) {
        History history = historyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("History not found"));
        return HistoryMapper.HistoryToHistoryDTO(history);
    }

    @Override
    public List<HistoryDto> getAllHistory() {
        return HistoryMapper.HistoryToHistoryDTOList(historyRepository.findAll());
    }

    @Override
    public List<HistoryDto> getHistoryByUser(Long userId) {
        return HistoryMapper.HistoryToHistoryDTOList(historyRepository.findByUserId(userId));
    }

    @Override
    public List<HistoryDto> getHistoryByProduct(Long productId) {
        return HistoryMapper.HistoryToHistoryDTOList(historyRepository.findByProductId(productId));
    }

    @Override
    public void deleteHistoryById(Long id) {
        historyRepository.deleteById(id);
    }
}
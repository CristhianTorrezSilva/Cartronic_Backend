package com.example.cartronic_backend.Controller;

import com.example.cartronic_backend.Dto.HistoryDto;
import com.example.cartronic_backend.Service.HistoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@AllArgsConstructor
@CrossOrigin("*")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/{id}")
    public ResponseEntity<HistoryDto> getHistoryById(@PathVariable Long id) {
        return ResponseEntity.ok(historyService.getHistoryById(id));
    }

    @GetMapping
    public ResponseEntity<List<HistoryDto>> getAllHistory() {
        return ResponseEntity.ok(historyService.getAllHistory());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<HistoryDto>> getHistoryByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(historyService.getHistoryByUser(userId));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<HistoryDto>> getHistoryByProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(historyService.getHistoryByProduct(productId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHistoryById(@PathVariable Long id) {
        historyService.deleteHistoryById(id);
        return ResponseEntity.noContent().build();
    }
}

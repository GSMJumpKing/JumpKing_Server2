package com.example.jumpking2.controller;

import com.example.jumpking2.domin.Player;
import com.example.jumpking2.dto.PlayerAddRequest;
import com.example.jumpking2.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @PostMapping("/add-player")
    public ResponseEntity add(@RequestBody PlayerAddRequest request) {
        Player player = new Player();
        player.setName(request.getName());
        player.setScore(request.getScore());
        service.add(player);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/show-player")
    public ResponseEntity showAll() {
        return ResponseEntity.ok(service.showAll());
    }
}

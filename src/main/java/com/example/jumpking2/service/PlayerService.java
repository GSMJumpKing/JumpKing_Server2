package com.example.jumpking2.service;

import com.example.jumpking2.domin.Player;
import com.example.jumpking2.repository.MemoryPlayerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class PlayerService {

    private final MemoryPlayerRepository playerRepository;

    public PlayerService(MemoryPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void add(Player player) {
        playerRepository.save(player);
    }

    public ArrayList showAll() {
        return playerRepository.findAll();
    }
}

package com.example.jumpking2.repository;

import com.example.jumpking2.domin.Player;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryPlayerRepository {
    private static ArrayList<Player> store = new ArrayList<>();

    private static Long id = 0L;

    public void save(Player player) {
        player.setId(++id);
        store.add(player);
    }

    public ArrayList findAll() {
        Collections.sort(store, new PlayerScoreComparator());
        return store;
    }
}

class PlayerScoreComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getScore().compareTo(p2.getScore());
    }
}
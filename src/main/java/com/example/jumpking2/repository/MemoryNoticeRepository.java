package com.example.jumpking2.repository;

import com.example.jumpking2.domin.Notice;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryNoticeRepository {
    private static ArrayList<Notice> store = new ArrayList<>();

    private static Long id = 0L;

    public void save(Notice notice) {
        notice.setId(++id);
        store.add(notice);
    }

    public ArrayList findAll() {
        Collections.sort(store, new NoticeDateComparator().reversed());
        return store;
    }

}

class NoticeDateComparator implements Comparator<Notice> {
    @Override
    public int compare(Notice n1, Notice n2) {
        return n1.getDate().compareTo(n2.getDate());
    }
}
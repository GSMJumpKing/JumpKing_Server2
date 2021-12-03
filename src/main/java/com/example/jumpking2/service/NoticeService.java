package com.example.jumpking2.service;

import com.example.jumpking2.domin.Notice;
import com.example.jumpking2.domin.Player;
import com.example.jumpking2.repository.MemoryNoticeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class NoticeService {

    private final MemoryNoticeRepository noticeRepository;

    public NoticeService(MemoryNoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public void add(Notice notice) {
        noticeRepository.save(notice);
    }

    public ArrayList showAll() {
        return noticeRepository.findAll();
    }
}

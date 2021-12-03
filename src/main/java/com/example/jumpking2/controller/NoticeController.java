package com.example.jumpking2.controller;

import com.example.jumpking2.domin.Notice;
import com.example.jumpking2.dto.NoticeAddRequest;
import com.example.jumpking2.service.NoticeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class NoticeController {

    private final NoticeService service;

    public NoticeController(NoticeService service) {
        this.service = service;
    }

    @PostMapping("/add-notice")
    public Notice add(@RequestBody NoticeAddRequest request) {
        Notice notice = new Notice();
        notice.setTitle(request.getTitle());
        notice.setContent(request.getContent());
        notice.setDate(request.getDate());
        service.add(notice);
//        return ResponseEntity.ok().build();
        return notice;
    }

    @GetMapping("/show-notice")
    public ResponseEntity showAll() {
        return ResponseEntity.ok(service.showAll());
    }

}

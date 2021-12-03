package com.example.jumpking2.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class NoticeAddRequest {

    private String title;

    private String content;

    private LocalDate date;

}

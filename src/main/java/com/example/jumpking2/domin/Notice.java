package com.example.jumpking2.domin;

import lombok.Data;

import java.time.LocalDate;
import java.util.*;

@Data
public class Notice {

    private Long id;

    private String title;

    private String content;

    private LocalDate date;
}

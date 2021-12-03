package com.example.jumpking2.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerAddRequest {

    private String name;

    private Long score;
}

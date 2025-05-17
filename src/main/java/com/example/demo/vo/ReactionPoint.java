package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReactionPoint {

    private int id;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    private int memberId;
    private String relTypeCode;
    private int relId;
    private int likePoint;
    private int dislikePoint;
}
package com.example.studentnest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {

    private Long id;
    private String code;
    private String name;
    private String instructor;
    private String room;
    private String building;
    private List<String> days;
    private LocalTime startTime;
    private LocalTime endTime;
    private String semester;
    private String type;
    private Integer colorIndex;

    // Aggregated fields
    private Double averageRating;
    private Long reviewCount;
}

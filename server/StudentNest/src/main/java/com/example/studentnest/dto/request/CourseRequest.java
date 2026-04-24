package com.example.studentnest.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class CourseRequest {

    @NotBlank(message = "Course code is required")
    private String code;

    @NotBlank(message = "Course name is required")
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
}

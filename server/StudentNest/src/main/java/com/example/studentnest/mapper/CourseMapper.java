package com.example.studentnest.mapper;

import com.example.studentnest.dto.request.CourseRequest;
import com.example.studentnest.dto.response.CourseResponse;
import com.example.studentnest.entity.Course;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CourseMapper {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public CourseResponse toResponse(Course course, Double avgRating, Long reviewCount) {
        return CourseResponse.builder()
                .id(course.getId())
                .code(course.getCode())
                .name(course.getName())
                .instructor(course.getInstructor())
                .room(course.getRoom())
                .building(course.getBuilding())
                .days(parseDays(course.getDays()))
                .startTime(course.getStartTime())
                .endTime(course.getEndTime())
                .semester(course.getSemester())
                .type(course.getType())
                .colorIndex(course.getColorIndex())
                .averageRating(avgRating)
                .reviewCount(reviewCount)
                .build();
    }

    public Course toEntity(CourseRequest request) {
        return Course.builder()
                .code(request.getCode())
                .name(request.getName())
                .instructor(request.getInstructor())
                .room(request.getRoom())
                .building(request.getBuilding())
                .days(serializeDays(request.getDays()))
                .startTime(request.getStartTime())
                .endTime(request.getEndTime())
                .semester(request.getSemester())
                .type(request.getType())
                .colorIndex(request.getColorIndex() != null ? request.getColorIndex() : 0)
                .build();
    }

    // JSON serialization for days field
    private List<String> parseDays(String daysJson) {
        if (daysJson == null || daysJson.isBlank()) return Collections.emptyList();
        try {
            return objectMapper.readValue(daysJson, new TypeReference<List<String>>() {});
        } catch (JsonProcessingException e) {
            return Collections.emptyList();
        }
    }

    private String serializeDays(List<String> days) {
        if (days == null || days.isEmpty()) return "[]";
        try {
            return objectMapper.writeValueAsString(days);
        } catch (JsonProcessingException e) {
            return "[]";
        }
    }
}

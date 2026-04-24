package com.example.studentnest.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReviewRequest {

    @NotNull(message = "Rating is required")
    @Min(value = 1, message = "Rating must be 1-5")
    @Max(value = 5, message = "Rating must be 1-5")
    private Integer rating;

    @Min(value = 1, message = "Difficulty must be 1-5")
    @Max(value = 5, message = "Difficulty must be 1-5")
    private Integer difficulty;

    @Min(value = 1, message = "Workload must be 1-5")
    @Max(value = 5, message = "Workload must be 1-5")
    private Integer workload;

    private String semester;

    @NotBlank(message = "Comment is required")
    private String comment;
}

package com.nice.exams.examinator.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class Section {
    private String title;
    private String desc;
    @Singular
    private List<Exercise> exercises;
}

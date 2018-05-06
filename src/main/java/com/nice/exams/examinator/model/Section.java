package com.nice.exams.examinator.model;

import lombok.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    private String title;
    private String desc;
    @Singular
    private List<Exercise> exercises;
}

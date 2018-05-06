package com.nice.exams.examinator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    private String title;
    private Section section;

}

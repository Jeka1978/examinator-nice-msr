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
public class Exercise {
    private String question;
    private String answer;
}

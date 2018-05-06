package com.nice.exams.examinator.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class Exercise {
    private String question;
    private String answer;
}

package com.nice.exams.examinator.model;

import lombok.Builder;

/**
 * @author Evgeny Borisov
 */
@Builder
public class Exam {
    private String title;
    private Section section;

}

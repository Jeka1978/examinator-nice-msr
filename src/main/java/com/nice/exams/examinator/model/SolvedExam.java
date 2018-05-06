package com.nice.exams.examinator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolvedExam {
    private String student;
    @Delegate
    @JsonIgnore
    private Exam exam = new Exam();
}

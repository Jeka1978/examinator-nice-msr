package com.nice.exams.examinator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nice.exams.examinator.model.Exam;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class CheckedExam {
    @Delegate
    @JsonIgnore
    private Exam exam;
    private Integer mark;
}

package com.nice.exams.examinator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nice.exams.examinator.model.Exam;
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
public class CheckedExam {
    @Delegate
    @JsonIgnore
    private Exam exam = new Exam();
    private Integer mark;
}

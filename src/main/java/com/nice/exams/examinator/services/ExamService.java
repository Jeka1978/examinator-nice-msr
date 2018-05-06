package com.nice.exams.examinator.services;

import com.nice.exams.examinator.CheckedExam;
import com.nice.exams.examinator.model.SolvedExam; /**
 * @author Evgeny Borisov
 */
public interface ExamService {
    CheckedExam convert(SolvedExam solvedExam);
}

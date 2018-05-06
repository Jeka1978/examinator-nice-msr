package com.nice.exams.examinator;

import com.nice.exams.examinator.model.SolvedExam;
import com.nice.exams.examinator.services.ExamService;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Override
    public CheckedExam convert(SolvedExam solvedExam) {
        return CheckedExam.builder().exam(solvedExam.getExam()).mark(98).build();

    }
}

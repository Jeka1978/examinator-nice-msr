package com.nice.exams.examinator.controllers;

import com.nice.exams.examinator.CheckedExam;
import com.nice.exams.examinator.model.SolvedExam;
import com.nice.exams.examinator.services.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;

    @PostMapping("/check")
    public CheckedExam processExam(@RequestBody SolvedExam solvedExam) {
        return examService.convert(solvedExam);
    }

}

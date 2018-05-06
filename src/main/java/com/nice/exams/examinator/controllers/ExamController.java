package com.nice.exams.examinator.controllers;

import com.nice.exams.examinator.CheckedExam;
import com.nice.exams.examinator.model.ExamRequest;
import com.nice.exams.examinator.model.Exercise;
import com.nice.exams.examinator.model.SolvedExam;
import com.nice.exams.examinator.services.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;


    @PostMapping("/exam")
    public List<Exercise> getExam(@RequestBody Map<String,Integer> examRequest) {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.
        return null;

    }

    @PostMapping("/check")
    public CheckedExam processExam(@RequestBody SolvedExam solvedExam) {
        return examService.convert(solvedExam);
    }

}

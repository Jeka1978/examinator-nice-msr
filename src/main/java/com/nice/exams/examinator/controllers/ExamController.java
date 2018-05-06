package com.nice.exams.examinator.controllers;

import com.nice.exams.examinator.CheckedExam;
import com.nice.exams.examinator.model.Exercise;
import com.nice.exams.examinator.model.SolvedExam;
import com.nice.exams.examinator.services.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;
    private final RestTemplate restTemplate;


    @PostMapping("/exam")
    public List<Exercise> getExam(@RequestBody Map<String,Integer> examRequest) {

        List exercises = new ArrayList<>();
        for (String microserviceName : examRequest.keySet()) {
            Integer amount = examRequest.get(microserviceName);
            microserviceName += "-exam";
            exercises.add(restTemplate.getForObject("http://" + microserviceName + "/java/random?amount=" + amount, List.class));
        }


        return exercises;

    }

    @PostMapping("/check")
    public CheckedExam processExam(@RequestBody SolvedExam solvedExam) {
        return examService.convert(solvedExam);
    }

}

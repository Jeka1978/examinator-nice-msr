package com.nice.exams.examinator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nice.exams.examinator.model.Exam;
import com.nice.exams.examinator.model.Exercise;
import com.nice.exams.examinator.model.Section;
import com.nice.exams.examinator.model.SolvedExam;
import com.nice.exams.examinator.services.ExamService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Evgeny Borisov
 */
public class ExamApiTest {
    @Test
    public void shouldGenerateSolvedExamFromCheckedExam() throws Exception {
        ExamService examService = new ExamServiceImpl();
        SolvedExam solvedExam = SolvedExam.builder()
                .student("Jeka Borisov")
                .exam(Exam.builder()
                        .title("Java Exam")
                        .section(Section.builder().title("spring").desc("BPP questions")
                                .exercise(Exercise.builder().question("what diff between String Spring and Swing").answer("only spring").build())
                                .exercise(Exercise.builder().question("what is the last spring version").answer("5.0.5.RELEASE").build()).build()
                        )
                        .section(Section.builder().title("maven").desc("simple maven questions")
                                .exercise(Exercise.builder().question("what plugin can provide dependecies info").answer("dependency").build()).build()
                        )
                        .build()).build();

        System.out.println(solvedExam);
    CheckedExam checkedExam = examService.convert(solvedExam);
        Assert.assertEquals("Java Exam", checkedExam.getTitle());
        Assert.assertNotNull(checkedExam.getMark());
        System.out.println(checkedExam);
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(checkedExam);
        System.out.println("json = " + json);
    }
}

package com.nice.exams.examinator;

import com.nice.exams.examinator.services.ExamService;
import com.nice.exams.examinator.services.ExamServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@TestConfiguration
public class NeededServicesForControllersConfiguration {
    @Bean
    public ExamService examService(){
        return new ExamServiceImpl();
    }
}

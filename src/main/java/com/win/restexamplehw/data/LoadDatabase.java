package com.win.restexamplehw.data;

import com.win.restexamplehw.domain.Employee;
import com.win.restexamplehw.repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repo){
        return args -> {
            log.info("Preloading " + repo.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repo.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
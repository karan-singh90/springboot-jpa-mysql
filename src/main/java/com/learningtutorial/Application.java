package com.learningtutorial;

import com.learningtutorial.dao.UserDao;
import com.learningtutorial.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(UserDao userDao){
        return args -> {
            User user1 = new User();
            user1.setFirstName("Karan");
            user1.setLastName("Singh");
            user1.setSalary(12345);
            user1.setAge(23);
            user1.setUsername("Karan");
            user1.setPassword("Singh");
            userDao.save(user1);

            User user2 = new User();
            user2.setFirstName("Poonam");
            user2.setLastName("Rathore");
            user2.setSalary(4567);
            user2.setAge(34);
            user2.setUsername("Poonam");
            user2.setPassword("Rathore");
            userDao.save(user2);
        };
    }

}

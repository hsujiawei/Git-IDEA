package com.hsu.gitidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitIdeaApplication {

    public static void main(String[] args) {
        System.out.println("修改后再提交");
        SpringApplication.run(GitIdeaApplication.class, args);
        System.out.println("dev branch change...");
    }

}

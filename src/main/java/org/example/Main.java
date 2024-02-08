package org.example;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentServices;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentServices service = c.getBean(CommentServices.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);

    }
}

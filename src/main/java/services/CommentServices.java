package services;


import model.Comment;
import aspects.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentServices {

    private Logger logger = Logger.getLogger(CommentServices.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Publishing comment:"+comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}

package com.example.designpatterns._02_structuralpatterns._04_decorator.after;

public class DefaultCommentService implements CommentService {

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}

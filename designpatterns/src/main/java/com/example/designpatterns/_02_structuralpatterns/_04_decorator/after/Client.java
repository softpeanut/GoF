package com.example.designpatterns._02_structuralpatterns._04_decorator.after;

public class Client {

    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}

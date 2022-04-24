package com.example.designpatterns._02_structuralpatterns._04_decorator.before;

public class TrimmingCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}

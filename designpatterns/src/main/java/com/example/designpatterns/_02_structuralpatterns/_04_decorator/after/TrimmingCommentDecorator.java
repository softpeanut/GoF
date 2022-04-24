package com.example.designpatterns._02_structuralpatterns._04_decorator.after;

public class TrimmingCommentDecorator extends CommentDecorator {

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        System.out.println("trim");
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}

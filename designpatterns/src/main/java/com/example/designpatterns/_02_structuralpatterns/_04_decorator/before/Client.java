package com.example.designpatterns._02_structuralpatterns._04_decorator.before;

public class Client {

    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://softpeanut.me");
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }
}

package com.example.designpatterns.prototype.before;

public class GithubIssue {

    private int id;

    private String title;

    private final GithubRepository repository;

    public GithubIssue(GithubRepository githubRepository) {
        this.repository = githubRepository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }
}

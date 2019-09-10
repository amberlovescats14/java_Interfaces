package com.mytube;

public class Video {
    private String fileName;
    private String title;
    private User user;

    public Video(
            String fileName,
            String title,
            User user
    ) {
        this.fileName = fileName;
        this.title = title;
        this.user = user;
    }

    private String getFileName() {
        return fileName;
    }

    private void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private User getUser() {
        return user;
    }

    private void setUser(User user) {
        this.user = user;
    }
}

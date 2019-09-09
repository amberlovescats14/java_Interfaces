package com.mytube;

public class VideoProcessor {


    private VideoEncoder encoder;
    private SqlVideoDatabase database;
    private NotificationService notificationService;

    //constructor
    public VideoProcessor(
            VideoEncoder encoder,
            SqlVideoDatabase database,
            EmailService emailService
            ) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = emailService;
    }



    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        notificationService.notify(video.getUser());
    }
}


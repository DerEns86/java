package de.v_ens.interfaces.mediaPlayer;

public class Main {
    public static void main(String[] args) {
        Playable myMusicPlayer = new MusicPlayer();
        Playable myVideoPlayer = new VideoPlayer();

        MusicPlayer testMP = new MusicPlayer();

    testMP.test();

        MediaController mediaController = new MediaController();
        mediaController.playMedia(myMusicPlayer);
        mediaController.playMedia(myVideoPlayer);
    }
}
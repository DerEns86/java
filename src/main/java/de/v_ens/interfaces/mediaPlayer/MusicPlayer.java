package de.v_ens.interfaces.mediaPlayer;

public class MusicPlayer implements Playable{


    @Override
    public void play() {
        System.out.println("Playing music");
    }

    public void test(){
        System.out.println("Test");
    }


}

package nov2;

public class Ipad extends AudioMediaPlayer implements VideoMediaPlayer{

    @Override
    public void playMusic() {
        System.out.println("Ipad can play music");
    }

    @Override
    public void pause() {
        System.out.println("Ipad can pause music");
    }

    @Override
    public void stop() {
        System.out.println("Ipad can stop music");
    }

    @Override
    public void playVideo() {
        System.out.println("Ipad can play Video");
    }
}

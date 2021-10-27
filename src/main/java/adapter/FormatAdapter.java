package adapter;

public class FormatAdapter implements MediaPlayer {
    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String filename) {
        System.out.println("Using Adapter ... MediaPackage -> MediaPlayer");
        mediaPackage.playFile(filename);
    }
}

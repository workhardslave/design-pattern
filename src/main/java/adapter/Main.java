package adapter;

/**
 * Adapter 패턴
 *
 * 한 클래스의 인터페이스를 Wrapping 하여 사용하고자 하는 다른 인터페이스로 변환할 때 주로 사용한다.
 * 인터페이스의 호환성이 맞지 않아 같이 쓸 수 없는 클래스를 연관 관계로 연결해 사용할 수 있게한다.
 */
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MP3();
        MediaPackage mediaPackage = new MP4();

        // adapter 적용 전
        mediaPlayer.play("아모르파티.mp3");
        mediaPackage.playFile("강남스타일 뮤비.mp4");

        // adapter 적용 후
        MediaPlayer adapter = new FormatAdapter(mediaPackage);
        mediaPlayer.play("아모르파티.mp3");
        adapter.play("강남스타일 뮤비.mp4");
    }
}

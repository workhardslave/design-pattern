package builder;

/**
 * Builder 패턴
 *
 * 구조를 가지고 있는 큰 것을 구축, 구조를 이루는 각 부품을 하나씩 만들어 가는 방법이다.
 * 코드 읽기/유지 보수가 편하다.
 * 객체 생성을 깔끔하게 할 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        Text text = new Text.Builder()
                .title("hello")
                .content("내용")
                .items("항목1", "항목2", "항목3")
                .build();

        System.out.println(text);

        Html html = new Html.Builder()
                .title("제목")
                .content("내용")
                .items("항목1", "항목2", "항목3")
                .build();

        System.out.println(html);
    }
}

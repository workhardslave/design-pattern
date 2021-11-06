package strategy;

/**
 * Strategy 패턴
 *
 * 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고, 동적으로 수정이 필요한 경우 전략을 바꾸기만 하면 되는 패턴이다.
 * 알고리즘 부분을 의식적으로 분리하여 필요에 따라 쉽게 교체할 수 있다. 또한, 알고리즘을 개선할 시 알고리즘 부분만 수정하면 된다.
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("player1", new RockStrategy());
        Player player2 = new Player("player2", new PaperStrategy());
        Player player3 = new Player("player3", new RandomStrategy());
        Player player4 = new Player("player4", () -> Hand.SCISSORS);

        for (int i = 0; i < 10; i++) {
//            System.out.println(player1.nextHand().fight(player2.nextHand()));
            System.out.println(player1.nextHand().fight(player3.nextHand()));
//            System.out.println(player1.nextHand().fight(player4.nextHand()));
        }
    }
}

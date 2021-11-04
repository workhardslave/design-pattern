package memento;

import command.MacroCommand;

/**
 * Memento 패턴
 *
 * 객체의 상태를 저장하고 사용자의 필요에 의하여 원하는 시점의 데이터를 복원할 수 있는 패턴이다.
 * ex) undo, redo, 이력 저장, 상태 저장 등의 기능을 구현할 수 있다.
 * DrawCanvas 클래스에 저장, 복원 기능을 만들 수도 있다.
 * 그러나 이처럼 별도의 Memento 클래스를 만들게 되면 각 기능이 분리되어 유지보수와 테스트에 용이하다.
 */
public class Memento {
    private MacroCommand state;

    public Memento(MacroCommand state) {
        this.state = state.clone();
    }

    public MacroCommand getSavedState() {
        return state.clone();
    }
}

package command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private int radius = 5;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    // Memento 패턴에서 사용하는 메서드
    public void setHistory(MacroCommand history) {
        this.history = history;
    }

    @Override
    public void paint(Graphics g) {
        history.run();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(Color.RED);
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

package command;

import javax.swing.*;
import java.awt.event.*;

public class DrawingApp extends JFrame {
    MacroCommand history = new MacroCommand();
    MacroCommand line = new MacroCommand();

    public DrawingApp(String title) {
        super(title);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        Box mainBox = new Box(BoxLayout.Y_AXIS);

        JButton undoButton = new JButton("undo");
        JButton clearButton = new JButton("clear");

        DrawCanvas canvas = new DrawCanvas(400, 400, history);

        buttonBox.add(undoButton);
        buttonBox.add(clearButton);

        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);

        canvas.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command command =  new DrawCommand(canvas, e.getPoint());
                line.add(command);
                command.run();
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        canvas.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                line = new MacroCommand();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                history.add(line);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });
    }
}
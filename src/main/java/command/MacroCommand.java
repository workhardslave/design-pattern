package command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void run() {
        commands.forEach(command -> command.run());
    }

    public void add(Command command) {
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}

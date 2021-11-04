package command;

import java.util.Stack;

public class MacroCommand implements Command, Cloneable {
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

    // 메멘토 패턴에서 사용하는 메서드
    @Override
    public MacroCommand clone() {
        MacroCommand macroCommand = null;

        try {
            macroCommand = (MacroCommand) super.clone();
            macroCommand.commands = (Stack<Command>) this.commands.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return macroCommand;
    }
}

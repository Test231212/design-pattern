package ex10.command;

import ex10.lamp.Lamp;

public class LampCommand implements Command {
    private Lamp lamp;

    public LampCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    public void execute() {
        lamp.lampOn();
    }
}

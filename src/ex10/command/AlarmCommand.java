package ex10.command;

import ex10.alarm.Alarm;

public class AlarmCommand implements Command {
    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    public void execute() {
        alarm.alarmOn();
    }
}


public class LampOff implements ICommand {
    private Lamp lamp;
    @Override
    public void execute() {
        lamp.on();
    }

    LampOff(Lamp lamp){
        this.lamp = lamp;
    }
}

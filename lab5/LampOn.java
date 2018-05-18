public class LampOn implements ICommand {
    private Lamp lamp;
    @Override
    public void execute() {
        lamp.on();
    }

    LampOn(Lamp lamp){
        this.lamp = lamp;
    }
}
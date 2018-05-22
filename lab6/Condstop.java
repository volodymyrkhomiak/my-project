
public class Condstop implements ICommand {
    private AirCond air;

    @Override
    public void execute() {
        air.stop();
    }

    Condstop(AirCond air){
        this.air = air;
    }
}

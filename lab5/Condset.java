
public class Condset implements ICommand{
    private AirCond air;

    @Override
    public void execute() {
        air.set();
    }

    Condset(AirCond air){
        this.air = air;
    }
}
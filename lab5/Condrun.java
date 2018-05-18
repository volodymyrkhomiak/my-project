
public class Condrun implements ICommand {
    private AirCond air;

    @Override
    public void execute() {
        air.run();
    }

   Condrun(AirCond air){
        this.air = air;
    }
}
public class foursquare {
    private int x;
    private int y;

    private int sq;

    private void Square(){
    sq = x + y;
    }
}





public class Prism extends foursquare {
    private int z;

    private int f1;
    private int f;
    private void Square(){
        f1 = ((x*z)*2)+(y*z)*2);
        f = f1+(sq*2);

    }
}

package Tatarin.res;

/**
 * Created by Tatarin D.S. on 09.09.2016.
 * @author Tatarin D.S.
 * Result class
 */
public class Res implements ResInterface {
    private double result;
    public Res(){
        result = 0;
    }
    public Res(double tmp){
       result = tmp;
    }

    @Override
    public void input(double val) {
        result = val;
    }

    @Override
    public double output() {
        return result;
    }
}

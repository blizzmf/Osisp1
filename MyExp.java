package Tatarin.param;

/**
 * Created by Tatarin D.S. on 12.09.2016.
 * @author Tatarin D.S.
 * My exception class
 */

public class MyExp extends Exception{

    private int number;
    public int getNumber(){return number;}
    public MyExp(String message, int num){

        super(message);
        number=num;
    }
}

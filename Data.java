package Tatarin.param;
/**
 * Created by Tatarin D.S. on 09.09.2016.
 * @author Tatarin D.S.
 * Data class
 */
import Tatarin.algorithm.Alg;


import java.util.Scanner;

public class Data implements DataInterface{

    private double V1 = 0, V2 = 0, S = 0, T = 0;
    Scanner sc = new Scanner(System.in);
    public Data(){
        V1 = 0;
        V2 = 0;
        S = 0;
        T = 0;
    }
    public Data(double v1, double v2, double s, double t){
        V1 = v1;
        V2 = v2;
        S = s;
        T = t;
    }
    @Override
    public void input() {
        boolean flag = true;
        while(flag) {
            System.out.println("Введите V1 : ");
            V1 = sc.nextDouble();
            System.out.println("Введите V2 : ");
            V2 = sc.nextDouble();
            System.out.println("Введите S : ");
            S = sc.nextDouble();
            System.out.println("Введите T : ");
            T = sc.nextDouble();
            flag = false;
        }
    }
    @Override
    public void read(Alg.Getdata get) {
        get.V1 = V1;
        get.V2 = V2;
        get.S = S;
        get.T = T;
        //System.out.printf("%f %f %f %f",V1,V2,S,T);
    }
}

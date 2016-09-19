package Tatarin.param;
/**
 * Created by Tatarin D.S. on 11.09.2016.
 * @author Tatarin D.S.
 * Data exception class
 */
import Tatarin.algorithm.Alg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEx implements DataInterface{

    private double V1 = 0, V2 = 0, S = 0, T = 0;
    Scanner sc = new Scanner(System.in);
    public DataEx(){
        V1 = 0;
        V2 = 0;
        S = 0;
        T = 0;
    }
    public DataEx(double v1, double v2, double s, double t){
        V1 = v1;
        V2 = v2;
        S = s;
        T = t;
    }
    @Override
    public void input() {
        boolean flag = true;
        while(flag) {
            try{
                /**
                 * Check input via exception
                 */
                System.out.println("Введите V1 : ");
                V1 = sc.nextDouble();
                System.out.println("Введите V2 : ");
                V2 = sc.nextDouble();
                System.out.println("Введите S : ");
                S = sc.nextDouble();
                System.out.println("Введите T : ");
                T = sc.nextDouble();
                flag = false;
            }catch (InputMismatchException exp){
                sc = new Scanner(System.in);
                System.out.print("Неверное значение\n");
            }

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

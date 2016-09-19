package Tatarin.algorithm;

import Tatarin.param.Data;
import Tatarin.param.DataEx;
/**
 * Created by Tatarin D.S. on 09.09.2016.
 * @author Tatarin D.S.
 * Algorithm class
 */
public class Alg implements AlgInterface {
    public static class Getdata {
        public double V1 = 0, V2 = 0, S = 0, T = 0;
    }

    @Override
    public Getdata way(Data d) {
        Getdata gd = new Getdata();
        d.read(gd);
        System.out.printf("\nV1  = %f V2 = %f S = %f T = %f\n", gd.V1, gd.V2, gd.S, gd.T);
        gd.S += gd.T * (gd.V1 + gd.V2);
        //System.out.printf("%f %f %f %f", gd.V1, gd.V2, gd.S, gd.T);
        return gd;
    }
    public Getdata way(DataEx d) {
        Getdata gd = new Getdata();
        d.read(gd);
        System.out.printf("\nV1  = %f V2 = %f S = %f T = %f\n", gd.V1, gd.V2, gd.S, gd.T);
        gd.S += gd.T * (gd.V1 + gd.V2);
        //System.out.printf("%f %f %f %f", gd.V1, gd.V2, gd.S, gd.T);
        return gd;
    }
}
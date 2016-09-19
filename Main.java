package com.osisp1;

import Tatarin.algorithm.Alg;
import Tatarin.param.Data;
import Tatarin.param.DataEx;
import Tatarin.param.DataInterface;
import Tatarin.param.MyExp;
import Tatarin.res.Res;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Tatarin D.S. on 09.09.2016.
 * @author Tatarin D.S.
 * Main class programm
 */
/**
 * Import my package
 */

public class Main {
    private static Alg alg = new Alg();
    private static Res res = new Res();
    private static boolean ex = false;
    public static void main(String[] args) {
        DataInterface d;
        List<DataInterface> list = new ArrayList<DataInterface>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("1 - С исключениями\n2 - Без исключений\n>>");
        int tmp = sc.nextInt();
        if(args.length > 4) try {
            throw new MyExp("Слишком большое кол-во аргументов", args.length);
        } catch (MyExp myExp) {
            myExp.printStackTrace();
        }
        if(tmp == 1) ex = true;
        if(args.length > 0){
            if (ex) {
                d = new DataEx(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                list.add(d);
            } else {
                d = new Data(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                list.add(d);
            }
        }
        do {
            System.out.println("1 - Добавить в лист");
            System.out.println("2 - Удалить из листа");
            System.out.println("3 - Запустить");
            System.out.println("0 - Выход");
            System.out.print(">>");
            int choise;
            /**
             * Programm menu
             */
            if(ex){
                while (true){
                    try {
                        choise = sc.nextInt();
                        break;
                    }catch (InputMismatchException inMiEx){
                        sc = new Scanner(System.in);
                        System.out.print("Неверное значение\n");
                    }
                }
            }else{
                choise = sc.nextInt();
            }
            switch (choise) {
                /**
                 * Treatment choise
                 */
                case 1:
                    if (ex) d = new DataEx();
                    else d = new Data();
                    d.input();
                    list.add(d);
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Лист пуст");
                    } else {
                        int index;
                        if (ex) {
                            while (true) {
                                try {
                                    System.out.println("Введите индекс : ");
                                    index = sc.nextInt();
                                    break;
                                } catch (InputMismatchException iex) {
                                    sc = new Scanner(System.in);
                                    System.out.print("Неверное значение\n");
                                }
                            }
                        } else
                            index = sc.nextInt();

                        try {
                            list.remove(index);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Размер листа : " + list.size());
                        }
                    }
                    break;
                case 3:
                    startList(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
           // res.input(getd.S);
            //System.out.printf("%f", res.output());
           // System.out.printf("\n%f %f %f %f\n", getd.V1, getd.V2, getd.S, getd.T);
            //System.out.println("Повторим?\nд/н\n");
           // ch = sc.next().charAt(0);
        }while (true);

    }
    public static void startList(List<DataInterface> list){
        for(DataInterface item : list){
            Alg.Getdata getd = new Alg.Getdata();
            if (ex) getd = alg.way((DataEx) item);
            else getd = alg.way((Data) item);
            /**
             * Calculation and output
             */
            res.input(getd.S);
            System.out.printf("Результат : %f\n", res.output());
        }
    }
}
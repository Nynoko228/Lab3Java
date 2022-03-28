package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Step {
    public int stepgoal;
    public static Map<Month, Integer> First(){
        System.out.println("Введите название месяца,номер дня и количество шагов");
        Scanner in = new Scanner(System.in);
        HashMap<Month, Integer> MapMonth = new HashMap<Month, Integer>();
        String a = in.next();
        Month test = new Month();
        String[] months = new String[]{"Январь", "Фераль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        for (int i = 0; i < 12; i++){
            test.nameOfMonth = months[i];
            for (int j = 1; j < 31; j++){
                test.dayOfMonth = j;
                MapMonth.put(test, 0);
            }
        }
        if (a != ""){
            int b = in.nextInt();
            if ((b < 30) && (b > 0)){
                Integer c = in.nextInt();
                if ((c > 0)){
                    Month mnth = new Month();
                    mnth.nameOfMonth = a;
                    mnth.dayOfMonth = b;
                    MapMonth.put(mnth, c);
                }
            }
        }
        return (MapMonth);
    }
    public static void Second(HashMap<Month, Integer> DB){
        System.out.println("Введите название месяца");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int cnt1 = 0;
        double cnt2 = 0;
        int cnt3 = 0;
        int maxSteps = 0;
        int cnt = 0; // Счётчик дней, но хз зачем я его сделал
        Month mnt = new Month();
        if (a != "") {
            //int b = in.nextInt();
            //if ((b < 30) && (b > 0)) {
                for (Map.Entry<Month, Integer> pair : DB.entrySet()){
                    mnt.nameOfMonth = a;
                    //mnt.dayOfMonth = i;
                    //System.out.println(pair.getKey().nameOfMonth);
                    Month text = new Month();
                    text.nameOfMonth = pair.getKey().nameOfMonth;
                    text.dayOfMonth = pair.getKey().dayOfMonth;
                    if ((text.equals(mnt)) && (pair.getValue() == 0)){
                        System.out.println("За день совершено 0 шагов");
                        cnt += 1;
                    }
                    else if ((text.equals(mnt))){
                        System.out.println("За день совершено " + pair.getValue() + " шагов");
                        System.out.print("Это целых " + (pair.getValue()*0.00075) + " км");
                        System.out.println(" и " + (pair.getValue()*0.013) + " Ккал");
                        if (pair.getValue() > maxSteps){
                            maxSteps = pair.getValue();
                            System.out.println("Это новый рекорд!");
                        }
                        cnt1 += pair.getValue();
                        cnt2 += (pair.getValue()*0.00075);
                        cnt3 += (pair.getValue()*0.013);
                        }
                    }
                }
        System.out.println("""
                \n  Что вы сделали за месяц:""");
        System.out.println("Прошли " + cnt2 + " км и это за " + cnt1 + " шагов");
        System.out.println("Сожгли " + cnt3 + " Ккал");

            //}
        //System.out.println(cnt);
    }

    public static int Third(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }



}

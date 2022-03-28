package com.company;

import com.company.Step;
import com.company.Month;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static int Hello(){
        System.out.println("""
                    Здравствуйте!\s
                Выберите ваше действие:\s
                1) Ввод количества шагов за определенный день.\s
                2) Вывод статистики за указанный месяц.\s
                3) Изменить цель по количеству шагов в день.\s
                4) Закончить работу с приложением.\s  
                """);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    public static void main(String[] args) {
	    boolean input = true;
        Step stepgoal = new Step();
        stepgoal.stepgoal = 10000;
        Month test = new Month();
        HashMap<Month, Integer> DB = new HashMap<Month, Integer>();
        Map<Month, Integer> DBTest = new HashMap<Month, Integer>();
        ArrayList<Month> lst = new ArrayList<>();
        Month mn = new Month();
        mn.dayOfMonth = 20;
        mn.nameOfMonth = "Январь";
        DBTest.put(new Month("Январь", 20), 30);
        System.out.println(DBTest.get(mn));
        String[] months = new String[]{"Январь", "Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        for (int i = 0; i < 12; i++){ // Я тут изменил с i < 12 до i < 1 для теста с январём
            test.nameOfMonth = new String(months[i]);
            for (int j = 1; j < 31; j++){
                test.dayOfMonth = j;
                DB.put(new Month(months[i], j), 0);
            }

        }
        while (input) {
            int flag = Hello();

            if (flag == 4){
                input = false;
            }
            else if (flag == 1){
                DB.putAll(com.company.Step.First());
            }
            else if (flag == 2){
                com.company.Step.Second(DB);
            }
            else if (flag == 3){
                stepgoal.stepgoal = com.company.Step.Third();
            }
        }

    }

}

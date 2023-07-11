package tim.exercises.challanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterTest {
    public static double convertToCm(int inches){
        return inches > 0 ? inches * 2.54 : 0;
    }

    public static double convertToCm(int foots, int inches){
        return convertToCm((foots*12)+inches);
    }

    public static String getDurationString(int seconds) {
        String result = "";
        int minutos = seconds / 60 ;
        int horas = minutos / 60;

        int minutosResto = minutos % 60 ;
        int segundosResto = seconds % 60;

        return result+horas+"h "+minutosResto+"m "+segundosResto+"s";
    }

    public static String getDurationString(int minutos, int seconds) {
        String result = "";
        int horas = 0;
        int minutosResto = 0;
        int segundosResto = seconds % 60;
        if(seconds >= 60) {
            int newMinutes = seconds / 60;
            horas = (newMinutes + minutos) / 60 ;
            minutosResto = (newMinutes + minutos) % 60 ;
        }else{
            horas = minutos / 60;
            minutosResto = minutos % 60 ;
        }

        return result+horas+"h "+minutosResto+"m "+segundosResto+"s";
    }

    public static void printYearsAndDays(long minutes){

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long years = days / 365;
            long remainingDays = days % 365;
            if(minutes == 1440)
                System.out.println(minutes+" min = "+years+" y and "+days+" d");
            else
                System.out.println(minutes+" min = "+years+" y and "+remainingDays+" d");
        }
    }

    public static void printEqual(int x, int y, int z) {

        switch (x){
            case 1 -> {}
        }

        if(x < 0 || y < 0 || z < 0)
            System.out.println("Invalid Value");
        else if (x == y && y == z)
            System.out.println("All numbers are equal");
        else if(x != y && y != z && x != z)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPaying(boolean summer, int temperature){
        return summer ? temperature > 45 ? false:true : temperature > 35 ? false:true;
    }

    public static double calculateInterest(double amount, double rate) {
        return ((amount * rate) / 100);
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if( num < 2 ) return !isPrime;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return !isPrime;
            }
        }
        return isPrime;
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

    public static void sum3and5Challenge(){
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if(count == 5){
                break;
            }
            if(( i % 5 == 0 ) && ( i % 3 == 0 )){
                sum += i;
                count++;
                System.out.println("BINGO!!, " + i);
            }
        }

        System.out.println("la suma de los numeros divisibles entre 5 y 3 es: " + sum);
        System.out.println("la cantidad de numeros divisibles entre 5 y 3 es: " + count);

    }

    public static int sumDigits2(int number) {
        int result = -1;
        int sum = 0;
        if(number < 0)
            return result;

        if(number/10 == 0){
            result = number;
            return result;
        }

        do {
            sum += (number%10);
            number = number/10;

        }while(number > 0);

        result = sum;
        return result;
    }

    public static int sumDigits(int number) {
        int result = -1;
        if(number < 0)
            return result;

        String numberString = String.valueOf(number);
        char[] digits = numberString.toCharArray();

        int size = digits.length;

        if(size == 1) {
            result = number;
            return result;
        }
        int sum = 0;
        do {
            size--;
            sum += Integer.valueOf(String.valueOf(digits[size]));

        } while(size > 0);

        result = sum;
        return result;
    }

    public static void main(String[] args) {

        int value = 14;

        switch (value){
            case 1:
                int i;
                i = 10;
                break;
            case 2:
                i = 11;
                System.out.println(i);
            default:
                i = value;
                System.out.println(i);
        }

        System.out.println(sumDigits2(213455));

        int num = 4;
        while (num <= 20){
            ++num;
            if(!isEvenNumber(num))
                continue;
            System.out.println("num: " + num + " is even");

        }
        //    sum3and5Challenge();

        List<Integer> numerosPrimos = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if(isPrime(i)){
                numerosPrimos.add(i);
            }
        }

        System.out.println(numerosPrimos.stream().map(n -> n * 2).collect(Collectors.toList()));

        //for (double i = 7.5; i <= 10 ; i += 0.25) {
        //    System.out.println(calculateInterest(10000.00, i));
        //}
        //printEqual(2,1,3);
        //printYearsAndDays(581760);
        //System.out.println(convertToCm(6,0));
        //System.out.println(getDurationString(15982));
        //System.out.println(getDurationString(190,4582));
    }
}

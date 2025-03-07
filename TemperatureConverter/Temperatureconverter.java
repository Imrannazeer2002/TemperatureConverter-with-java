package Github;

import java.util.Scanner;

public class Temperatureconverter {

    public static double CtoF(double c){
        return (c*9/5)+32;
    }
     public static double CtoK(double c){
        return c+273.15;
     }
     public static double FtoC(double F){
        return (F-32)*5/9;
     }
     public static double Ftok(double F){
        return (F-32)*5/9+273.15; 
     }
     public static double KtoC(double k){
        return k-273.15;
     }
     public static double KtoF(double K){
        return (K-273.15)*9/5+32;
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1.Celsius to fahrenheit & Kelvin");
        System.out.println("2.fahrenheit to Celsius & Kelvin");
        System.out.println("3.Kelvin to Celsius & fahrenheit");
        System.out.println("Choose from the above options");

        int choice=sc.nextInt();
        System.out.println("Enter the temperture value");
        double temp = sc.nextDouble();

        switch (choice) {
            case 1:
            System.out.println(temp+" c = "+ CtoF(temp)+"F");
            System.out.println(temp+" c = "+ CtoK(temp)+"k");    
              break;
              case 2:
              System.out.println(temp+" f = "+ FtoC(temp)+"C");
              System.out.println(temp+" f = "+ Ftok(temp)+"k");
              break;
              case 3:
              System.out.println(temp+" k = "+ KtoC(temp)+"C");
              System.out.println(temp+" K = "+ KtoF(temp)+"F");
              break;
        
            default:
                System.out.println("invalid option");
        }
        sc.close();
        
    }
    
}

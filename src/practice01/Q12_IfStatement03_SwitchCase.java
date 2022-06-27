package practice01;

import java.util.Scanner;

public class Q12_IfStatement03_SwitchCase {
    public static void main(String[] args) {
        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitle=scan.nextLine().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println("Is Unvaniniz: Quality Analyst");
        } else if (jobTitle.equals("dev")){
            System.out.println("Is Unvaniniz: Developer");
        } else if (jobTitle.equals("ba")){
            System.out.println("Is Unvaniniz: Business Analyst");
        } else if (jobTitle.equals("pm")){
            System.out.println("Is Unvaniniz: Project Manager");
        }else{
            System.out.println("Yanlis formatta jobtitle girdiniz");
        }

        System.out.println("*********Switch Case Ile Cozumu*********************");

        switch(jobTitle){
            case"qa":
                System.out.println("Is Unvaniniz: Quality Analyst");
                break;
            case "dev":
                System.out.println("Is Unvaniniz: Developer");
                break;
            case "ba":
                System.out.println("Is Unvaniniz: Business Analyst");
                break;
            case "pm":
                System.out.println("Is Unvaniniz: Project Manager");
                break;
            default:
                System.out.println("Yanlis formatta jobtitle girdiniz");
                break;
        }


    }

}

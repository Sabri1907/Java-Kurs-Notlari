package practice08;

public class Q02_ForEach {
    /*
        SORU: // String[] list = {"fruits", "vegetables", "meat", "milk"};
        print array with for each loop
        print length of each element

        Part 2:
        Print all the elements from array using for eachLoop
        If an element starts with 'v' then quit the loop
     */

    public static void main(String[] args) {

        String[] list = {"fruits", "milk", "meat", "vegatables"};

        for (String element:list) {

            System.out.println(element+" :"+element.length());

        }

        System.out.println("**********PART2***************");

        for (String item:list) {

            if (item.startsWith("v")){
                break;
            }
            System.out.print(item+" ");
        }

    }
}

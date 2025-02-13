package Java.Generics;

import java.util.ArrayList;

public class GenericMethod {
    public static <Y> void printList(ArrayList<Y> list) {
        for(Y value: list) {
            System.out.print(value +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(23);
        intList.add(1);
        intList.add(78);
        intList.add(90);

        printList(intList);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("app");
        strList.add("laptop");
        strList.add("mouse");
        strList.add("keyboard");
        printList(strList);
    }
}

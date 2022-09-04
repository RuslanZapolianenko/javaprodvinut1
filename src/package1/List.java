package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(4);
        a1.add(12);
        a1.add(15);
        a1.add(20);
        a1.add(23);
        a1.add(56);
        a1.add(43);
        a1.add(653);
        a1.add(32);
        System.out.println(a1);
        Iterator<Integer> iterator = a1.iterator();
        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }
        ListIterator<Integer> listIterator = a1.listIterator();
        while (listIterator.hasNext()) {
            Integer tmp= listIterator.next();
            System.out.println(tmp);
        }
    }
}
//Вывод на экран элементов List: Создать список, заполнить его на 10 элементов
// и вывести на экран содержимое используя iterator.
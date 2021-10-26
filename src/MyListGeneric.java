import java.util.Iterator;
import java.util.ListIterator;

public class MyListGeneric {
    public static void main(String[] args) throws Exception {
      
      
      //Initializing an Object of MyList of a Double type
      MyList<Double> doubleList = new MyList<Double>();
        doubleList.add(187.21);
        doubleList.add(2322.12);
        doubleList.add(10.99);
        doubleList.add(1907.82);
        
        //Initializing an Object of MyList of an Integer type
        MyList<Integer> intList = new MyList<Integer>();
        intList.add(120);
        intList.add(3865);
        intList.add(76);
        intList.add(112);
      
        for (Double list : doubleList.arrayList) {
        System.out.printf("%5.2f%n", list);
      }
        System.out.println("The largest double element is : "+doubleList.largest());
        System.out.println("The smallest double element is: "+doubleList.smallest()+"\n");
        for (Integer list : intList.arrayList) {
          System.out.printf("%d%n", list);
        }
        System.out.println("The largest int element is : "+intList.largest());
        System.out.println("The smallest int element is: "+intList.smallest());
    }
}

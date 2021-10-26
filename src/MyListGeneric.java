

public class MyListGeneric {
    public static void main(String[] args) throws Exception {
      
      

      MyList<Double> doubleList = new MyList<Double>();
        doubleList.add(187.21);
        doubleList.add(2322.12);
        doubleList.add(10.99);
        doubleList.add(1907.82);

        MyList<Integer> intList = new MyList<Integer>();
        intList.add(120);
        intList.add(3865);
        intList.add(76);
        intList.add(112);

        System.out.println("The largest double element is : "+doubleList.largest());
        System.out.println("The smallest double element is: "+doubleList.smallest()+"\n");
       
        System.out.println("The largest int element is : "+intList.largest());
        System.out.println("The smallest int element is: "+intList.smallest());
    }
}

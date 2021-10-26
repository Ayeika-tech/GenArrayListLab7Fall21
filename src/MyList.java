import java.util.ArrayList;

public class MyList<T extends Number> {

    //Initializing the ArrayList type T
    ArrayList<T> arrayList = new ArrayList<T>();

    //No constructer was asked so I
    // didnt add one since it gave me an error


    //When calling the .add method the element gets added to ArrayList
    public void add(T e) {
        arrayList.add(e);
    }

    public T largest() {
        T lValue = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).doubleValue() > lValue.doubleValue()) {
                lValue = arrayList.get(i);
            }
        }
        return lValue;
    }

    public T smallest() {
        T sValue = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).doubleValue() < sValue.doubleValue()) {
                sValue = arrayList.get(i);
            }
        }
        return sValue;
    }
}
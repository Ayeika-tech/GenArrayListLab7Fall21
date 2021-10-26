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
    //largest method will loop thru arraylist and  compare the value of index 0 to index 1
    // if i[1] is bigger then the value gets stored on lValue, then goes next index[2] and compares to 
    //lValue, if index[2] if larger then holds at lValue and gets compared to i[3] and so forth.
    public T largest() {
        T lValue = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).doubleValue() > lValue.doubleValue()) {
                lValue = arrayList.get(i);
            }
        }
        return lValue;
    }
 //smallest method will loop thru arraylist and  compare the value of index 0 to index 1
    // if i[1] is smaller, then the value gets stored on sValue, then goes next index[2] and compares to 
    //sValue, if index[2] is smaller then its set to sValue and gets compared to i[3] and so forth.
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
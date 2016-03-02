public class MyArrayList<E> extends ArrayList<E> {
    
    public E getLastValue() {
        return this.get(this.size()-1);
    } 
}

MyArrayList<String> stringArrayList = new MyArrayList<String>();
stringArrayList.addAll(Arrays.asList("Russel", "Arthur"));
println("complete stringArraylist: " + stringArrayList);
println("last value of stringArrayList: " + stringArrayList.getLastValue());


MyArrayList<Integer> intArrayList = new MyArrayList<Integer>();
intArrayList.addAll(Arrays.asList(1,2,3,4,5));
println("\ncomplete integerArrayList: " + intArrayList);
println("getLastValue() integerArrayList: " + intArrayList.getLastValue());
intArrayList.remove(2);
println("after remove(2) integerArrayList: " + intArrayList);
intArrayList.pop();
println("after pop() integerArrayList: " + intArrayList);
intArrayList.push(10);
println("after push(10) integerArrayList: " + intArrayList);

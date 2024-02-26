import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(10);
    list.set(0,15);
    list.remove(0);
    int size = list.size();
    int value = list.get(0);
    System.out.printf("0번째 인덱스의 값은 %d\n", value);
    System.out.printf("사이즈는 %d\n", size);
    list.remove(0);
    boolean empty = list.isEmpty();
    System.out.printf("ArrayList가 비어있다 : %b\n", empty);
    list.add(4);
    list.add(8);
    list.clear();
    boolean empty1 = list.isEmpty();
    System.out.printf("ArrayList가 비어있다 : %b\n", empty1);
    list.add(10);
    list.add(20);
    list.add(30);
    boolean contains = list.contains(20);
    System.out.printf("20을 포함한다 : %b\n",contains);
    int index = list.indexOf(30);
    System.out.printf("30의 인덱스는 %d\n", index);

    }

}
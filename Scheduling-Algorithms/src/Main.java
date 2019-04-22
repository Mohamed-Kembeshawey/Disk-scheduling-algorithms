import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(45);
        arr.add(21);
        arr.add(67);
        arr.add(90);
        arr.add(4);
        arr.add(50);
        arr.add(89);
        arr.add(52);
        arr.add(61);
        arr.add(87);
        arr.add(25);
        DiskShceduling obj=new DiskShceduling(arr,50);
        System.out.println(obj.FCFS());
        System.out.println(obj.SSTF());
        System.out.println(obj.SCAN());
        System.out.println(obj.CSCAN(100));
        arr=new ArrayList<>();
        arr.add(98);
        arr.add(137);
        arr.add(122);
        arr.add(183);
        arr.add(14);
        arr.add(133);
        arr.add(65);
        arr.add(78);
        System.out.println("********************************************************************");
        obj=new DiskShceduling(arr,54);
        System.out.println(obj.FCFS());
        System.out.println(obj.SSTF());
        System.out.println(obj.SCAN());
        System.out.println(obj.CSCAN(199));
    }
}

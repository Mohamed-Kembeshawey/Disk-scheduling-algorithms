import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Math.abs;

public class DiskShceduling
{
    private ArrayList<Integer> arr;
    private int HeadStart;
    public DiskShceduling(ArrayList<Integer> arr, int headStart) {
        this.arr = arr;
        HeadStart = headStart;
    }
    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }
    public int print(ArrayList<Integer>Larr)
    {
        System.out.print(Larr.get(0)+" ");
        int result=abs(HeadStart-Larr.get(0));
        for(int i=1;i<Larr.size();i++)
        {
            System.out.print(Larr.get(i)+" ");
            result+=abs(Larr.get(i)-Larr.get(i-1));
        }
        System.out.println();
        return result;
    }
    public int FCFS()
    {
        System.out.println("FCFS Algorithm");
        System.out.print(HeadStart+" ");
        return print(arr);
    }
    public int SSTF()
    {
        System.out.println("SSTF Algorithm");
        int index=0,diff,temp;
        ArrayList<Integer>Larr=new ArrayList<>(arr);
        System.out.print(HeadStart+" ");
        for(int i=0;i<Larr.size()-1;i++)
        {
            diff=Integer.MAX_VALUE;
            for(int j=i+1;j<Larr.size();j++)
            {
                if(abs(Larr.get(i)-Larr.get(j))<diff)
                {
                    diff=abs(Larr.get(i)-Larr.get(j));
                    index=j;
                }
            }
            temp=Larr.get(i+1);
            Larr.set(i+1,Larr.get(index));
            Larr.set(index,temp);
        }
        return print(Larr);
    }
    public int SCAN()
    {
        System.out.println("SCAN Algorithm");
        ArrayList<Integer>Larr=new ArrayList<>(arr);
        Collections.sort(Larr);
        System.out.print(HeadStart+" ");
        for(int i=Larr.size()-1;i>=0;i--)
        {
            if(Larr.get(i)<=HeadStart)
            {
                System.out.print(Larr.get(i)+" ");
                Larr.remove(i);
            }
        }
        return print(Larr)+HeadStart*2;
    }
    public int CSCAN(int size)
    {
        System.out.println("CSCAN Algorithm");
        ArrayList<Integer>Larr=new ArrayList<>(arr);
        System.out.print(HeadStart+" ");
        Collections.sort(Larr,Collections.reverseOrder());
        for(int i=Larr.size()-1;i>=0;i--)
        {
            if(Larr.get(i)<=HeadStart)
            {
                System.out.print(Larr.get(i)+" ");
                Larr.remove(i);
            }
        }
        int temp=HeadStart;
        HeadStart=size;
        int result=print(Larr);
        HeadStart=temp;
        return result+HeadStart+size;
    }
    public void CLook()
    {

    }

}

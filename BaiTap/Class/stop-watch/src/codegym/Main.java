package codegym;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int []array= new int [10000];
        for (int i = 0; i < 10000; i++) {
            array[i]=(int)(Math.random()*1000);
        }
        LocalTime start = LocalTime.now();
        array=selectionSort(array);
        LocalTime end = LocalTime.now();
        stopWatch sw = new stopWatch(start, end);
        System.out.println("Time: "+sw.getElapsedTime());
        for(int x : array){
            System.out.println(x);
        }
    }

    public static int[] selectionSort(int...a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt = a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
        return a;
    }
}

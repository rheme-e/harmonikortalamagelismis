package HarmonikOrt;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        double sum=0,ho=0;
        int[] list = {1,23,22,15,8};
        for(int i=0; i< list.length ; i++){
            sum=list[i];
            ho+=1/sum;
        }
        System.out.println(ho);




    }
}

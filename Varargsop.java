import java.util.*;

public class Main {
    static int add(int a,int... argsa){
      int s = 0;
      for(int num:argsa){
        s+=num;
      }
      return s;
    }
    public static void main(String[] args) {
      System.out.println(add(10,20,30));
    }
}

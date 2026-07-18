package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCF {
    public static void main(String[] args) {
        
    List<Integer> ans = new ArrayList<>();

    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(4);
    ans.add(5);

    ans.remove(Integer.valueOf(1));
    ans.removeIf(n -> n==2);

    System.out.println(ans.size());
    ans.removeAll(ans);

      System.out.println(ans.size());

    // ans.set(ans.size()-1,6);

    // System.out.println(ans);


   Iterator<Integer> it = ans.iterator();

   while(it.hasNext()){
    System.out.println(it.next());
   }
    


    }
}

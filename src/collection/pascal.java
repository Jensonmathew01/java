Program to print pascal series of a given input.
************************************************    
package collection;
import java.util.ArrayList;

public class pascal {
    
    public static void main(String args[]){
        System.out.print(generate(5));
        
    }
    public static ArrayList<ArrayList<Integer>> generate(int a) {

        ArrayList<Integer> internal = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < a ; i++)
        {
            internal = new ArrayList<Integer>(); //this is the keypoint.
            internal.add(1);
            for(int j = 0 ; j < i ; j++ )
            {
                internal.add(internal.get(j) * (i - j)/(j + 1));
            }
            result.add(internal);
        }
        return result;
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2.
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<>();
    int integer = in.nextInt();
    while(integer-- > 0){
      int intInput = in.nextInt();
      data.add(intInput);
    }
    int mode = 0;
        int maxCount = 0;
        
        
        for (int i = 0; i < data.size(); i++) {
            int currentCount = 0;
            
            for (int j = 0; j < data.size(); j++) {
                if (data.get(j) == data.get(i)) {
                    currentCount++;
                }
            }
            
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = data.get(i);
            }
        }
        System.out.println(mode);

  }
}

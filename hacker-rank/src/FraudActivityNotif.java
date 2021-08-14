import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FraudActivityNotif {
	
	/**
	 * d = 3 ; expenditure = 10 20 30 40 50
	 *                i    = 0  1  2  3  4
	 * @param expenditure
	 * @param d
	 * @return
	 */
	// Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
    	int notificationCount = 0;
    	
    	if(expenditure!=null && expenditure.length > 0) {
    		
    		for(int i=0;i<expenditure.length;i++) {
    			
    			if(i < d) { //Skip if least number of trailing days not met
    				continue;
    			}
    			
    			//Here i will be 3 
    			
    			int end = i-1; //2
    			int start = i-d; //Starting position 3-3 = 0
    			
    			/**
    			 * Do not sort the entire array. Sort is needed only for number of trailing days.
    			 * If entire array is sorted it will get disturbed
    			 */
    			Arrays.sort(expenditure, start, end); 
    			
    			double median = 0;
    			int n = (start+1+end)/2;
    			//TODO: Validate if this is true in case of start is not 0
    			if((start+1+end)%2 == 0) //If Even Number median is sum of two middle values / 2
    			{ 
    				median = (expenditure[n] + expenditure[n+1]) / 2; 
    			}
    			else 
    			{
    				median = expenditure[n];
    			}
    			
    			if(expenditure[i] >= (2*median)) {
    				notificationCount = notificationCount + 1;
    			}
    		}
    		
    	}
    	
    	return notificationCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}

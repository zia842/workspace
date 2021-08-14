
public class TwoDimensional {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
        int sum = 0;
        int cR = 0;
        int cC = 0;
        int maxSum = 0;
        boolean skip = false;
        
        if(arr!=null && arr.length > 0)
        {
            while(cC+2 <= arr.length-1 && cR+2 <= arr.length-1)
            {
            	sum = 0;
                sum = arr[cR][cC] + arr[cR][cC+1] + arr[cR][cC+2]; //First Row 
                sum = sum + arr[cR+1][cC+1]; //Second Row
                sum = sum + arr[cR+2][cC] + arr[cR+2][cC+1] + arr[cR+2][cC+2]; //3 Row
                
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
                
                if(cC+2 >= arr.length-1)
                {
                    //Re-initialize Column
                    cC = 0;
                    if(cR+2 < arr.length-1)
                    {
                        cR = cR + 1; //Increment Row
                    }
                    if(cR+2 == arr.length-1)
                    {
                        break;
                    }
                }
                
                if(cC+2 < arr.length-1)
                {
                    cC = cC + 1;
                }
                
            }
            
        }
        
        return maxSum;


    }
    
    public static void main(String args[]) {
    	
    	int[][] arr = new int[6][6];
    	
    	arr[0][0] = 1; arr[0][1] = 1; arr[0][2] = 1; arr[0][3] = 0; arr[0][4] = 0; arr[0][5] = 0;
    	arr[1][0] = 0; arr[1][1] = 1; arr[1][2] = 0; arr[1][3] = 0; arr[1][4] = 0; arr[1][5] = 0;
    	arr[2][0] = 1; arr[2][1] = 1; arr[2][2] = 1; arr[2][3] = 0; arr[2][4] = 0; arr[2][5] = 0;
    	arr[3][0] = 0; arr[3][1] = 0; arr[3][2] = 2; arr[3][3] = 4; arr[3][4] = 4; arr[3][5] = 0;
    	arr[4][0] = 0; arr[4][1] = 0; arr[4][2] = 0; arr[4][3] = 2; arr[4][4] = 0; arr[4][5] = 0;
    	arr[5][0] = 0; arr[5][1] = 0; arr[5][2] = 1; arr[5][3] = 2; arr[5][4] = 4; arr[5][5] = 0;
    	
    	int sum = hourglassSum(arr);
    	
    	System.out.println("Max Sum is " + sum);
    	
    	
    }

}

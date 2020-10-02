package prep;
import java.util.*;
public class CavityMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] grid = new String[n];

	    for (int i = 0; i < n; i++){
	    	String gridItem = sc.next();
	        grid[i] = gridItem;
	    }
		
	    String[] result = cavityMap(grid);
	    for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print("\n");;
            }
        }
	}
	
	static String[] cavityMap(String[] grid) {
		 int n=grid.length;
		 for(int i=1; i<n-1; i++){
		        for(int j=1; j<n-1; j++){
		            int l = Character.getNumericValue(grid[i].charAt(j-1));
		         
		            int r = Character.getNumericValue(grid[i].charAt(j+1));
		            
		            int u = Character.getNumericValue(grid[i-1].charAt(j));
		           
		            int d = Character.getNumericValue(grid[i+1].charAt(j));
		            
		            int mid = Character.getNumericValue(grid[i].charAt(j));
		           
		            

		            if(l<mid && u<mid && r<mid && d<mid){

		                    StringBuilder sb = new StringBuilder(grid[i]);
		                    sb.setCharAt(j, 'X');
		                    grid[i] = sb.toString();
		            }
		        }
		    }
		return grid;
    }
}

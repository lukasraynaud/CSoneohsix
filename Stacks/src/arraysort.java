import java.util.*;
public class arraysort {
	
	public static void main(String[] args) {
	
	int[] array = new int[10];
	Random rand = new Random();
	
	for (int i = 0; i < array.length; i++)
	    array[i] = rand.nextInt(100) + 1;
	
	System.out.println(Arrays.toString(array));
	
	Arrays.sort(array);
	
	System.out.println(Arrays.toString(array));
	
	
	

}

}

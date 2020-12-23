package arrayassign;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		String[] name = {"Juan", "Jissela", "Fabidaly", "Ramon", "Felix", "Angel", "Winnifer"}; 
		String[] name2 = new String[name.length - 1]; //second array to hold value after deletion
		int remove = 3; // index to remove
		
		//print array before deletion
		System.out.println("Array before deletion");
		System.out.println(Arrays.toString(name));
			
		System.out.println("");	
		
		System.out.println("Array after deletion");
		for(int i = 0, j = 0; i < name.length; i++) {
			if(i == remove) { // skip over removed index
				 continue;
			}
			name2[j++] = name[i]; 	
		}
		System.out.print(Arrays.toString(name2));
	}

}
//Delete specific element from an array
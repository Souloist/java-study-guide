public class Sort{

	/* helper methods */

	/* Returns the index of the smallest string starting with k.
	 * ([0, 2, 3], 1) --> 1 */
	public static int indexOfSmallest(String[] inputs, int k){
		/* index of smallest known so far */
		int minDex = k;

		for (int i = k; i < inputs.length; i++){
			if (inputs[i].compareTo(inputs[minDex]) < 0){
				minDex = i;
			}
		}

		return minDex;
	}

	private static void swap(String[] input, int a, int b){
		String temp = input[b];
		input[b] = input[a];
		input[a] = temp;
	}
	/* Returns unputs in sorted order, sorting only the last
	 * k items.
	 * ([5, 3, 8, 1], 1) --> [5, 1, 3, 8] */
	private static String[] sort(String[] inputs, int k){

		/* base case */
		if (k == inputs.length){
			return inputs;
		}

		int minDex = indexOfSmallest(inputs, k);
		swap(inputs, k, minDex);
		// recursive sort
		return sort(inputs, k + 1);		
	}

	/* Return inputs in sorted order, where a < z,
	 * and is nondestructive. */
	public static String[] sort(String[] inputs){
		return sort(inputs, 0);
	}		

	/* Print out strings */
	public static void print(String[] inputs){

	}

	/* Print out args in order */
	public static void main(String[] args){

	}
	
}

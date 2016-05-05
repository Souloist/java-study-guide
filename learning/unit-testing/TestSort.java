/* This class tests the Sort class */
public class TestSort {

	/* Test Sort.sort method */
	@org.junit.Test
	public void testSort(){
		String[] inputs = {"milvia", "zero", "josh", "trump"};
		String[] expected = {"josh", "milvia", "trump", "zero"};
		String[] actual = Sort.sort(inputs);

		org.junit.Assert.assertArrayEquals(expected, actual);
	}

	@org.junit.Test
	public void testIndexOfSmallest(){
		String[] inputs = {"milvia", "zero", "josh", "trump"};
		int expected = 2;
		int actual = Sort.indexOfSmallest(inputs,2);
		org.junit.Assert.assertEquals(expected, actual);	

		expected = 3;
		actual = Sort.indexOfSmallest(inputs, 3);
		org.junit.Assert.assertEquals(expected, actual);

	}

	public static void main(String[] args){
		jh61b.junit.TestRunner.runTests("all", TestSort.class);
	}
}
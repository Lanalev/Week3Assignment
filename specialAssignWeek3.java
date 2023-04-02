
package specialAssign;

public class specialAssignWeek3 {
		public static void main(String[] args) {
		// 1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		// a. Programmatically subtract the value of the first element in the array from
		// the value in the last element of the array (i.e. do not use ages[7] in your
		// code). Print the result to the console.
		System.out.println(ages[ages.length - 1] - ages[0]);
		// b. Add a new age to your array and repeat the step above to ensure it is
		// dynamic (works for arrays of different lengths).
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 13 };
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		// c. Use a loop to iterate through the array and calculate the average age.
		// Print the result to the console.
		int sum = 0;
		int avrg = 0;
		for (int age : ages) {
		sum += age;
		avrg = sum / ages.length;
		}
		System.out.println(avrg);
		// 2. Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		// a. Use a loop to iterate through the array and calculate the average number
		// of letters per name. Print the result to the console.
		int sum1 = 0;
		for (String name : names) {
		sum1 += name.length();
		}
		System.out.println(sum1 / names.length);
		// b. Use a loop to iterate through the array again and concatenate all the
		// names together, separated by spaces, and print the result to the console.
		for (int i = 0; i < 1; i++) {
		System.out.println(
		names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4] + " " + names[5]);
		}
		// 3. How do you access the last element of any array?
		int[] arr = { 1, 14, 3, 2, 5 };
		System.out.println(arr[arr.length - 1]);
		// 4. How do you access the first element of any array?
		int[] arr1 = { 1, 14, 3, 2, 5 };
		System.out.println(arr1[0]);
		// 5. Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of each name to the
		// nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		}
		for (int number : nameLengths) {
		System.out.println(number);
		}
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array. Print the result to the console.
		int sumOfNameLengths = 0;
		for (int number : nameLengths) {
		sumOfNameLengths += number;
		}
		System.out.println(sumOfNameLengths);
		// 7. Write a method that takes a String, word, and an int, n, as arguments and
		// returns the word concatenated to itself n number of times. (i.e. if I pass in
		// “Hello” and 3, I expect the method to return “HelloHelloHello”).
		String word = "Hello";
		int n = 3;
		System.out.println(concatenation(word, n));
		// 8. Write a method that takes two Strings, firstName and lastName, and returns
		// a full name (the full name should be the first and the last name as a String
		// separated by a space).
		String firstName = "Linda";
		String lastName = "Belcher";
		System.out.println(fullName(firstName, lastName));
		// 9. Write a method that takes an array of int and returns true if the sum of
		// all the ints in the array is greater than 100.
		int[] arr3 = { 16, 86, 3, 1, 9 };
		System.out.println(sumOfInts(arr3));
		// 10. Write a method that takes an array of double and returns the average of
		// all the elements in the array.
		double[] arrayDouble = { 54.78, 31.63, 44.56, 11.23, 78.90 };
		System.out.println(avrgDoubleArray(arrayDouble));
		// 11. Write a method that takes two arrays of double and returns true if the
		// average of the elements in the first array is greater than the average of the
		// elements in the second array.
		double[] array1 = { 54.78, 31.63, 44.56, 11.23, 78.90 };
		double[] array2 = { 1.23, 2.34, 3.45, 4.56, 5.67 };
		System.out.println(greaterDouble(array1, array2));
		// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
		// a double moneyInPocket, and returns true if it is hot outside and if
		// moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 11.75;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		// 13. Create a method of your own that solves a problem. In comments, write
		// what the method does and why you created it.
		double[] monthlyGroceries = {165.70, 120.02, 123.50, 98.78, 78.56, 170.31, 240.02, 65.31, 45.79, 90.09, 87.34, 23.58};
		System.out.println(avrgCostOfGroceries(monthlyGroceries));
		}
		//7.
		public static String concatenation(String word, int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
		str += word; 
		}
		return str;
		}
		//8.
		public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		}
		//9.
		public static boolean sumOfInts(int[] intss) {
		int summ = 0;
		for (int ints : intss) {
		summ += ints;
		if (summ > 100)
		;
		return true;
		}
		return false;
		}
		//10.
		public static double avrgDoubleArray(double[] doubleArray) {
		double sum = 0;
		for (double number : doubleArray) {
		sum += number;
		}
		return sum / doubleArray.length;
		}
		//11.
		public static boolean greaterDouble(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double numb : array1) {
		sum1 += numb;
		{
		for (double numb2 : array2) {
		sum2 += numb2;
		{
		if (sum1 / array1.length > sum2 / array2.length) {
		}
		}
		}
		}
		}
		return true;
		}
		//12.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
		}
		return true;
		}
		//13. 
		public static double avrgCostOfGroceries(double[] n) {
		double totalCost = 0;
		for (double groceries : n) {
		totalCost += groceries;
		}
		return totalCost / 12;
		}
		
// The method allows to calculate the average cost of groceries per month.

}

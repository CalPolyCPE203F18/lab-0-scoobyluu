public class Lab00
{
   public static void main(String[] args)
   {
   	//declaring and initializing some of the variables
   int x = 5;
   String y = "hello";
   double z = 9.8;

   //printing the variabled
   System.out.printf("x: " + x + " y: " + y + " z: " + z + "\n");

   //an array
   int[] nums = {3, 6, -1, 2};

   for (int val : nums)
   	System.out.println(val);
   int numFound = char_count(y, 'l');
   System.out.println("Found: " + numFound);
   for (int i = 0; i < 11; i++)
   {
   		System.out.print(i + " ");
   }
   System.out.print("\n");
}
	public static int char_count(String a, char b){
		int count = 0;
		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) == b)
			count ++;
	return count;
	}
}
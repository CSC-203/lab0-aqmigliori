public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello"; //Double quotes are reserved for strings, single quotes for char
      double z = 9.8;
      System.out.println("x: " + x + ", y: " + y + ", z: " + z);

//    a list (make an array in java)

      int[] nums = {3, 6, -1, 2};

      for (int num: nums) {
         System.out.println(num);
      }

//      a counting for loop

      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
   }
      System.out.println();

//      # call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found: " + numFound);
   }

   public static int char_count(String s, char c) {
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i)==c) {
            count++;
         }
      }
      return count;
      }
   }


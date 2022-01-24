public class MyMain {
    // Examples From Class:

    // This is the example problem that we did in class
    // This uses recursion to count the total number
    // of digits in a positive number
    public static int numDigits(int x) {
        // Base case
        if (x == 0) {
            return 0;
        }
        // Recursive call
        else {
            return 1 + numDigits(x / 10);
        }
    }

    // This is a wrapper method. It just calls the
    // tail recursive version of num digits!
    public static int numDigits2(int x) {
        return numDigitsTR(x, 0);
    }

    // This is a tail recursive version of numDigits
    // This method should never be called directly;
    // rather the wrapper method numDigits2 should be called
    public static int numDigitsTR(int x, int count) {
        // Base case
        if (x == 0) {
            return count;
        }
        // Recursive call
        else {
            return numDigitsTR(x / 10, count + 1);
        }
    }


    // In-class Practice Problems

    // Write a method that uses recursion to calculate the number
    // of "big" digits in a number
    // A big digit is any digit that is at least 5
    // Examples:
    // countBigDigits(1234) => 0
    // countBigDigits(99999) => 5
    // countBigDigits(521931) => 2
    public static int countBigDigits(int x) {
        return countBigDigits2(x, 0);
    }

    public static int countBigDigits2(int x, int count){
        if(x == 0){
            return count;
        }
        else if(x % 10 >= 5){
            return countBigDigits2(x / 10, count + 1);
        }
        else{
            return countBigDigits2(x / 10, count);
        }
    }

    // Write a method that uses recursion to calculate whether
    // the number contains more odd digits than even digits
    // You will almost certainly need to use **tail recursion!**

    // Hint: what additional parameters will you need to add?

    // Hint 2: you might want to keep track of both the number
    // of odd numbers and the number of even numbers

    // Examples:
    // moreOddThanEven(1234) => false because 2 of each
    // moreOddThanEven(99999) => true because 5 odd and 0 even
    // moreOddThanEven(521931) => true because 5 odd and 1 even
    public static boolean moreOddThanEven(int x) {
        return moreOddThanEven2(x, 0, 0);
    }

    public static boolean moreOddThanEven2(int x, int even, int odd) {
        if(x == 0){
            if(odd > even){
                return true;
            }
            else{
                return false;
            }
        }
        else if((x % 10) % 2 == 0){
            return moreOddThanEven2(x / 10, even + 1, odd);
        }
        else if((x % 10) % 2 == 1){
            return moreOddThanEven2(x / 10, even, odd + 1);
        }
        else{
            return false;
        }
    }

    // This might be helpful to get started:
//    public static boolean moreOddThanEvenTR(...) {

    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    // Remember that a palindrome is a word that is the same forwards
    // and backwards, so the first letter must match the last letter,
    // the second letter must match the second to last letter, and so on
    // Examples:
    // isPalindrome("racecar") => true
    // isPalindrome("madam") => true
    // isPalindrome("racecars") => false
    public static boolean isPalindrome(String str) {
        return isPalindrome2(str, "");
    }

    public static boolean isPalindrome2(String str, String check){
        if(str.equals("")){
            return false;
        }
       return false;
    }





    // Methods for homework:

    // This method adds up the values of all digits
    // in x, recursively
    // Examples:
    // countBigDigits(1234) => 10
    // countBigDigits(99999) => 45
    // countBigDigits(521931) => 21
    public static int addDigits(int x) {
        return addDigits2(x, 0);
    }

    public static int addDigits2(int x, int count){
        if(x == 0){
            return count;
        }
        else{
            return addDigits2(x / 10, count + x % 10);
        }
    }
    // Write a method that is given a String containing a single pair
    // of matched parentheses containing some characters. This method
    // should use recursion to "trim" off all the extra characters until
    // only the parentheses and their contents remain
    // You can assume that the String always contains this pair of parens
    // Examples:
    // parenTrim("xyz(abc)123") => "(abc)"
    // parenTrim("x(hello)") => "(hello)"
    // parenTrim("(xy)1") => "(xy)"
    public static String parenTrim(String str) {
        // YOUR CODE HERE
        return "";
    }

    // This method returns the orignal string reversed;
    // tail recursion could be helpful, but it not required!
    // Examples:
    // reverse("desserts") => stressed
    // reverse("racecar") => racecar
    public static String reverse(String str) {
        return reverse2(str, "");
    }

    public static String reverse2(String str, String str2){
        if(str.equals("")){
            return "";
        }
        else{
            String letter = str.substring(str.length() - 1, str.length());
            return reverse2(str.substring(0, str.length() - 1), str2 + letter);
        }
    }





    public static void main(String[] args) {
        // Optional: Write some code here to test your methods!
    }
}

import javafx.event.EventDispatchChain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task5 {
    public static void main(String [] args) {
        List<String> sample = Arrays.asList("India", "is", "a", "democratic", "country");
        String shortest = "";
        for (String value : sample) {
            if (value.length() < shortest.length()) {
                shortest = value;
            }
        }

        System.out.println("Shortest  String: " + shortest);

        //JAVA program that gives sum of all the values of array except the highest and lowest values.
        sumOfnumbers();
        // JAVA method to remove all the spaces from the String and return the resultant.
        removeSpaces();
       // java program all the letters of the string be unique (isogram)
        uniqueCharcters();
        String  sample1 = "hddgadfuyB";
        String sample2 ="gtafdiur";
        System.out.println("String has a unique character: " +  uniqueCharcters(sample1));
        System.out.println("String has a unique character: " +  uniqueCharcters(sample2));
        // program to reverse words in a String
        reverseWordInMyString();
        String reverseString = "Be Happy and Stay Motivated";
        System.out.println(reverseWordInMyString(reverseString));
        //JAVA program that takes out the even from the odds and odd from the list of  numbers
        evenOdd();
        //a JAVA program that swaps the case of the alphabets of the string
        swapletter();

    }

    private static void reverseWordInMyString() {
    }

    private static void uniqueCharcters() {
    }

    public static void sumOfnumbers(){

        int [] a ={4,6,8,1,2,0};
        Arrays.sort(a);
        System.out.println("arrays in ascending order: " +  Arrays.toString(a));
        int sum=0;
        for(int i=1;i<a.length-1;i++){
            sum = sum+a[i];
        }
        System.out.println("The sum of numbers excluding minimum and maximum: " + sum);
    }
    public static void removeSpaces(){
        String x = "t  h is e p i d  emic  is going to   end  .";
        System.out.println(x);
        //replaceAll method is used to remove  all the spaces and replace it with no space
        x= x.replaceAll("\\s","");
        System.out.println("New String after replacing all spaces : "+ x);
    }
    public static boolean uniqueCharcters(String x){
        Set<Character> set = new HashSet<>();
            for(Character c: x.toCharArray()){
                if(set.contains(c)){
                    return false;
                }
                set.add(c);
            }
            return true;
        }
    public static String reverseWordInMyString(String str)
    {
        //The split() method of String class splits a string in several strings based on the

        String[] sample = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < sample.length; i++)
        {
            String newSample = sample[i];
            String reverseWord = "";
            for (int j = newSample.length()-1; j >= 0; j--)
            {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWord = reverseWord + newSample.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString;
    }
    public static void evenOdd(){
        int [] a =  {23,25,75,87,47,1,91,51,2};
        int [] b =    {22,44,64,76,98,12,43,54,90};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("even number from an odd number of array = " + a[i]);
            }

        }
        for(int i= 0;i<b.length;i++) {
            if (b[i] % 2 != 0) {
                System.out.println("odd number from an even number of array = " + b[i]);
            }
        }

    }
    public static void swapletter(){
        //use stringbuffer in place of string as strings are immutable
        StringBuffer a = new StringBuffer("heLLo WOrLd");
        for(int i = 0; i<a.length(); i++){
         Character  x = a.charAt(i);
            if (Character.isLowerCase(x))
                a.replace(i, i+1, Character.toUpperCase(x)+"");
            else
                a.replace(i, i+1, Character.toLowerCase(x)+"");
        }
        System.out.println(a);
        }




    }//ends class



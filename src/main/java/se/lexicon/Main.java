package se.lexicon;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String javaString = "Java";
        System.out.println(" ");
        System.out.println("String exercises!" + "\n");

        System.out.println("String \"Java\" is " + javaString.length() + " characters long." + "\n");

        String sentence = "Long example sentence";
        System.out.println("The char at index 6 of String \"Long example sentence\" is \"" + sentence.charAt(6) + "\"." + "\n");

        String longSentence = "Even longer example sentence";
        System.out.println("Index position of \"o\" in String \"Even longer example sentence\" is " + longSentence.indexOf("o") + "." + "\n");

        String substringMain = "Ok this is not as long!";
        String substringExtracted = substringMain.substring(substringMain.indexOf("not"),substringMain.indexOf("!"));
        System.out.println("Extracted substring is: " + substringExtracted  + "\n");

        //System.out.println(substringMain.charAt(substringMain.length()-12));

        /*
        for (int i = substring.length()-12; i < substring.length()-2; i++ ) {
            //System.out.print(sentence.charAt(substring.length()+i));
            System.out.println(i);
        }
        */

        //System.out.println(substringMain.length()-12);

        String upperCase = "CAPS EQUALS SCREAMING";
        String toLowerCase = upperCase.toLowerCase();
        String toUpperCase = toLowerCase.toUpperCase();
        System.out.println("To lowercase: " + toLowerCase + "\n" + "To uppercase: " + toUpperCase + "\n");

        String theWorst = "Java is the worst programming language!";
        String theBest = theWorst.replace("worst","best");
        System.out.println("Java fixed: " + theBest  + "\n");

        String toTrim = "\tj\ta\tv\ta\t";
        System.out.println(toTrim + "\u2190 \u2190 to trim");
        System.out.println(toTrim.trim() + "\t\t← \u2190 trimmed" + "\n");

        int twenty = 20;
        String toString = Integer.toString(twenty);
        String twentyTwenty = toString + "20";
        System.out.println("To String: " + twentyTwenty  + "\n");

        String oilAndWater = "Oil and Water";
        //String oil = Arrays.toString(oilAndWater.toCharArray());

        String[] oilWaterArray = oilAndWater.split(" and ");
        System.out.println("String Array \u2199");
        System.out.println(oilWaterArray[0]);
        System.out.println(oilWaterArray[1] + "\n");

        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] namesArray = names.split(",");
        System.out.println("Names Array. While Loop:");
        int i = 0;
        while (i < namesArray.length) {
            System.out.println(i + ". " + namesArray[i]);
            i++;
        }
        System.out.println(" ");

        System.out.println("Names Array. For Loop:");
        for (String j : namesArray) {
            System.out.println(j);
        }
        System.out.println(" ");

        /*
        Syntax
        for (type variable : arrayName) {
            ...
        }
        https://www.w3schools.com/java/java_arrays_loop.asp
         */

        System.out.println("Names Array. Arrays.toString:");
        System.out.println(Arrays.toString(namesArray) + "\n");

        System.out.println("Names Array. Arrays.asList:");
        System.out.println(Arrays.asList(namesArray) + "\n");

        System.out.println("Names Array. Iterator:");
        Iterator<String> itr = Arrays.asList(namesArray).iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // https://codegym.cc/groups/posts/how-to-print-an-array-in-java
        System.out.println(" ");

        String notSpaced = "ThisShouldBeConverted";
        char[] charArray = notSpaced.toCharArray();
        for (char o : charArray) {
            System.out.print(o);
            System.out.print(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        char[] charToString = {'J','a','v','a'};
        String charToStringConverted = Arrays.toString(charToString);
        System.out.println("Char Array to String: " + charToStringConverted + "\n");

        System.out.println("The End!");
    }
}
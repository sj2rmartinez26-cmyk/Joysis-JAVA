package day13.activity;

import java.util.Scanner;

public class activity9_Martinez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n========================================");
            System.out.println("       JAVA STRING METHODS MENU         ");
            System.out.println("========================================");
            System.out.println("[1]  contains()");
            System.out.println("[2]  endsWith()");
            System.out.println("[3]  startsWith()");
            System.out.println("[4]  indexOf()");
            System.out.println("[5]  isEmpty()");
            System.out.println("[6]  trim()");
            System.out.println("[7]  replace()");
            System.out.println("[8]  toCharArray()");
            System.out.println("[9]  nextLine()");
            System.out.println("[10] charAt()");
            System.out.println("[11] valueOf()");
            System.out.println("[12] Stretch Goal");
            System.out.println("[13] Exit");
            System.out.print("Choose a method to learn about/run (1-13): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 
            System.out.println("\n----------------------------------------\n");

            switch (choice) {
                case 1: {
                    //contains()
                    String containsDes = "The contains() method in Java is primarily used to check \n"
                            + "if a specific sequence of characters exists within a string, or if a\n"
                            + " specific element exists within a collection. It always returns a \n"
                            + "boolean value: true if the target is found, and false if it is not.";
                    
                    String containsSyntax = "public boolean contains(CharSequence s)";
                    
                    //sample code
                    String sentence = "I love Anime";
                    System.out.println("contains()\n\nDescription: " + containsDes);
                    System.out.println("");
                    System.out.println("Sentence is: " + sentence);
                    System.out.println("");
                    boolean hasAnime = sentence.contains("Anime");
                    boolean hasAnimeLower = sentence.contains("java");
                    
                    System.out.println("Contains Anime : " + hasAnime );
                    System.out.println("Contains anime : " + hasAnimeLower);
                    break;
                }
                case 2: {
                    //endsWith()
                    String endsWithDes = "The endsWith() (or endswith()) method is a built-in \n"
                            + "function used in many programming languages to check whether a \n"
                            + "string terminates with a specific sequence of characters. It is \n"
                            + "highly case-sensitive and always returns a boolean value \n"
                            + "(true or false).";
                    
                    String endWithSyntax = "public boolean endsWith(String suffix)";

                    System.out.println("endswith()\nDescription: " + endsWithDes);
                    System.out.println("");
                    System.out.println("Syntax: " + endWithSyntax);
                    System.out.println("");
                    //sample code
                    String textEnds = "Hello Romel";
                    System.out.println("Does the text ends with Romel? " + textEnds.endsWith("Romel"));
                    System.out.println("Does the text ends with Ronald? " + textEnds.endsWith("Ronald"));
                    break;
                }
                case 3: {
                    //startsWith()
                    String startsWithDes = "The startsWith() method in Java checks whether a \n"
                            + "String begins with a specific sequence of characters. It \n"
                            + "is part of the java.lang.String class and returns a boolean \n"
                            + "value (true or false).";
                    System.out.println("startWith()\nDescription: " + startsWithDes);
                    System.out.println("");
                    
                    String startsWithSyntax = "public boolean startsWith(String prefix)";
                    System.out.println("Syntax: " + startsWithSyntax);
                    System.out.println("");
                    
                    String text1 = "Hello Ronald";
                    System.out.println("Text: " + text1);
                    System.out.println("Does the text starts with Hello? " + text1.startsWith("Hello"));
                    System.out.println("Does the text starts with Hi? " + text1.startsWith("Hi"));
                    break;
                }
                case 4: {
                    //indexOf()
                    String indexOfDes = "In Java, the indexOf() method returns the 0-based \n"
                            + "index of the first occurrence of a specified character or substring\n"
                            + " within a string. If the target character or substring is not found,\n"
                            + "the method returns -1. It belongs to the java.lang.String class but \n"
                            + "is also implemented in other utility classes like StringBuilder and \n"
                            + "ArrayList.";
                    
                    System.out.println("indexOf()\nDescription: " + indexOfDes);
                    System.out.println("");
                    System.out.println("Syntax: ");
                    String indexOfSyntax1 = "1. int indexOf(int ch) - Returns the index of the first \n"
                            + "occurrence of the character (ch).";
                    String indexOfSyntax2 = "2. int indexOf(int ch, int fromIndex) - Returns the index \n"
                            + "of the character, starting the search forward from fromIndex.";
                    String indexOfSyntax3 = "3. int indexOf(String str) - Returns the index of the \n"
                            + "first character of the matching substring (str).";
                    String indexOfSyntax4 = "4. int indexOf(String str, int fromIndex) - Returns the \n"
                            + "index of the substring, starting the search forward from fromIndex.";
                    
                    System.out.println(indexOfSyntax1 + "\n\n" + indexOfSyntax2 + "\n\n" + indexOfSyntax3 + "\n\n" + indexOfSyntax4);
                    System.out.println("");
                    String textIdx = "Java Programming is fun!";

                    int indexChar = textIdx.indexOf('P'); 
                    System.out.println("1. Index of 'P': " + indexChar); 

                    int indexSub = textIdx.indexOf("fun"); 
                    System.out.println("2. Index of \"fun\": " + indexSub); 

                    int indexWithOffset = textIdx.indexOf('a', 2); 
                    System.out.println("3. Index of 'a' after index 2: " + indexWithOffset); 

                    int notFound = textIdx.indexOf("Python"); 
                    System.out.println("4. Index of \"Python\": " + notFound); 
                    break;
                }
                case 5: {
                    //isEmpty()
                    String isEmptyDes = "isEmpty()\nDescription: In Java, the isEmpty() method returns \n"
                            + "a boolean value (true or false) to indicate whether a String, Collection, \n"
                            + "or Map contains no elements. It is natively supported by various Java \n"
                            + "classes, operating with a time complexity of O(1) in most implementations.";
                    
                    System.out.println(isEmptyDes);
                    System.out.println("");
                    String isEmptySyntax = "Syntax: public boolean isEmpty()";
                    System.out.println(isEmptySyntax);
                    System.out.println("");
                    
                    //sample code
                    String str1 = "";
                    String str2 = " ";
                    String str3 = "Hello";
                    System.out.println("Strings:" + "\n1.\"\"" + str1 + "\n2.\" \"" + str2 + "\n3." + str3 + "\n");
                    System.out.println(str1.isEmpty()); 
                    System.out.println(str2.isEmpty() + " (contains whitespace)"); 
                    System.out.println(str3.isEmpty()); 
                    break;
                }
                case 6: {
                    //trim()
                    String trimDes = "trim()\nDescription: The trim() method in Java removes leading and trailing whitespace \n"
                            + "from a string. It does not modify the original string because Java strings \n"
                            + "are immutable; instead, it returns a brand-new string.";
                    System.out.println(trimDes);
                    System.out.println("");
                    String trimSyntax = "Syntax: public String trim()";
                    System.out.println(trimSyntax);
                    System.out.println("");
                    
                    //sample code
                    System.out.println("Sample code:\n  ");
                    String originalStr = " \t  Hello Java Devs!  \n ";
                    
                    String trimmedStr = originalStr.trim();
                    
                    System.out.println("Original: '" + originalStr + "'");
                    System.out.println("Trimmed : '" + trimmedStr + "'");
                    break;
                }
                case 7: {
                    //replace()
                    System.out.println("replace()\nDescription: In Java, the String.replace() method \n"
                            + "replaces every occurrence of a specific character or substring in a string \n"
                            + "and returns a new string because Java strings are immutable.\n");
                    
                    System.out.println("Syntax: public String replace(char oldChar, char newChar)\n");
                    
                    System.out.println("String = cat in the hat\n"
                            + "String modified = original.replace('a', 'o');");
                    String original = "cat in the hat";

                    String modified = original.replace('a', 'o'); 

                    System.out.println(modified); 
                    break;
                }
                case 8: {
                    //toCharArray()
                    System.out.println("In Java, the toCharArray() method belongs to the String class and \n"
                            + "is used to convert a string into a newly allocated character array (char[]).\n");
                    
                    System.out.println("Syntax: public char[] toCharArray()\n");
                    System.out.println("public class Main {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        String text = \"Hello\";\n" +
                    "        \n" +
                    "        // Convert string to character array\n" +
                    "        char[] characters = text.toCharArray();\n" +
                    "        \n" +
                    "        // Iterate and print each character\n" +
                    "        for (char ch : characters) {\n" +
                    "            System.out.println(ch);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}");
                    String textArray = "Hello";
                    
                    char[] characters = textArray.toCharArray();
                    
                    System.out.println("Output: ");
                    for (char ch : characters) {
                        System.out.println(ch);
                    }
                    break;
                }
                case 9: {
                    //nextLine()
                    System.out.println("nextLine()\nDescription: The nextLine() method in Java \n"
                            + "is a built-in function of the java.util.Scanner class used to read \n"
                            + "an entire line of text (including spaces) from an input source\n");
                    
                    System.out.println("Syntax: public String nextLine()\n");
                    System.out.println("Sample Code:\n // 1. Create the scanner object\n" +
                    "        Scanner sc = new Scanner(System.in);\n" +
                    "        \n" +
                    "        System.out.print(\"Enter your full name: \");\n" +
                    "        \n" +
                    "        // 2. Read the entire line of text\n" +
                    "        String fullName = sc.nextLine();\n" +
                    "        \n" +
                    "        // 3. Output the result\n" +
                    "        System.out.println(\"Hello, \" + fullName + \"!\");\n" +
                    "        \n" +
                    "        // 4. Close the scanner to release resources\n" +
                    "        sc.close();");
                    
                    System.out.print("Enter your full name: ");
                    
                    String fullName = sc.nextLine();
                    
                    System.out.println("Hello, " + fullName + "!");
                    break;
                }
                case 10: {
                    //charAt()
                    System.out.println("charAt()\nDescription: The syntax for the Java charAt() \n"
                            + "method is public char charAt(int index). It is a built-in method \n"
                            + "of the java.lang.String class used to retrieve a single character \n"
                            + "at a specific position within a string.\n");
                    
                    System.out.println("Syntax: public char charAt(int index)\n");
                    System.out.println("Sample Code:\nString text = \"Java\";\n" +
                    "        \n" +
                    "        // Fetching the first character\n" +
                    "        char firstLetter = text.charAt(0); \n" +
                    "        \n" +
                    "        // Fetching the last character dynamically\n" +
                    "        char lastLetter = text.charAt(text.length() - 1); \n" +
                    "        \n" +
                    "        System.out.println(\"First: \" + firstLetter); // Output: J\n" +
                    "        System.out.println(\"Last: \" + lastLetter);   // Output: a");
                    
                    String textChar = "Java";
                    
                    char firstLetter = textChar.charAt(0); 
                    
                    char lastLetter = textChar.charAt(textChar.length() - 1); 
                    
                    System.out.println("First: " + firstLetter); 
                    System.out.println("Last: " + lastLetter);  
                    break;
                }
                case 11: {
                    System.out.println("valueOf()\nDescription: The valueOf() method in Java \n"
                            + "is a static utility method used to convert data from one type \n"
                            + "into another, most commonly found in the String class and \n"
                            + "primitive Wrapper classes (like Integer or Double). Because it \n"
                            + "is static, you call it directly on the class name without \n"
                            + "creating an instance.\n");
                    
                    System.out.println("Syntax: public static String valueOf(dataType argument)\n");
                    
                    System.out.println("Sample Code: \nint number = 42;\n" +
                    "boolean flag = true;\n" +
                    "\n" +
                    "String strNumber = String.valueOf(number); // Returns \"42\"\n" +
                    "String strFlag = String.valueOf(flag);     // Returns \"true\"\n");
                    
                    int number = 42;
                    boolean flag = true;

                    String strNumber = String.valueOf(number); 
                    String strFlag = String.valueOf(flag);  
                    
                    System.out.println(strNumber);
                    System.out.println(strFlag);
                    break;
                }
                case 12: {
                    String country = "Philippines";
                    System.out.println("Analyzing the string: \"" + country + "\"");
                    
                    char first = country.charAt(0);
                    char last = country.charAt(country.length() - 1);
                    System.out.println("First Character: " + first);
                    System.out.println("Last Character: " + last);
                    
                    int pCount = 0;
                    int vowelCount = 0;
                    
                    for (int i = 0; i < country.length(); i++) {
                        char ch = country.charAt(i);
                        
                        if (ch == 'P' || ch == 'p') {
                            pCount++;
                        }
                        
                        char lowerCh = Character.toLowerCase(ch);
                        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                            vowelCount++;
                        }
                    }
                    
                    System.out.println("Occurrences of 'P/p': " + pCount);
                    System.out.println("Total number of vowels: " + vowelCount);
                    break;
                }
                case 13: {
                    System.out.println("Exiting menu.");
                    running = false;
                    break;
                }
                default:
                    System.out.println("Invalid selection. Try again.");
                    break;
            }
        }
        sc.close();
    }
}
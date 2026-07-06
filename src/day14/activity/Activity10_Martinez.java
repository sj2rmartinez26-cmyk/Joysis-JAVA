
package day14.activity;
import java.util.Scanner;

public class Activity10_Martinez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n========================================");
            System.out.println("         JAVA MATH METHODS MENU         ");
            System.out.println("========================================");
            System.out.println("[1]  Math.abs()");
            System.out.println("[2]  Math.max()");
            System.out.println("[3]  Math.min()");
            System.out.println("[4]  Math.pow()");
            System.out.println("[5]  Math.sqrt()");
            System.out.println("[6]  Math.round()");
            System.out.println("[7]  Math.ceil()");
            System.out.println("[8]  Math.floor()");
            System.out.println("[9]  Math.random()");
            System.out.println("[10] Math.log()");
            System.out.println("[11] Math.log10()");
            System.out.println("[12] Math.exp()");
            System.out.println("[13] Math.sin()");
            System.out.println("[14] Math.cos()");
            System.out.println("[15] Math.tan()");
            System.out.println("[16] Exit");
            System.out.print("Choose a math method to learn about/run (1-16): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 
            System.out.println("\n----------------------------------------\n");

            switch (choice) {
                case 1: {
                    System.out.println("Math.abs()\nDescription: Returns the absolute value of a given argument.");
                    System.out.println("Syntax: public static int/long/float/double abs(int/long/float/double a)\n");
                    int val = -10;
                    System.out.println("Value: " + val);
                    System.out.println("Math.abs(" + val + ") = " + Math.abs(val));
                    break;
                }
                case 2: {
                    System.out.println("Math.max()\nDescription: Returns the greater of two values.");
                    System.out.println("Syntax: public static int/long/float/double max(int/long/float/double a, int/long/float/double b)\n");
                    int a = 15, b = 42;
                    System.out.println("Values: " + a + ", " + b);
                    System.out.println("Math.max(" + a + ", " + b + ") = " + Math.max(a, b));
                    break;
                }
                case 3: {
                    System.out.println("Math.min()\nDescription: Returns the smaller of two values.");
                    System.out.println("Syntax: public static int/long/float/double min(int/long/float/double a, int/long/float/double b)\n");
                    int a = 15, b = 42;
                    System.out.println("Values: " + a + ", " + b);
                    System.out.println("Math.min(" + a + ", " + b + ") = " + Math.min(a, b));
                    break;
                }
                case 4: {
                    System.out.println("Math.pow()\nDescription: Returns the value of the first argument raised to the power of the second argument.");
                    System.out.println("Syntax: public static double pow(double base, double exponent)\n");
                    double base = 2, exp = 3;
                    System.out.println("Base: " + base + ", Exponent: " + exp);
                    System.out.println("Math.pow(" + base + ", " + exp + ") = " + Math.pow(base, exp));
                    break;
                }
                case 5: {
                    System.out.println("Math.sqrt()\nDescription: Returns the correctly rounded positive square root of a double value.");
                    System.out.println("Syntax: public static double sqrt(double a)\n");
                    double val = 25.0;
                    System.out.println("Value: " + val);
                    System.out.println("Math.sqrt(" + val + ") = " + Math.sqrt(val));
                    break;
                }
                case 6: {
                    System.out.println("Math.round()\nDescription: Returns the closest integer value to the argument.");
                    System.out.println("Syntax: public static long round(double a) / public static int round(float a)\n");
                    double val = 5.6;
                    System.out.println("Value: " + val);
                    System.out.println("Math.round(" + val + ") = " + Math.round(val));
                    break;
                }
                case 7: {
                    System.out.println("Math.ceil()\nDescription: Returns the smallest double value that is greater than or equal to the argument and is equal to a mathematical integer.");
                    System.out.println("Syntax: public static double ceil(double a)\n");
                    double val = 5.2;
                    System.out.println("Value: " + val);
                    System.out.println("Math.ceil(" + val + ") = " + Math.ceil(val));
                    break;
                }
                case 8: {
                    System.out.println("Math.floor()\nDescription: Returns the largest double value that is less than or equal to the argument and is equal to a mathematical integer.");
                    System.out.println("Syntax: public static double floor(double a)\n");
                    double val = 5.8;
                    System.out.println("Value: " + val);
                    System.out.println("Math.floor(" + val + ") = " + Math.floor(val));
                    break;
                }
                case 9: {
                    System.out.println("Math.random()\nDescription: Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.");
                    System.out.println("Syntax: public static double random()\n");
                    System.out.println("Math.random() = " + Math.random());
                    break;
                }
                case 10: {
                    System.out.println("Math.log()\nDescription: Returns the natural logarithm (base e) of a double value.");
                    System.out.println("Syntax: public static double log(double a)\n");
                    double val = Math.E;
                    System.out.println("Value: " + val + " (e)");
                    System.out.println("Math.log(" + val + ") = " + Math.log(val));
                    break;
                }
                case 11: {
                    System.out.println("Math.log10()\nDescription: Returns the base 10 logarithm of a double value.");
                    System.out.println("Syntax: public static double log10(double a)\n");
                    double val = 100.0;
                    System.out.println("Value: " + val);
                    System.out.println("Math.log10(" + val + ") = " + Math.log10(val));
                    break;
                }
                case 12: {
                    System.out.println("Math.exp()\nDescription: Returns Euler's number e raised to the power of a double value.");
                    System.out.println("Syntax: public static double exp(double a)\n");
                    double val = 1.0;
                    System.out.println("Value: " + val);
                    System.out.println("Math.exp(" + val + ") = " + Math.exp(val));
                    break;
                }
                case 13: {
                    System.out.println("Math.sin()\nDescription: Returns the trigonometric sine of an angle.");
                    System.out.println("Syntax: public static double sin(double a)\n");
                    double val = Math.toRadians(30);
                    System.out.println("Angle in radians (30 degrees): " + val);
                    System.out.println("Math.sin(" + val + ") = " + Math.sin(val));
                    break;
                }
                case 14: {
                    System.out.println("Math.cos()\nDescription: Returns the trigonometric cosine of an angle.");
                    System.out.println("Syntax: public static double cos(double a)\n");
                    double val = Math.toRadians(60);
                    System.out.println("Angle in radians (60 degrees): " + val);
                    System.out.println("Math.cos(" + val + ") = " + Math.cos(val));
                    break;
                }
                case 15: {
                    System.out.println("Math.tan()\nDescription: Returns the trigonometric tangent of an angle.");
                    System.out.println("Syntax: public static double tan(double a)\n");
                    double val = Math.toRadians(45);
                    System.out.println("Angle in radians (45 degrees): " + val);
                    System.out.println("Math.tan(" + val + ") = " + Math.tan(val));
                    break;
                }
                case 16: {
                    System.out.println("Exiting application. Goodbye!");
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


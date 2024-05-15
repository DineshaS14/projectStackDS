package stackDS.tester;

import stackDS.code.Stack;

/** Class tests the stack class in stackDS.code.Stack.java.
 *
 */
public class StackTester {

    /** Main method to execute tester.
     *  @param args []
     */
    public static void main(String [] args){
        StackTester.testingIntegerList();
        StackTester.testingStringList();
    } // main

    /** Incorporate stack  with integer data to test.
     */
    public static void testingIntegerList() {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Test push method
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Test toString method
        System.out.println("Stack: " + stack);

        // Test pop method
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Test peek method
        System.out.println("Top value: " + stack.peek());

        // Test contains method
        System.out.println("Contains 20: " + stack.contains(20));
        System.out.println("Contains 40: " + stack.contains(40));

        // Test toArray method
        Integer[] array = stack.toArray();
        System.out.print("Array representation of stack: ");
        for (Integer value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Test clear method
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    } // testingIntegerList

    /** Incorporates stack with String List.
     */
    public static void testingStringList() {
        // Create a stack of strings
        Stack<String> stack = new Stack<>();

        // Test push method
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        // Test toString method
        System.out.println("Stack: " + stack);

        // Test pop method
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Test peek method
        System.out.println("Top value: " + stack.peek());

        // Test contains method
        System.out.println("Contains 'banana': " + stack.contains("banana"));
        System.out.println("Contains 'grape': " + stack.contains("grape"));

        // Test toArray method
        String[] array = stack.toArray();
        System.out.print("Array representation of stack: ");
        for (String value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Test clear method
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    } // testingStringList
} // StackTester

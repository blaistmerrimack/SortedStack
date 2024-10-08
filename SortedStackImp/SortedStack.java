package SortedStackImp;
import java.util.Stack;

/**
 * Class for a Stack of integer values sorted from smallest to largest.
 * This class implements a Stack using the Stack Class from the 
 * java collections framework. The class includes methods to add new values to 
 * the Stack, sorting the stack whenever a new value is added, as well as 
 * to print the values included in the Sorted Stack.
 */
public class SortedStack {
    private Stack<Integer> stack;

    /**
     * Constructor for the SortedStack Class. Initializes the object with 
     * a Stack attribute, which holds an empty Stack of integers 
     * instantiated from the Stack class from the java collections 
     * framework. Using the existing Stack class from the framework is an 
     * example of code re-use, allowing us to take advantage of existing 
     * structure and methods for this class and add features to fit our needs.
     */
    public SortedStack() {
        this.stack = new Stack<Integer>();
    }

    /**
     * Method to add new values to the Stack. This method takes advantage 
     * of the built in add() and sort() methods for the Java Collections 
     * Framework Stack class, re-using the code from these methods to 
     * quickly and easily add new values and sort the stack from smallest to
     * largest.
     * @param newVal integer value to add to the Stack in the correct 
     * sorted location.
     */
    public void addValue(int newVal){
        // Call Stack class methods to add a value and then sort the stack.
        stack.add(newVal);
        stack.sort(null);
        System.out.println("\n" + newVal + " added to the Stack!");
    }

    /**
     * Method to print the values of the Sorted Stack. This method acts
     * as a getter method to print the values of the class stack attribute.
     */
    public void printValues() {
        System.out.println(stack);
    }
}
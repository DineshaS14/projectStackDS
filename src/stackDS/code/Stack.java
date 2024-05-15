package stackDS.code;

import stackDS.code.Node;
import java.lang.NullPointerException;
import java.lang.reflect.Array;

/** This class represent the implementation of Stack Data Structure.
 *  Generic T lets us hold many objects in it.
 *  Author: Dinesha Shair.
 */
public class Stack<T> {

    private Node<T> top ;
    private int size;

    /** Creates a class constructor.
     */
    public Stack() {
        this.top = null;
        this.size = 0;
    } // constructor

    /** Method checks the size and return a boolean statement.
     *  @return true or false
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true; // checks the size and returns.
        } // if
        return false; // if size is greater than zero, return s false.
    } // isEmpty

    /** Method adds value to the list. LIFO.
     *  @param value
     */
    public void push(T value) {
        if (value == null) {
            throw new NullPointerException("push(VALUE is null.)");
        } // if
        Node<T> newNode = new Node<>(value, this.top);
        this.top = newNode;
        size++;
    } // push

    /** Method deletes the topitem of the list from the Stack.
     *  @return deleted item(value).
     */
    public T pop() {
        Node<T> popValue = this.top;
        this.top = top.getNext();
        size--;
        return popValue.getItem();
    } // pop

    /** Method returns the value at the top of the list.
     *  @return top value of the stack.
     */
    public T peek() {
        return this.top.getItem();
    } // peek

    /** Method clears the list of the Stack.
     *  Size becomes 0 since top is null/empty.
     */
    public void clear() {
        this.top = null;
        this.size = 0;
    } // clear

    /** Method looks for the value in the list of this Stack.
     *  @param value
     *  @return true if contains
     */
    public boolean contains(T value) {
        if (value == null) {
            throw new NullPointerException(" value cannot be Empty.");
        } // if
        Node<T> current = this.top;
        while (current != null) { // loops until current is null.
            if (current.getItem().equals(value)) { // .equals check if the value equals to node val.
                return true;
            } // if
            current = current.getNext(); // this way incrementing current value and looping.
        } // while loop
        return false;
    } // contains

    /** Method returns a list as an Array.
     *  @return T[] array
     */
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        // getClass() from object class.
        T[] array = (T[]) Array.newInstance(top.getItem().getClass(), size);
        Node<T> current = top;
        int index = 0;
        while (current != null) {
            array[index] = current.getItem();
            current = current.getNext();
            index++;
        }
        return array;
    }

    /**
     * {@inheritDoc}
     * Returns a string representation of this stack. The string representation consists of
     * the stack's elements in the order they are returned by its iterator (from top to bottom),
     * enclosed in square brackets ("[]"). Adjacent elements are separated by the characters
     * ", " (comma and space).
     */
    @Override
    public String toString() {
        String result = "[";
        Node<T> current = top;
        while (current != null) {
            result += "" + current.getItem();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }
        result += "]";
        return result;
    } // toString
} // Stack

package stackDS.code;

/** Node class for stack implementation.
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    /** Node constructor.
     * @param value sets the node value
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
    } // constructor.

    /** Node constructor takes in two parameters to connect hjead to the list.
     *  @param value
     *  @param nextValue
     */
    public Node(T value, Node<T> nextValue) {
        this.value = value;
        this.next = nextValue;
    } // Node constructor2

    /** Method sets the node to its value.
     *  @param value
     */
    public void setItem(T value) {
        this.value = value;
    } // setItem

    /** method returns the current Node.
     *  @return value of the current Node
     */
    public T getItem() {
        return this.value;
    } // getItem

    /** Method sets the next Node which is a link for the list..
     *  @param nextValue
     */
    public void setNext(Node<T> nextValue) {
        this.next = nextValue;
    } // setNext

    /** Method returns the next node linked to current Node.
     *  @return next Node
     */
    public Node<T> getNext() {
        return this.next;
    } // getNext

} // Node

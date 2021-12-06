package stepanPackage.practice11.task2;

public class NoSuchElementException extends RuntimeException {

    /**
     * Constructs a <code>NoSuchElementException</code> with <tt>null</tt>
     * as its error message string.
     */
    public NoSuchElementException() {
        super();
    }

    /**
     * Constructs a <code>NoSuchElementException</code>, saving a reference
     * to the error message string <tt>s</tt> for later retrieval by the
     * <tt>getMessage</tt> method.
     *
     * @param   s   the detail message.
     */
    public NoSuchElementException(String s) {
        super(s);
    }
}

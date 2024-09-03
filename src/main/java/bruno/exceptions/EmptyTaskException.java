package bruno.exceptions;

/**
 * Exception that should be thrown when task description is empty.
 */
public class EmptyTaskException extends BrunoException {
    public EmptyTaskException() {
        super("You entered an empty task! NOT COOL!");
    }
}

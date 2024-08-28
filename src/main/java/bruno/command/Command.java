package bruno.command;

import bruno.task.TaskList;

/**
 * Represents an abstract command in the Bruno application.
 * This class serves as a base for all command types, providing common functionality
 * for executing commands and managing the exit status of the application.
 */
public abstract class Command {
    private boolean isExit;
    private TaskList tasks;

    /**
     * Constructs a Command with the specified task list.
     *
     * @param tasks The task list associated with this command.
     */
    public Command(TaskList tasks) {
        this.tasks = tasks;
        this.isExit = false;
    }

    /**
     * Returns the task list associated with this command.
     *
     * @return The task list.
     */
    public TaskList getTasks() {
        return this.tasks;
    }

    /**
     * Sets the exit status of this command to true. This indicates that the application
     * should terminate after the command is executed.
     */
    public void exit() {
        this.isExit = true;
    }

    /**
     * Checks if this command is marked to exit the application.
     *
     * @return true if the command should exit the application, false otherwise.
     */
    public boolean isExit() {
        return this.isExit;
    }

    /**
     * Executes the command. This method must be implemented by subclasses to define
     * the specific behavior of each command.
     */
    public abstract void execute();
}

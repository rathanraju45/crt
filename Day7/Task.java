package Day7;

public class Task {
    String description;
    Task next;

    public Task(String description, Task next) {
        this.description = description;
        this.next = null;
    }
}

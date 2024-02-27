import java.util.ArrayList;

class TodoList {
    private final ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }
    public void Add(Task task) {
        tasks.add(task);
    }
    public void Delete(int i) {
        if (i >= 0 && i < tasks.size()) {
            tasks.remove(i);
        }
    }
    public void MarkDone(int i) {
        if (i >= 0 && i < tasks.size()) {
            Task task = tasks.get(i);
            task.markAsDone();
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
        }
        return sb.toString();
    }
}

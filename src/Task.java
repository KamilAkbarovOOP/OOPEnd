class Task {
    protected String task;
    protected boolean isDone;

    public Task(String task) {
        this.task = task;
        this.isDone = false;
    }

    public void markAsDone() {
        isDone = true;
    }
    @Override
    public String toString() {
        return (isDone ? "[X]" : "[ ]") + " " + task;
    }
}

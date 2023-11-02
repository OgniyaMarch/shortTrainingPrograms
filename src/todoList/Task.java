package todoList;

public class Task {
    private String task;
    private boolean isCompleted;
    public Task(String task){
        this.task = task;
        isCompleted = false;
    }

    public void markAsComplete(){
        isCompleted = true;
    }

    @Override
    public String toString() {
        if (isCompleted){
            return task + " (Completed)";
        }
        return task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}

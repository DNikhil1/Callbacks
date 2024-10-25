
class TaskPerformer {

    public void performTask(TaskListener callback) {
        System.out.println("Task is being performed ....");
        
    for(int i=1;i<=5;i++) {
        System.out.println("Performing step: " + i);
    }
    callback.onTaskComplete();
    }
    }
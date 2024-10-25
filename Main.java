public class Main {
    public static void main(String[] args) {
    TaskPerformer taskperformer = new TaskPerformer();
    
        taskperformer.performTask(new TaskListener(){
            @Override
            public void onTaskComplete() {
                System.out.println("Callback ....");
            }
        });
    }
    }

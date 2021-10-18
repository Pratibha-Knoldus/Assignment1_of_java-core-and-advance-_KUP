 import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService
                .schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second");
                              }
                          },
                        1,
                        TimeUnit.SECONDS);

        executorService.shutdown();

    }
}

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

        executorService.shutdown();

        if (integerFuture.isDone()) {
            System.out.println(integerFuture.get());
        }

        if(integerFuture.isCancelled()){
            System.out.println("Your task has been cancelled");
        }
    }
}

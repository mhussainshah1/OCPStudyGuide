package ocp11.exam_1Z0_819;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Q15 {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.print(list));
        IntStream.range(0, 5)
                .forEach(n -> executorService.execute(() -> {
                    try {
                        list.add(n);
                        barrier.await();
                    } catch (InterruptedException | BrokenBarrierException e) {
                        System.out.println("Exception");
                    }
                }));
        executorService.shutdown();
    }
}

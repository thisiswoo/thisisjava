package ch14.multi_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecCallableSubmitExample {
    public static void main(String[] args) {
        // ExecutorService 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5); // 최대의 스레드풀 5개로 생성

        // 계산 작업 생성 및 처리 요청
        for (int i = 1; i <= 100; i++) {
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int j = 1; j <= idx; j++) {
                        sum += j;
                    }
                    Thread thread = Thread.currentThread();
                    // 어떤 스레드가 계산 처리를 했는지 알 수 있도록 출력
                    System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산");
                    return sum;
                }
            });

            try {
                // 위 future의 call 메서드가 리턴 값이 있을 때 blocking 상태가 풀린다.
                // 즉, 스레드가 작업을 다 마치고 리턴 값을 줄 때 future.get() 할 수 있다. 그 때 일시정지가 풀린다.
                int result = future.get(); // Callable의 call() 메서드가 리턴한 값 얻기
                System.out.println("\t리턴값: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // ExecutorService 종료
        executorService.shutdown();

        // 출력 -----------------------------------
        // [pool-1-thread-1] 1~1 합 계산
        // 리턴값: 1
        //         [pool-1-thread-2] 1~2 합 계산
        // 리턴값: 3
        //              .
        //              .
        //              .
        // [pool-1-thread-5] 1~100 합 계산
        // 리턴값: 5050

    }
}

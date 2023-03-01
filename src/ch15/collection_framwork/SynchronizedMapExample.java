package ch15.collection_framwork;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        // 동기화되지 않은 new HashMap을 -> 동기화된 Map 컬렉션으로 생성
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
//        Map<Integer, String> map = new HashMap<>();

        // 작업 스레드 객체A 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1,000개 추가
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        // 작업 스레드 객체B 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 객체 1,000개 추가
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        // 출력 ------------------------------------------
        // 총 객체 수 : 2000 // 동기화된 map을 사용했을 때 -> Collections.synchronizedMap(new HashMap<>());
        // new HashMap<>(); 으로만 동기화 되지 않은 Map을 사용했을 때 값은 달라진다.
    }
}

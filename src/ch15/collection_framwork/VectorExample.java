package ch15.collection_framwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector 컬렉션 생성 List와 차의점 확인 하기
//        List<ArrayListBoard> list = new Vector<>();
        // ArrayList 컬렉션 생성 Vector와 차의점 확인 하기
        List<ArrayListBoard> list = new ArrayList<>();

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1; i <= 1000; i++) {
                    list.add(new ArrayListBoard("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1; i <= 1000; i++) {
                    list.add(new ArrayListBoard("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게함
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        // 출력 -------------------------------------
        // Vector일 경우
        // 총 객체 수 : 2000

        // ArrayList일 경우
        // 총 객체 수 : 1965
    }
}

package ch15.collection_framwork;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생채
        Stack<StackCoin> coinBox = new Stack<StackCoin>();

        // 동전 넣기
        coinBox.push(new StackCoin(100));
        coinBox.push(new StackCoin(50));
        coinBox.push(new StackCoin(500));
        coinBox.push(new StackCoin(10));

        // 동전을 하나씩 꺼내기
        while (!coinBox.isEmpty()) {
            StackCoin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }

        // 출력 ------------------------------------------
        // 꺼내온 동전 : 10원
        // 꺼내온 동전 : 500원
        // 꺼내온 동전 : 50원
        // 꺼내온 동전 : 100원

    }
}

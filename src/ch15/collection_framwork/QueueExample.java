package ch15.collection_framwork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<QueueMessage> queueMessages = new LinkedList<>();

        // 메세지 넣기
        queueMessages.offer(new QueueMessage("sendMail", "홍길동"));
        queueMessages.offer(new QueueMessage("sendSMS", "이자바"));
        queueMessages.offer(new QueueMessage("sendKakao", "스프링"));

        // 메세지를 하나씩 꺼내어 처리
        while (!queueMessages.isEmpty()) {
            QueueMessage message = queueMessages.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakao":
                    System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
                    break;
            }
        }

        // 출력 ----------------------------------------
        // 홍길동님에게 메일을 보냅니다.
        // 이자바님에게 SMS를 보냅니다.
        // 스프링님에게 카카오톡를 보냅니다.
    }
}

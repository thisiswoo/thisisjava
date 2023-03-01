package ch15.collection_framwork;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        // 비교자를 제공한 TreeSet 컬렉션 생성
        TreeSet<ComparatorFruitData> treeSet = new TreeSet<ComparatorFruitData>(new ComparatorFruit());

        // 객체 저장
        treeSet.add(new ComparatorFruitData("샤인머스켓", 30000));
        treeSet.add(new ComparatorFruitData("딸기", 10000));
        treeSet.add(new ComparatorFruitData("사과", 3000));

        // 객체를 하나씩 가져오기
        for (ComparatorFruitData fruitData : treeSet) {
            // 자동으로 내림차순으로 정렬되어 출력
            System.out.println(fruitData.name + " : " + fruitData.price);
        }

        // 출력 --------------------------------------------------
        // 사과 : 3000
        // 딸기 : 10000
        // 샤인머스켓 : 30000
    }
}

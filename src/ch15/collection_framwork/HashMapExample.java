package ch15.collection_framwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("Java", 2022);
        map.put("Spring", 2003);
        map.put("JPA", 2006);
        map.put("IntelliJ", 2001);  // key가 같기 때문에 제일 마지막에 저장한 값만 저장
        map.put("IntelliJ", 2002);  // key가 같기 때문에 제일 마지막에 저장한 값만 저장
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        // key로 값 얻기
        String key = "IntelliJ";
        int value = map.get(key);   // 키를 매개값으로 주면 값을 리턴
        System.out.println(key + ": " + map.get("IntelliJ"));
        System.out.println();

        // key Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();   // 키를 반복하기 위해 반복자를 얻음
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println("key : " + k + ", " + "value : " + v);
        }
        System.out.println();

        // 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println("key : " + k + ", " + "value : " + v);
        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("IntelliJ");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        // 출력 -----------------------------------------------------
        // 총 Entry 수 : 4

        // IntelliJ: 2002

        // key : IntelliJ, value : 2002
        // key : Java, value : 2022
        // key : JPA, value : 2006
        // key : Spring, value : 2003

        // key : IntelliJ, value : 2002
        // key : Java, value : 2022
        // key : JPA, value : 2006
        // key : Spring, value : 2003

        // 총 Entry 수 : 3
    }
}

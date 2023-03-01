package ch15.collection_framwork;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        // List 불변 컬렉션 생성
        List<String> immutableList1 = List.of("A", "B", "C");
        // immutableList1.add("D"); (X)   // UnsupportedOperationException 발생
        // Exception in thread "main" java.lang.UnsupportedOperationException
        // at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        // at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
        // at ch15.collection_framwork.ImmutableExample.main(ImmutableExample.java:9)
        System.out.println("List 불변 컬렉션 생성 immutableList1 : " + immutableList1);

        // Set 불변 컬렉션 생성
        Set<String> immutableSet1 = Set.of("A", "B", "C");
        // immutableSet1.remove("A");  (X)  // UnsupportedOperationException
        // Exception in thread "main" java.lang.UnsupportedOperationException
        // at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        // at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.remove(ImmutableCollections.java:150)
        // at ch15.collection_framwork.ImmutableExample.main(ImmutableExample.java:18)
        System.out.println("Set 불변 컬렉션 생성 immutableSet1 : " + immutableSet1);

        // Map 불변 컬렉션 생성
        Map<Integer, String> immutableMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );
        // immutableMap1.put(4, "D");   (X)   // UnsupportedOperationException
        // Exception in thread "main" java.lang.UnsupportedOperationException
        // at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        // at java.base/java.util.ImmutableCollections$AbstractImmutableMap.put(ImmutableCollections.java:1072)
        // at ch15.collection_framwork.ImmutableExample.main(ImmutableExample.java:31)//
        System.out.println("Map 불변 컬렉션 생성 immutableMap1 : " + immutableMap1);

        // List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);
        System.out.println("List 컬렉션을 불변 컬렉션으로 복사 immutableList2 : " + immutableList2);

        // Set 컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);
        System.out.println("Set 컬렉션을 불변 컬렉션으로 복사 immutableSet2 : " + immutableSet2);

        // Map 컬렉션을 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);
        System.out.println("Map 컬렉션을 불변 컬렉션으로 복사 immutableMap2 : " + immutableMap2);

        // 배열로부터 List 불변 컬렉션 생성
        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);
        System.out.println("배열로부터 List 불변 컬렉션 생성 immutableList3 : " + immutableList3);

        // 출력 ------------------------------------------------------
        // List 불변 컬렉션 생성 immutableList1 : [A, B, C]
        // Set 불변 컬렉션 생성 immutableSet1 : [B, A, C]
        // Map 불변 컬렉션 생성 immutableMap1 : {3=C, 2=B, 1=A}
        // List 컬렉션을 불변 컬렉션으로 복사 immutableList2 : [A, B, C]
        // Set 컬렉션을 불변 컬렉션으로 복사 immutableSet2 : [B, A, C]
        // Map 컬렉션을 불변 컬렉션으로 복사 immutableMap2 : {3=C, 2=B, 1=A}
        // 배열로부터 List 불변 컬렉션 생성 immutableList3 : [A, B, C]
    }
}

package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GetStreamFromCollectionExample {
    public static void main(String[] args)
    {
        // List 컬렉션 생성
        List<GetStreamFromCollectionProduct> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            GetStreamFromCollectionProduct product = new GetStreamFromCollectionProduct(i, "상품" + i, "멋진 회사 ", (int)(10000 * Math.random()));
            list.add(product);
        }

        // 객체 스트림 얻기
        Stream<GetStreamFromCollectionProduct> stream = list.stream();
        stream.forEach(p -> System.out.println(p));

        // 출력 --------------------------------------------------
        // price는 random 값 출력
        // GetStreamFromCollectionProduct{pno=1, name='상품1', company='멋진 회사 ', price=9984}
        // GetStreamFromCollectionProduct{pno=2, name='상품2', company='멋진 회사 ', price=4347}
        // GetStreamFromCollectionProduct{pno=3, name='상품3', company='멋진 회사 ', price=9195}
        // GetStreamFromCollectionProduct{pno=4, name='상품4', company='멋진 회사 ', price=450}
        // GetStreamFromCollectionProduct{pno=5, name='상품5', company='멋진 회사 ', price=3151}
    }
}

package ch16.lambda_expressions;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        ConstructorReferencePerson person = new ConstructorReferencePerson();

        // 생성자 참조
        ConstructorReferenceMember m1 = person.getMember1( ConstructorReferenceMember :: new );
        System.out.println(m1);
        System.out.println();

        // 생성자 참조
        ConstructorReferenceMember m2 = person.getMember2( ConstructorReferenceMember :: new );
        System.out.println(m2);

        // 출력 --------------------------------------------------------
        // ConstructorReferenceMember(String id)
        // ConstructorReferenceMember{id='winter', name='null'}

        // ConstructorReferenceMember(String id, String name)
        // ConstructorReferenceMember{id='winter', name='한겨울'}
    }
}

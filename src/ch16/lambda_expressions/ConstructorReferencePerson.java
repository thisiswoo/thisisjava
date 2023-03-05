package ch16.lambda_expressions;

public class ConstructorReferencePerson {
    public ConstructorReferenceMember getMember1(ConstructorReferenceCreatable1 creatable1) {
        String id = "winter";
        ConstructorReferenceMember member = creatable1.create(id);
        return member;
    }

    public ConstructorReferenceMember getMember2(ConstructorReferenceCreatable2 creatable2) {
        String id = "winter";
        String name = "한겨울";
        ConstructorReferenceMember member = creatable2.create(id, name);
        return member;
    }
}

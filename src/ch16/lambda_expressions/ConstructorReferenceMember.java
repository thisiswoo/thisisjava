package ch16.lambda_expressions;

public class ConstructorReferenceMember {
    private String id;
    private String name;

    public ConstructorReferenceMember(String id) {
        this.id = id;
        System.out.println("ConstructorReferenceMember(String id)");
    }

    public ConstructorReferenceMember(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("ConstructorReferenceMember(String id, String name)");
    }

    @Override
    public String toString() {
        return "ConstructorReferenceMember{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

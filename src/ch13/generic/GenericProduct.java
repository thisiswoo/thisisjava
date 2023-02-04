package ch13.generic;

// 제네릭 타입
public class GenericProduct<K, M> {
    // 필드
    private K kind;
    private M model;

    // 메서드
    // 타입 파라미터를 리턴 타입과 매개 변수 타입으로 사용

    public K getKind() {
        return this.kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return this.model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

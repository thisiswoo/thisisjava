package ch13.generic;

public class WildcardApplicant<T> {
    public T kind;

    public WildcardApplicant(T kind) {
        this.kind = kind;
    }
}

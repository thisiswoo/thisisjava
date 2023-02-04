package ch13.generic;

public class GenericBox<T> {
    public T content;
    public T t;

    // box의 내용물이 같은지 비교
    public boolean compare(GenericBox<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

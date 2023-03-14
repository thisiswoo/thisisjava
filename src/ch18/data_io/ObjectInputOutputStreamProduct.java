package ch18.data_io;

import java.io.Serial;
import java.io.Serializable;

public class ObjectInputOutputStreamProduct implements Serializable {
    // 직렬화
    @Serial
    private static final long serialVersionUID = -1132641602768551228L;
    private String name;
    private int price;

    public ObjectInputOutputStreamProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ObjectInputOutputStreamProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

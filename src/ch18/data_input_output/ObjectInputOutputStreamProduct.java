package ch18.data_input_output;

import java.io.Serializable;

public class ObjectInputOutputStreamProduct implements Serializable {
    // 직렬화
    private static final long serialVersionUID = -622284561026719240L;
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

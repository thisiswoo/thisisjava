package ch18.data_io;

import java.io.Serial;
import java.io.Serializable;

public class ObjectInputOutputStreamMember implements Serializable {
    // 직렬화
    @Serial
    private static final long serialVersionUID = -5622078641320873689L;

    private String id;
    private String name;

    public ObjectInputOutputStreamMember(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectInputOutputStreamMember{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

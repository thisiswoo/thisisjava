package ch18.data_input_output;

import java.io.Serializable;

public class ObjectInputOutputStreamMember implements Serializable {
    // 직렬화
    private static final long serialVersionUID = -622284561026719240L;
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

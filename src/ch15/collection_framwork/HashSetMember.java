package ch15.collection_framwork;

public class HashSetMember {
    public String name;
    public int age;

    public HashSetMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        // name과 age 값이 같으면 동일한 hashCode가 return
        return name.hashCode() + age;
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        // name과 age값이 같으면 true 리턴
        if (obj instanceof HashSetMember target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}

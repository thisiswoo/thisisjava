package ch08.oop_interface;

public sealed interface Jdk15SealedInterface permits Jdk15NonSealedInterface {
    void sealedMethod();
}

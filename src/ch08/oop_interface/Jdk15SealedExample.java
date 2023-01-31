package ch08.oop_interface;

public class Jdk15SealedExample {
    public static void main(String[] args) {
        Jdk15ImplClass impl = new Jdk15ImplClass();

        Jdk15SealedInterface sealed = impl;
        sealed.sealedMethod();

        System.out.println();

        Jdk15NonSealedInterface nonSealed = impl;
        nonSealed.sealedMethod();
        nonSealed.nonSealedMethod();

        System.out.println();

        Jdk15InterfaceC ic = impl;
        ic.sealedMethod();
        ic.nonSealedMethod();
        ic.methodC();
    }
}

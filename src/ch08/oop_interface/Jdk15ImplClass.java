package ch08.oop_interface;

public class Jdk15ImplClass implements Jdk15InterfaceC{

    @Override
    public void sealedMethod() {
        System.out.println("sealedMethod() 실행");
    }

    @Override
    public void nonSealedMethod() {
        System.out.println("nonSealedMethod() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("methodC() 실행");
    }
}

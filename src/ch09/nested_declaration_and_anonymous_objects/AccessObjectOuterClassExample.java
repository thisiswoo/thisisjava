package ch09.nested_declaration_and_anonymous_objects;

public class AccessObjectOuterClassExample {
    // instance field
    String outerField = "AOOCE - outerField";

    // AccessObjectOuterClassExample instance method
    void outerAooceMethod() {
        System.out.println("AOOCE - outerAooceMethod");
    }

    // instance member class
    class AOOCEInstanceMemberClass {
        // AOOCEInstanceMemberClass instance field
        String aooceimcField = "AOOCEInstanceMemberClass - field";

        // AOOCEInstanceMemberClass instance method1
        void aooceimcMethod() {
            System.out.println("aooceimcMethod - method");
        }

        // AOOCEInstanceMemberClass instance metho2
        void print() {
            // use AOOCEInstanceMemberClass field, method
            System.out.println("print() inner field : " + this.aooceimcField);
            this.aooceimcMethod();

            System.out.println();

            // use AccessObjectOuterClassExample field, method
            System.out.println("print() outer field : " + AccessObjectOuterClassExample.this.outerField);
            AccessObjectOuterClassExample.this.outerAooceMethod();
        }
    }

    // AccessObjectOuterClassExample instance method
    void useAccessObjectOuterClassMethod() {
        AOOCEInstanceMemberClass aooceimc = new AOOCEInstanceMemberClass();
        aooceimc.print();
    }
}

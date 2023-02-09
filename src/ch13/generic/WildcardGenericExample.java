package ch13.generic;

public class WildcardGenericExample {
    public static void main(String[] args) {
        // 모든 사람이 신청 가능
        WildcardCourse.registerCourse1(new WildcardApplicant<WildcardPerson>(new WildcardPerson()));
        WildcardCourse.registerCourse1(new WildcardApplicant<Worker>(new Worker()));
        WildcardCourse.registerCourse1(new WildcardApplicant<Student>(new Student()));
        WildcardCourse.registerCourse1(new WildcardApplicant<HighStudent>(new HighStudent()));
        WildcardCourse.registerCourse1(new WildcardApplicant<MiddleStudent>(new MiddleStudent()));

        System.out.println();

        // 학생만 신청 가능
//        WildcardCourse.registerCourse2(new WildcardApplicant<WildcardPerson>(new WildcardPerson()));    // (X)
//        WildcardCourse.registerCourse2(new WildcardApplicant<Worker>(new Worker()));                    // (X)
        WildcardCourse.registerCourse2(new WildcardApplicant<Student>(new Student()));
        WildcardCourse.registerCourse2(new WildcardApplicant<HighStudent>(new HighStudent()));
        WildcardCourse.registerCourse2(new WildcardApplicant<MiddleStudent>(new MiddleStudent()));

        System.out.println();

        // 직장인 및 일반인만 신청 가능
        WildcardCourse.registerCourse3(new WildcardApplicant<WildcardPerson>(new WildcardPerson()));
        WildcardCourse.registerCourse3(new WildcardApplicant<Worker>(new Worker()));
//        WildcardCourse.registerCourse3(new WildcardApplicant<Student>(new Student()));              // (x)
//        WildcardCourse.registerCourse3(new WildcardApplicant<HighStudent>(new HighStudent()));      // (x)
//        WildcardCourse.registerCourse3(new WildcardApplicant<MiddleStudent>(new MiddleStudent()));  // (x)
    }
}

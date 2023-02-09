package ch13.generic;

public class WildcardCourse {
    // 모든 사람이면 등록 가능
    public static void registerCourse1(WildcardApplicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() +
                "이(가) Course1을 등록");
    }

    // 학생만 등록 가능
    public static void registerCourse2(WildcardApplicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() +
                "이(가) Course2를 등록");
    }

    // 직장인 및 일반인만 등록 가능
    public static void registerCourse3(WildcardApplicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() +
                "이(가) Course3을 등록");
    }
}

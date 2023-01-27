package ch05.reference_type;

public class ArrayCopyExample {

    public static void main(String[] args) {

        // 길이가 3인 배열 생성
        String[] oldStrArr = {"java", "arr", "copy"};
        // 길이 '5'인 배열을 새로 생성
        String[] newStrArr = new String[5];
        // 배열 항목 복사
        // 1번째 인자 : Object src : 원본 배열
        // 2번째 인자 : 원본 배열 복사 시작 index
        // 3번째 인자 : 새로운 배열
        // 4번째 인자 : 새로운 배열에 붙여넣기 시작 index
        // 5번째 인자 : 복사 항목 수
        System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);

        // 배열 항목 출력
        for (int i = 0; i < newStrArr.length; i++) {
            System.out.println(newStrArr[i] + ", ");
        }
    }

}

package ch09.nested_declaration_and_anonymous_objects;

public class NestedInterfaceExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        NestedInterfaceButton niBtn = new NestedInterfaceButton();

        // OK 버튼 클릭 이벤트를 처리할 ClickListener 구현
        class OkListener implements NestedInterfaceButton.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        // OK 버튼 객체에 ClickListener 구현 객체 주입
        niBtn.setClickListener(new OkListener());

        // OK 버튼 클릭하기
        niBtn.click();

        // cancel 버튼 객체 생성
        NestedInterfaceButton niBtnCancel = new NestedInterfaceButton();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListerner 구현 클래스(로컬 클래스)
        class CancelListener implements NestedInterfaceButton.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        // Cancel 버튼 객체에 치ㅑ차ㅣㅑㄴㅅ둗ㄱ rngus rorcp wndlq
        niBtnCancel.setClickListener(new CancelListener());

        // Cancel 버튼 클릭
        niBtnCancel.click();
    }
}

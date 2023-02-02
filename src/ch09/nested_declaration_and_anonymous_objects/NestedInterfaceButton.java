package ch09.nested_declaration_and_anonymous_objects;

public class NestedInterfaceButton {
    // 정적 멤버 인터페이스
     public static interface ClickListener {
         // 추상 메서드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메서드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}

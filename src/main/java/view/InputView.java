package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }
    public static int inputTodoNumber() {
        System.out.println("## 메인화면\n1 - 주문등록\n2 - 결제하기\n3 - 프로그램 종료\n");
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextInt();
    }
}

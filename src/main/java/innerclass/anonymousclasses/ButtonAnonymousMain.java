package innerclass.anonymousclasses;

import java.util.Scanner;

public class ButtonAnonymousMain {

    private static Scanner scanner = new Scanner(System.in);
    private static ButtonAnonymous btnPrint = new ButtonAnonymous("Print");

    public static void main(String[] args) {
        // btnPrint.setOnClickListenerAnonymous(title -> System.out.println(title + " was clicked"));
        // we can replace it with lambda!!! :)
        btnPrint.setOnClickListenerAnonymous(new ButtonAnonymous.OnClickListenerAnonymous() {
            @Override
            public void onClickAnonymous(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listenAnonymous();
    }

    private static void listenAnonymous() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter 0 for quit, and 1 for onclick!");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> quit = true;
                case 1 -> btnPrint.onClickAnonymous();
            }
        }
    }
}

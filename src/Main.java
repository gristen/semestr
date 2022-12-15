import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Unemployed> base = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String menu;
        do {
            Menu.mainMenu();
            menu = scanner.nextLine();
            switch (menu) {
                case ("1"):
                   Menu.addMenu(); // complited
                    break;
                case ("2"):
                 Menu.PrintUnempl(); // complited
                    break;
                case ("3"):
                    System.out.println("3");/*Menu.removeMenu(base)*/
                    break;
                case ("4"):
                   Menu.serchUser();//compl
                    break;
                case ("5"): {
                    System.out.println("Пока-пока!");
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Введите цифру, а не букву!\n");
                    break;
            }

        } while (menu != "5") ;
    }
}
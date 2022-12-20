import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Unemployed> users = new ArrayList<>();
        Menu asd = new Menu();
        date(users);

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
                    asd.deleteUser(users);
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
    public static void date(ArrayList<Unemployed> users) throws Exception {
        FileWriter fw = new FileWriter("DBusers.txt",true);
        FileReader fr = new FileReader("DBusers.txt");
        Scanner scan = new Scanner(fr);
        int i = 0;

        String name = null;
        String profession = null;
        String education = null;
        String lastWorkPlace = null;
        String dismissalCause = null;
        String maritalStatus = null;
        String housingCond = null;
        String contacts = null;
        String requirements = null;
        while (scan.hasNextLine()) { // пока имеются строки в books.txt
            String line = scan.nextLine(); // каждая строка записывается в line
            if (line.isEmpty()) { // если строка в line пустая
                i = 0;
                continue; // остальная часть цикла пропускается
            }
            switch (i) {
                case 0 -> name = line; // если i = 0, значение line записывается в author
                case 1 -> profession = line; // если i = 1, значение line записывается в title
                case 2 -> education = line; // если i = 2, значение line записывается в publisher
                case 3 -> lastWorkPlace = line; // если i = 3, значение line записывается в year
                case 4 -> dismissalCause = line; // если i = 4, значение line записывается в section
                case 5 -> maritalStatus = line; // если i = 5, значение line записывается в original
                case 6 -> housingCond = line; // если i = 5, значение line записывается в original
                case 7 -> contacts = line; // если i = 5, значение line записывается в original
                case 8 -> requirements = line; // если i = 5, значение line записывается в original

            }

            if (i == 8){
                users.add(new Unemployed(name, profession, education, lastWorkPlace, dismissalCause, maritalStatus, housingCond, contacts, requirements));

            }

            i++;
            fw.close();
        }


    }

}


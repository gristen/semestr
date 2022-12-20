import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("Выберите действие\n" +
                "1 - Добавить безработного\n" +
                "2 - Показать всех безработных\n" +
                "3 - Удалить безработного\n" +
                "4 - Поиск безработного\n" +
                "5 - Закрыть программу\n");
    }

    public static void addMenu() throws IOException {


        Unemployed unemployed = new Unemployed();

        do {
            System.out.println("Введите фамилию с инициалами: ");
            unemployed.setName(scanner.nextLine());
            if (Unemployed.nameCorrect(unemployed.getName())) break;
            else System.out.println("Фамилию и инициалы нужно вводить так: А.С.Пушкин");
        } while (true);
        do {
            System.out.println("Введите профессию: ");
            unemployed.setProfession(scanner.nextLine());
            if (Unemployed.textCorrect(unemployed.getProfession())) break;
            else System.out.println("Профессия должна содержать только кирилицу и начинаться с заглавной буквы!");
        } while (true);
        do {
            System.out.println("Введите образование безработного: ");
            unemployed.setEducation(scanner.nextLine());
            if (Unemployed.textCorrect(unemployed.getEducation())) break;
            else System.out.println("Образование должно содержать только кирилицу и начинаться с заглавной буквы!");
        } while (true);
        do {
            System.out.println("Введите причину увольнения: ");
            unemployed.setDismissalCause(scanner.nextLine());
            if (Unemployed.textCorrect(unemployed.getDismissalCause())) break;
            else
                System.out.println("Причина увольнения должна содержать только кирилицу и начинаться с заглавной буквы!");
        } while (true);
        do {
            System.out.println("последнее рабочее место: ");
            unemployed.setLastWorkPlace(scanner.nextLine());
            if (Unemployed.textCorrect(unemployed.getDismissalCause())) break;
            else
                System.out.println("Причина увольнения должна содержать только кирилицу и начинаться с заглавной буквы!");
        } while (true);
        do {
            System.out.println("Введите семейное положение безработного: ");
            unemployed.setMaritalStatus(scanner.nextLine());
            if (Unemployed.textCorrect(unemployed.getMaritalStatus())) break;
            else
                System.out.println("Семейное положение должно содержать только кирилицу и начинаться с заглавной буквы!");
        } while (true);
        do {
            System.out.println("Жилье: ");
            unemployed.setHousingCond(scanner.nextLine());
            if (Unemployed.textCorrect(unemployed.getHousingCond())) break;
            else
                System.out.println("Жилищные условия должны содержать только кирилицу и начинаться с заглавной буквы!");
        } while (true);
        do {
            System.out.println("введите номер телефона: ");
            unemployed.setContacts(scanner.nextLine());
            if (Unemployed.contactCorrect(unemployed.getContacts())) break;
            else System.out.println();
        } while (true);
        System.out.println("Введите требования безработного к будущей работе: ");
        unemployed.setRequirements(scanner.nextLine());
        unemployed.SetInf();


    }

    public static Unemployed PrintUnempl() throws Exception {
        FileReader fr = new FileReader("DBusers.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
        return null;
    }

    public static void serchUser() throws Exception {
        FileReader fr = new FileReader("DBusers.txt");
        ArrayList<String> chars = new ArrayList<>();
        Scanner scan = new Scanner(fr);
        System.out.println("Введите некую часть резюме безработного. Ввод должен выглядить -> Ключ: Параметр. Пример - Профессия: Бугалтер ");
        String textSearch = "";
        textSearch = scanner.nextLine();
        int i = 0;
        int sov = 0;
        while (scan.hasNextLine()) {

            chars.add(scan.nextLine());

        }
        for (String arr : chars) {
            if (arr.equals(textSearch)) {
                sov++;
                int y = i;
                int test = 0;
                String slovo;
                if (sov > 1) {
                    slovo = textSearch.substring(0, textSearch.indexOf(":"));
                    switch (slovo) {
                        case "Профессия":
                            test = 9;
                            y--;
                            break;
                        case "образование":
                            test = 9;
                            y -= 2;
                            break;
                        case "последнее рабочее место":
                            test = 9;
                            y -= 3;
                            break;
                        case "Причина увольнения":
                            test = 9;
                            y -= 4;
                            break;
                        case "семейный статус":
                            test = 9;
                            y -= 5;
                            break;
                        case "Жилье":
                            test = 9;
                            y -= 6;
                            break;
                        case "Контакты":
                            test = 9;
                            y -= 7;
                            break;
                        case "требования":
                            test = 9;
                            y--;
                            break;
                    }


                    for (int x = 0; x < 9; x++) {

                        System.out.println(chars.get(y++));

                    }
                    System.out.println("");
                } else {

                    slovo = textSearch.substring(0, textSearch.indexOf(":"));

                    switch (slovo) {
                        case "Профессия":
                            test = 9;
                            y--;
                            break;
                        case "Образование":
                            test = 9;
                            y -= 2;
                            break;
                        case "последнее рабочее место":
                            test = 9;
                            y -= 3;
                            break;
                        case "Причина увольнения":
                            test = 9;
                            y -= 4;
                            break;
                        case "семейный статус":
                            test = 9;
                            y -= 5;
                            break;
                        case "Жилье":
                            test = 9;
                            y -= 6;
                            break;
                        case "Контакты":
                            test = 9;
                            y -= 7;
                            break;
                        case "требования":
                            test = 9;
                            y--;
                            break;
                    }


                    for (int x = 0; x < 9; x++) {

                        System.out.println(chars.get(y++));


                    }
                    System.out.println("");
                }


            }
            i++;
        }
        fr.close();


    }



    public  void deleteUser(ArrayList<Unemployed>users) throws IOException {
        FileWriter reuser = null;
        Unemployed result = null;
        System.out.println("Введите некую часть резюме безработного. Ввод должен выглядить -> Ключ: Параметр. Пример - Имя: Б.Б.Бас ");
        String textSearch = "";
        textSearch = scanner.nextLine();

        for (Unemployed user : users) {
            if (user.getName().equals(textSearch) ||
                    user.getProfession().equals(textSearch) ||
                    user.getContacts().equals(textSearch) ||
                    user.getLastWorkPlace().equals(textSearch)) {
                result = user;
                System.out.println(user.toString());
                users.remove(result);
                reuser =  new FileWriter("DBusers.txt");
                for (Unemployed usere : users) {
                    reuser.write("\n" + usere.getName() + "\n" + usere.getProfession() + "\n" +
                            usere.getEducation() + "\n" + usere.getLastWorkPlace() + "\n" +
                            usere.getDismissalCause() + "\n" + usere.getMaritalStatus() + "\n"+ usere.getHousingCond() + "\n"+ usere.getContacts() + "\n"+ usere.getRequirements() + "\n");
                    reuser.flush();
                }
                break;
            }
        }


    }



}
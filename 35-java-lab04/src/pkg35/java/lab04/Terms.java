package pkg35.java.lab04;




import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Win7
 */
public class Terms {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // создать буферизированный поток чтения типа BufferedReader,
        // используя стандартный поток ввода System.in
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // метод перевизначення, overriding. Так же этот пример демострирует статическое и динамическое связывания в Java
        Administrator administrator = new Admin();
        administrator.talk();
        //Создаём фабричный метод 
        //UserFactory userFactory = createUserBySpecialty("vasya");
        //User user = userFactory.createUser();
        //user.writeCode();
        String s = null;
        String MassTela;//создать переменную для массы тела
        String SkorostTela;//создать переменную для скорости тела
        System.out.println("Введите массу тела:");
        MassTela = in.readLine();//присвоим считаное значение пременной
        System.out.println("Введите скорость тела:");
        SkorostTela = in.readLine();//присвоим считаное значение пременной
        //Цикл для управления програмой
        do {
            do {
                System.out.println("\nПожалуйста выберете дейсвие:"
                        + "\nЧтобы выйти из програмы нажмите = 1"
                        + "\nПосмотреть предыдущие результаты нажмите = 2"
                        + "\nВыполнить вычисление из новыми переменными та сохранить их = 3"
                        + "\nПротестировать корректность результатов сериализации/десериализации = 4");
                try {
                    s = in.readLine();////присвоим считаное значение пременной
                } catch (IOException e) {
                    System.out.println("Ошибка: " + e);
                    System.exit(0);
                }
            } while (s.length() != 1);
            switch (s.charAt(0)) {
                case '1':
                    System.out.println("Выход.");
                    break;
                case '2'://используем класс Out для выводу предыдущих  значений 
                    Out.main(MassTela, SkorostTela);
                    break;
                case '3'://используя сериализацию сохраняем данные
                    SerializableClass date = new SerializableClass(MassTela, SkorostTela);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.out"));
                    objectOutputStream.writeObject(date);
                    objectOutputStream.close();
                    Calculation.KineticEnergy(MassTela, SkorostTela);
                    System.out.println("Всё усешно сохранено!");
                    break;
                case '4'://используя сериализацию проверяем коректность работы
                    Test.proverka(MassTela, SkorostTela);
                    System.out.println("Проверка прошла успешно!");
                    break;
                default:
                    System.out.print("Неизвестная команда.\n\n ");
            }
        } while (s.charAt(0) != '1');
    }

    static UserFactory createUserBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("dima")) {
            return new DimaUserFactory();
        } else if (specialty.equalsIgnoreCase("vasya")) {
            return new VasyaUserFactory();
        } else {
            System.out.println(specialty + "Такой пользователь не существует");
        }
        return null;
    }
}

package pkg35.java.lab04;





import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Win7
 */
public class Test {

    public static void proverka(String MassTela, String SkorostTela) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializableClass date = new SerializableClass(MassTela, SkorostTela);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.out"));
        objectOutputStream.writeObject(date);
        objectOutputStream.close();

        // Востановление из файла с помощью класса ObjectInputStream
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.out"));
        SerializableClass dateRestored = (SerializableClass) objectInputStream.readObject();
        objectInputStream.close();

        //Сериализация с помощью класса ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream2.writeObject(date);
        objectOutputStream2.flush();

        //Восстановление с помощью класса ByteArrayInputStream
        ObjectInputStream objectInputStream2 = new ObjectInputStream(
                new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        SerializableClass dateRestoredFromByte = (SerializableClass) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("Before Serialize: " + "\n");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n| Масса тела | Скорость тела |");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n%s", date);
        System.out.format("%n+------------+---------------+");
        System.out.println("\nAfter Restored From Byte: " + "\n");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n| Масса тела | Скорость тела |");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n%s", dateRestoredFromByte);
        System.out.format("%n+------------+---------------+");
        System.out.println("\nAfter Restored: " + "\n");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n| Масса тела | Скорость тела |");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n%s", dateRestored);
        System.out.format("%n+------------+---------------+%n");
;

    }
}

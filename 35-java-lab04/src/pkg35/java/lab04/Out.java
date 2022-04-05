package pkg35.java.lab04;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.Scanner;

//Вывод предыдущих результатов
public class Out {

    public static void main(String MassTela, String SkorostTela) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.out"));
        SerializableClass dateRestored = (SerializableClass) objectInputStream.readObject();
        objectInputStream.close();
        System.out.format("%n+------------+---------------+");
        System.out.format("%n| Масса тела | Скорость тела |");
        System.out.format("%n+------------+---------------+");
        System.out.format("%n%s", dateRestored);
        System.out.format("%n+------------+---------------+");
        
        //Добавляем колекциб

    }
}

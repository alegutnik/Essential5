package Task3;


import Task2.Zoo;

public class ZooCorrect {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        System.out.println("Базовий список: " + zoo.animals);
        System.out.println("Базовий розмір списку: " + zoo.animals.size());
        System.out.println("Видаляємо 3,5,7 елемент");
        zoo.animals.remove(7);
        zoo.animals.remove(5);
        zoo.animals.remove(3);
        System.out.println("Виправленний список: " + zoo.animals);
        System.out.println("Виправленний розмір списку: " + zoo.animals.size());


    }
}

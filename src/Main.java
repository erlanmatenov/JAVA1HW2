import java.util.Random;

public class Main {
    /*
    ДЗ на сообразительность:
    Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
    При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование
    случайного возраста с помощью метода “generateRandomAge”*/
    public static void main(String[] args) {
        System.out.println(generateRandomAge());
        System.out.println(age(generateRandomAge(),30));
        System.out.println(age(generateRandomAge(),-30));
        System.out.println(age(generateRandomAge(),40));
        System.out.println(age(generateRandomAge(),30));
        System.out.println(age(generateRandomAge(),20));
    }

    public static String age(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        }else {
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(80) + 1;
        return age;
    }
}

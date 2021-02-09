package u.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 *
 * HomeWork for lesson5
 * Created 09.02.2021
 * v1.0
 */
public class Lesson5 {
    public static void main(String[] args) {
        // создаем разных животных всего животных создадим 6 (4 в обычном режиме 2 клонированный)
        // Немного криво, но временно (по мере создания) для наглядности загоняю наших животных в массив
        // для применения к ним разных действий в цикле.

        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Кот сиамский", "Мурзик", 0, 0, 5000, 200, 20);
        animals[1] = new Cat("Кошка абиссинская", "Алиса", 0, 6, 4000, 250, 10);
        animals[5] = new Dog("Собака Дог (кобель)", "Наг", 0, 55, 10000, 1000, 200);
        animals[6] = new Dog("Собака Пудель (самка) ", "Лора", 0, 25, 5000, 500, 50);

        // клонируем dog2 в cloneDog2 (потом) // жестоко затупил что то  я пришлось покопаться в интернете
        // реализацию нашел на https://metanit.com/java/tutorial/3.13.php
        // в принципе разобрался, но весьма поверхностно. Прошу прощения что забежал немного вперед.
        // очень хотелось реализовать раздельный подсчет оригинальных объектов и клонов.

        try {
            animals[2] = (Cat) animals[0].clone();                     // попытка реализовать раздельный подсчет оригиналов и клонов (удача)
            animals[3] = (Cat) animals[1].clone();                     // попытка автоматического присвоения клону модифицированного имени (
            animals[4] = (Cat) ((Cat) animals[1]).clone("mutate");   // попытка присвоения клону модифицированных характеристик (создаем мутанта)
            animals[7] = (Dog) animals[5].clone();
            animals[8] = (Dog) animals[6].clone();
            animals[9] = (Dog) ((Dog) animals[6]).clone("mutate");
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("Клонирование не реализовано");
        }
        System.out.println("Характеристики созданных животных");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");


        //Вывод общих результатов из данных класса;
        System.out.println("Всего котов создано: " + (Cat.getCount() + Cat.getCountClone()));
        System.out.println("в том числе клонированных котов: " + Cat.getCountClone());
        System.out.println("Всего собак создано: " + (Dog.getCount() + Dog.getCountClone()));
        System.out.println("в том числе клонированных собак: " + Dog.getCountClone());
        System.out.println("Всего собак создано: " + Dog.getCountClone());
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Тестирование подопытных на выносливость: ");
        System.out.println("Бег: ");
        System.out.println("---------------------------------------------------------------------------------------");
        //Обращение к объектам в части проверки работы методов использующих характеристики каждого животного
        // заставляем животных бегать
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");

        //заставляем животных плавать
        // в первом цикле вывожу список животных которые с заданием справились
        // во втором, тех кто не справился.
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }

    }
}

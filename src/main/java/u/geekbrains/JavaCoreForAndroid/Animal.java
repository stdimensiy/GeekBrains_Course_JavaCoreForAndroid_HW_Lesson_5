package u.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 *
 * HomeWork for lesson 5
 * Created 09.02.2021
 * v1.0
 */

//Класс животное (животные)

public class Animal implements Cloneable {
    protected String type;       // вид животного (наименование класса эт. хорошо но оно видно только программе)
    protected String name;       // имя или кличка животного (если есть)
    protected int flying;        // возможность животного летать     (численная характеристика, метры непрерывного полета)
    protected int swims;         // возможность животного плавать    (численная характеристика, метры непрерывного интенсивного плавания)
    protected int goes;          // возможность животного ходить     (численная характеристика, метры непрерывного спокойного хождения)
    protected int run;           // возможность животного бегать     (численная характеристика, метры непрерывного быстрого бега)
    protected int crawling;      // возможность животного ползать    (численная характеристика, метры непрерывного перемещения ползком)
    private static int count;    // счетчик количества созданных животных (в том числе клонированных) не стал тут разделять.


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        count++;
        return super.clone();
    }

    @Override
    public String toString() {
        return "Вид/порода: '" + type + '\'' +
                ", Кличка: '" + name + "\' \nТТХ:" +
                ", Может пролететь " + flying + "м. " +
                ", Может проплыть " + swims + "м. " +
                ", Может пройти " + goes + "м. " +
                ", Может пробежать " + run + "м. " +
                ", Может проползти " + crawling + "м. \n";
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
}
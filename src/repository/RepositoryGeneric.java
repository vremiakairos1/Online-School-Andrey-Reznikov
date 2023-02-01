package repository;
import models.Lecture;
import models.Superclass;

public class RepositoryGeneric <E extends Superclass> {

    private static int SIZE_ARRAY = 5;

    private static Superclass[] arraySuperclass;//исходный массив
    private static int newSize;//переменная для нового массива
    private static Superclass[] increaseArray;// увеличенный массив
    private static int fullOF=0;// для проверки заполненности всего исходного массива


    public RepositoryGeneric() {

        this.arraySuperclass = new Superclass[SIZE_ARRAY];//передали переменную 5
        this.increaseArray = new Superclass[newSize];// передали переменную для нового массива

    }

    // метод проверяет заполненность всего массива и вызывает метод для увеличения массива
    public static void fullArraySuperclass(){
        for (int i=0; i<arraySuperclass.length; i++) {
            fullOF = 0;
            fullOF = i;
            if (arraySuperclass[i] != null) {
                fullOF++;
                if (fullOF == arraySuperclass.length) {
                    System.out.println("Количество заполненных элементов " + fullOF);
                    increaseSIZE();
                    break;
                }
            }
        }
    }

    // метод увеличивает массив
    public static void increaseSIZE(){
        newSize = (SIZE_ARRAY * 3) /2 +1;
        increaseArray = new Lecture[newSize];
        System.arraycopy(arraySuperclass, 0, increaseArray, 0, arraySuperclass.length);
        arraySuperclass = increaseArray;
    }

    // метод возвращает размер массива
    public int size() {
        return newSize;
    }

    // метод проверяет на пустоту весь массив
    public boolean isEmpty() {
        boolean emptySize = false;
        if (newSize == 0) {
            emptySize = true;
        }
        return emptySize;
    }
    // метод получает индекс массива - в задании в параметре говорится int index 60??
    public E getIndex(int index){
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (i==index){
                break;
            }
            return (E) arraySuperclass[i];
        }
        return null;
    }

    // метод добавляет элемент в массив.
    public void add(E fillIN) {
        for (int i = 0; i<arraySuperclass.length; i++) {
            if (arraySuperclass[i] != null) {
                continue;
            }
            arraySuperclass[i] = (E) fillIN;
            break;
        }
    }
    // метод добавляет элементы по индексу
    public void addIndex(int index,E fillIN) {
        for (int i = 0; i<arraySuperclass.length; i++) {
            if (arraySuperclass[index] == null) {
                arraySuperclass[index] = (E) fillIN;
                break;
            }
        }

    }
    // метод удаляет элемент по индексу, но не сдвиагает элементы
    public void remove(int index){
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (arraySuperclass[i] != null) {
                if (index == arraySuperclass[i].getID()) {
                    arraySuperclass[i] = null;
                }
            }
        }
    }
}

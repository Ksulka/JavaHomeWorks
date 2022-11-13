/*1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
        которое является информационной системой ветеринарной клиники.

        -Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка,
        цвет и возраст (или другие параметры на ваше усмотрение).
        -Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
        -Поместите в него некоторое количество объектов.
        -Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
        -Убедитесь, что все они сохранились во множество.

        -Создайте метод public boolean equals(Object o)
        Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
        То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
        Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/

package homeWork06;

import java.util.HashSet;

public class Cat {
    private int id;
    private String nameOfCat;
    private String breed;
    private String fullNameOwner;
    private String telNumberOwner;

    public Cat(int id, String nameOfCat, String breed, String fullNameOwner, String telNumberOwner) {
        this.id = id;
        this.nameOfCat = nameOfCat;
        this.breed = breed;
        this.fullNameOwner = fullNameOwner;
        this.telNumberOwner = telNumberOwner;
    }

    public String getFullNameOwner() {
        return this.fullNameOwner;
    }

    public String getTelNumberOwner() {
        return this.telNumberOwner;
    }

    public String getNameOfCat() {
        return this.nameOfCat;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public String toString() {
        return "id: " + id + ";" + " cat's name: " + nameOfCat + ";" + "   breed: " + breed + ";" + "   owner: " + fullNameOwner + ";" + "   tel: " + telNumberOwner;
    }

    @Override
    public boolean equals(Object obj) {
        var t = (Cat) obj;
        return id == t.id && nameOfCat == t.nameOfCat && breed == t.breed && fullNameOwner == t.fullNameOwner && telNumberOwner == t.telNumberOwner;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(001, "Bandit", "bobtail", "Oksana", "+79111000000");
        Cat cat2 = new Cat(002, "Jerry", "balinese", "Maks", "+79111000001");
        Cat cat3 = new Cat(001, "Bandit", "bobtail", "Oksana", "+79111000000");
        Cat cat4 = new Cat(004, "Tom", "bombay", "Nikita", "+79111000003");
        Cat cat5 = new Cat(005, "Kil'ka", "burmila", "Ann", "+79111000004");

        var cats = new HashSet<Cat>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        for (var item : cats) System.out.println(item);
    }
}

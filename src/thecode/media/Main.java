package thecode.media;

/*
* Начальник транспортного цеха пригласил несколько человек на совещание.
* Каждый, кто входил в кабинет, пожимал руки всем остальным.
* Сколько человек участвовало в совещании, если всего получилось 120 рукопожатий?
*/
public class Main {
    private static int handshakes = 0;
    private static int persons = 1;

    public static void foo() {
        while (handshakes != 120) {
            persons++;
            handshakes += persons - 1;
        }
        System.out.println(persons);
    }

    public static void main(String[] args) {
        foo();
    }
}

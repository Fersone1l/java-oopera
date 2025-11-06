import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров",Gender.MALE, 185);
        Actor actor2 = new Actor("Анна", "Сидорова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Сергей", "Иванов", Gender.MALE, 178);

        ArrayList<Actor> actorsList1 = new ArrayList<>();
        ArrayList<Actor> actorsList2 = new ArrayList<>();
        ArrayList<Actor> actorsList3 = new ArrayList<>();

        actorsList1.add(actor1);
        actorsList1.add(actor2);

        actorsList2.add(actor2);
        actorsList2.add(actor3);

        actorsList3.add(actor1);
        actorsList3.add(actor3);

        Director director1 = new Director("Олег", "Табаков", Gender.MALE, 15);
        Director director2 = new Director("Мария", "Захарова", Gender.FEMALE, 8);

        String oneginLibretto = """
            ДЕЙСТВИЕ ПЕРВОЕ
            Сцена 1: Сад в усадьбе Лариных
            ЛЕНСКИЙ: "Я люблю вас, Ольга..."
            ТАТЬЯНА: "Письмо к Онегину... Боже, что я делаю?"
            ОНЕГИН: "Мечтам и годам нет возврата..."
            """;

        String swanLakeLibretto = """
            АКТ I
            Сцена: Парк перед замком
            ПРИНЦ ЗИГФРИД: "Скучно на этом празднике..."
            ОДЕТТА: "Злой волшебник Ротбарт превратил меня в лебедя..."
            ТАНЕЦ ЛЕБЕДЕЙ: "Белые лебеди кружатся в лунном свете..."
            """;

        Show show = new Show(
                "Ревизор",
                120,
                director1,
                actorsList1
        );

        Opera opera = new Opera(
                "Евгений Онегин",
                180,
                director2,
                actorsList2,
                "Пётр Чайковский",
                oneginLibretto,
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                150,
                director1,
                actorsList3,
                "Пётр Чайковский",
                swanLakeLibretto,
                "Мариус Петипа"
        );

        System.out.println(show.getListOfActors());
        System.out.println(opera.getListOfActors());
        System.out.println(ballet.getListOfActors());
        System.out.println();

        opera.replaceActor(actor1, "Иванов");
        System.out.println("Актерский состав " + opera.getTitle() + ": " + opera.getListOfActors());
        System.out.println();

        ballet.replaceActor(actor2, "Пушкин");
        System.out.println("Актерский состав " + ballet.getTitle() + ": " + ballet.getListOfActors());
        System.out.println();

        System.out.println("Текст либретто " + opera.getTitle() + ":\n" + opera.getLibrettoText());
        System.out.println("Текст либретто " + ballet.getTitle() + ":\n" + ballet.getLibrettoText());
    }
}

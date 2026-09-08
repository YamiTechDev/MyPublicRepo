public class Main {
    public static void main(String[] args) {
        // Создаем первого кота (Объект)
        Cat myCat = new Cat();
        myCat.name = "Барсик";
        myCat.age = 3;

        // Создаем второго кота (Объект)
        Cat anotherCat = new Cat();
        anotherCat.name = "Мурзилка";
        anotherCat.age = 5;

        // создаем еще кота(Обьект)
        Cat billyCat = new Cat();
        billyCat.name = "Мороз";
        billyCat.age = 2;

        Dog richi = new Dog();
        richi.nameDog = "Ричи";
        richi.ageDog = 4;


        // Заставляем их мяукать
        myCat.meow();      // Выведет: Барсик говорит: Мяу!
        anotherCat.meow(); // Выведет: Мурзилка говорит: Мяу!
        billyCat.meow();

        richi.guv();

    }
}
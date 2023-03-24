public class Main {
    public static void main(String[] args) {
        var dog=8;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);


        var boxerOne = 78.2;
        System.out.println("Вес первого боксера " + boxerOne + " кг");

        var boxerTwo = 82.7;
        System.out.println("Вес второго боксера " + boxerTwo + " кг");

        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");

        var differenceWeight = boxerOne - boxerTwo;
        System.out.println("Разница в весе " + differenceWeight + " кг");

        var moreWeight = boxerTwo - boxerOne;
        System.out.println("Второй боксер тяжелее на " + moreWeight + " кг");

        var difWeight = boxerTwo % boxerOne;
        System.out.println("Разница в весе боксеров " + difWeight + " кг");

        var hoursWork = 640;
        var worker = hoursWork/8;
        System.out.println("Всего сотрудников в компании " + worker + " человек");

        var newWorker = worker + 94;
        var newHours = hoursWork*8;
        System.out.println("Если в компании работает " + newWorker + " человека, то всего " + newHours + " часов работы может быть поделено между сотрудниками");
    }
}

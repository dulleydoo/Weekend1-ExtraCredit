package demo;

public class AnimalFarm {
    public static void main(String[] args) {

        //data type nameOfMyReferenceVariable
        Dog bingo = new Dog("bingo");

        Dog catty = new Dog("catty");
        Cat pimp = new Cat("dullz", true);

        System.out.println(bingo.name);
        System.out.println(catty.name);
        System.out.println(pimp.name);
        bingo.bark();
        catty.bark();

        //invoke or call the method on the object
        //.methodname();
        pimp.meow();

    }
}


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Duck();


//        Cat cat1 = new Cat();
//        Dog dog1 = new Dog();
//        Duck duck1 = new Duck();
//        cat1.say();
//        dog1.say();
//        duck1.say();
//
//        duck1.fly();

        for(Animal animal: animals) {
            animal.say();
        }
        for(Animal animal: animals) {
            if (animal instanceof Flaing)
                ((Flaing)animal).fly();
        }
    }
}
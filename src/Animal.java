public abstract class Animal {
    public String name;
    public int age;
    public int weight;
    public String color;

      public void go() {
        System.out.println("Я иду");
    }
    public void drink() {
        System.out.println("Я пью");
    };
    public  void eat() {
        System.out.println("Я ем");
    }

    public abstract void say();

}


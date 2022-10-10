class RuntimePolymorphism
{
    public static void main(String args[])
    {
        Animal r1=new Animal();
        Dog r2=new Dog();
        Animal r3=new Cat();
        r1.show();
        r2.show();
        r3.show();

    };
};
class Animal
{
    void show()
    {
        System.out.println("Animal");

    }
};
class Dog extends Animal
{
    void show()
    {
        System.out.println("Also Animal");

    }
};
class Cat extends Animal
{
    void show()
    {
        System.out.println("Also animal");
    }
};

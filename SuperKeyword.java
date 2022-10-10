//Super keyword
class SuperKeyword
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.color();

    };
};
class Animal
{
    String color="white";

};
class Dog extends Animal
{
    public void color()
    {
    String color="Black";
    System.out.println("Dog class Color::"+color);
    System.out.println("Animal Class Color::"+super.color);
    }
};

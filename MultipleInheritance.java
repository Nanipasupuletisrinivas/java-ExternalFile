//Multiple inheritance
class MultipleInheritance
{
    public static void main(String args[])
    {
        PuppyDog p=new PuppyDog();
        p.dog();
        p.puppy();
        p.dog();

    };
};
class Dog
{
    void dog()
    {
        System.out.println("Dog class");
    }
};
class Puppy extends Dog
{
    void puppy()
    {
        System.out.println("pupy class");
    }
};
class PuppyDog extends Puppy
{
    void puppydog()
    {
        System.out.println("Puppy dog classs");
    }
};

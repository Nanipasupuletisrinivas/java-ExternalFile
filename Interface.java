//Implementing interfaces
class Interface
{
    public static void main(String args[])
    {
    System.out.println("interface demo");
    Normal n=new Normal();
    n.triangle();
    }

};
interface Area
{
    void triangle();
}
class Normal implements Area
{
    public void triangle()
    {
        System.out.println(0.582*5);
    }
};

class AbstactClass
{
    public static void main(String args[])
    {
        Normal n=new Normal();
        n.circle();
        n.rectangle();
    };
};
abstract class FindArea
{
    abstract void circle();
    abstract void rectangle();
}
class Normal extends FindArea
{
    void circle()
    {
        System.out.println(3.14*2*2);
    }
    void rectangle()
    {
        System.out.println(2*4*8);
    }
};



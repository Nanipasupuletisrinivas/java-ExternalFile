class UserDefinedException
{

    public static void  main(String args[])
    {
        System.out.println("uSER dEFINED eXCEPTION cREATION");
        try
        {
            //int a=2/0;
            throw new MineException("Hi");
        }
        catch(MineException e)
        {
            System.out.println(e.toString());
        }

    };
};
class MineException extends Exception
{
    String a;
    MineException(String b)
    {
        this.a=b;
    }
    public String toString()
    {
        return ("Division by zero error"+a);
    }
};

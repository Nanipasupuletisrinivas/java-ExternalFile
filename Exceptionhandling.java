//Exception handling in javva
class Exceptionhandling
{
    public static void main(String args[])
    {
        System.out.println("Program on Exception Handling");
        int d;
        int a=Integer.parseInt(args[0]);
        try
        {
            d=1/a;
            //System.out.println(args[0]);

        }
            catch(ArithmeticException e)
            {
               System.out.println("Exception Caught");
            }
    };

};

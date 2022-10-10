class throw
{
    static void fun()
    {
        try
        {
            throw new NullPointerException ();
        }
        catch(Exception e)
        {
            System.out.println("Inside function");
            throw e;
        }
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("caught in main");

        }
    }

    };


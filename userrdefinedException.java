class userrdefinedException
{
    public static void main(String args[])
    {
        try
        {
            throw new MineException();
        }
        catch(MineException e)
        {
            System.out.println(e.toString());
        }

    }
};
class MineException extends Exception
{
    MineException()
    {
        System.out.println("Constructor");
    }
    public String toString()
    {
        return("This is Caughted Exception");
    }
};

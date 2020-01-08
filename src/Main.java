import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {
        ArrayList<String> alist = new ArrayList<String>(20);
        for(int i = 0; i<20; i++)
        {
            alist.add("Bye Bye");
        }
        alist.set(5,"Go");
        System.out.println(alist.get(5));




    }
}

package JavaOopsPrograms.mypack.MYPACK;
public class Balance 
{
    String name;
    double bal;
    public Balance(String s, double b)
    {
        name =s;
        bal=b;
    }
    public void show()
    {
       if(bal<0)
       {
        System.out.println("Adarsh You have low balance");
       }
       else{
        System.out.println("Your Name: "+name);
        System.out.println("Bal = "+bal);
       }
    }
}  

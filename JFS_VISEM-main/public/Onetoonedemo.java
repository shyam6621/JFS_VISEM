import java.util.*;
class Passport
{
    int passportNO;
    String nationality;
    Passport(int passportNO, String nationality)
    {
        this.passportNO = passportNO;
        this.nationality = nationality;

    }
}
class Person
{
    int id;
    String name;
    Passport pass;
    Person(int id, String name, Passport p)
    {
        this.id = id;
        this.name = name;
        this.pass = p;
        
    }
}
class Onetoonedemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Passport p;
        Person m[];
        int n;
        n=3;
        m = new Person[n];
        for(int i=0; i<n; i++)
        {
            p = new Passport(987654, "Indian");
            System.out.println("Enter id of person: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of persion: ");
            String name = sc.nextLine();
            m[i] = new Person(id, name, p);
        }

    }
}
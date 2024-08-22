import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        City [] arr;
        arr = new City[5];

        for(int i=0; i<5; i++)
        {
            System.out.println("Enter city "+ (i+1) + "name and its Polulation");
            String city = sc.next();
            int popu = sc.nextInt();
            arr[i] = new City(city,popu);

        }
        for(int i=0; i<5; i++)
        {
            arr[i].display();

        }

    }

}
class City{
    public String name;
    public int population;

    City(String name, int population){
        this.name= name;
        this.population=population;
    }

    public void display()
    {
        System.out.println("City: " + name + " :: " + "Population: " + population);
        System.out.println();
    }

}
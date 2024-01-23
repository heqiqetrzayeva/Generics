package Entities;

public class Book {
    private int Id;
    private static int id;
    public String name;
    public String author;
    public String language;
    public double price;
    public int count;
    public Book(){
        id++;
        Id=id;
    }
    public Book(String Name,String Author,String Language,double Price,int Count){
        id++;
        Id=id;
        name=Name;
        author=Author;
        language=Language;
        price=Price;
        count=Count;
    }
    public int getId(){

        return this.Id;
    }
    public void fullInfo(){
        System.out.println("Id: " + Id );
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Price: "+ price);
        System.out.println("Count: "+ count);
        System.out.println("\n");
    }
}

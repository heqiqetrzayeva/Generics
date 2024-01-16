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
        name=Name;
        author=Author;
        language=Language;
        price=Price;
        count=Count;
    }
    public int getId(){
        return Id;
    }
    public void fullInfo(){
        System.out.println(name+" "+author+" "+language+" "+price+" "+count);
    }



}

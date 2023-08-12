package Day4;

public class Book {
    private String name;
    private String author;
    private int count;

    public Book(String name,String author,int count){
        this.name=name;
        this.author=author;
        this.count=count;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor(){
        return author;
    }

    public void setCount(int count){
        this.count=count;
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString(){
        return "name:"+name+"\nauthor:"+author+"\ncount:"+count;
    }
}

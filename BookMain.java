class Book{

String title;
String author;
int price;
public Book(){
	title = "dsafg";
	author = "ddvdff";
	price = 203;
}
public Book(String title,String author,int price){
	title = title;
	author = author;
	price = price;

}

void display(){
System.out.println("title:"+title+",author:"+author+",price:"+price);
}
}
public class BookMain{
   public static void main(String[] args){

	Book obj1 = new Book();
	Book obj2 = new Book("adssg","Sdfv",305);
	obj1.display();
	obj2.display();

}

}
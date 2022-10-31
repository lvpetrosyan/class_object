import java.util.Arrays;

public class Main {
    static Books [] books = new Books[5];
    public static void main(String[] args) {
        Book infobook1 = new Book("1984", 1930);
        Author infoAuthor1 = new Author("Arthur", "Blair");
        System.out.println(infoAuthor1.getLastName() + " " + infoAuthor1.getName() + " " + infobook1.getYearPublication() + " " + infobook1.getNameBook());
        Book infoBook2 = new Book("Voyna i mir", 1873);
        Author infoAuthor2 = new Author("Lev", "Tolstoy");
        System.out.println(infoAuthor2.getLastName() + " " + infoAuthor2.getName() + " " + infoBook2.getYearPublication() + " " + infoBook2.getNameBook());
        infobook1.setYearPublication(1965);
        System.out.println(infobook1.getYearPublication()+" год");

        System.out.println("Средний уровень, задание 2");
    books[0]=new Books("Stiven King","The Stand","1978");
    System.out.println(books[0].getAuthor()+": "+ books[0].getName()+": "+ books[0].getPublication());
    //Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”

        }

        }



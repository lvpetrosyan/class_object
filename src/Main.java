import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Author oruall=new Author("George","Orwell");
        Book infobook1 = new Book("1984",oruall, 1894);
        Author infoAuthor1 = new Author("Arthur", "Blair");
        System.out.println(infoAuthor1.getLastName() + " " + infoAuthor1.getName() + " " + infobook1.getYearPublication() + " " + infobook1.getNameBook());
        Author tolstoy= new Author("Lev","Tolstoy");
        Book infoBook2 = new Book("Voyna i mir", tolstoy,1873);
        Author infoAuthor2 = new Author("Lev", "Tolstoy");
        System.out.println(oruall.getName()+" "+ oruall.getLastName() +" " + infoBook2.getYearPublication() + " " + infoBook2.getNameBook());
        infobook1.setYearPublication(1965);
        System.out.println(infobook1.getYearPublication()+" год");
        System.out.println(new Book("скотный двор",oruall,1899));
        System.out.println(infobook1.equals(infoBook2));



        }

        }



public class Main {
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
        Book [] allBooks= new Book[1];
        Author [] allAuthore= new Author[1];
        allBooks[0]= new Book("zelenaya milya",1999);
        allAuthore[0]=new Author("Stiven","King");
        System.out.println(allAuthore[0]+":"+allBooks[0]);
        //В методе main создан массив и заполнен созданными ранее объектами.
        //Методы объявлены корректно.
        //Методы корректно справляются со своей задачей.

    }
}
package solidWithDesignPattern;

public class ResourceTest {
    public static void main(String[] args){

        Student student1 = new Student("Ronan D. Soriano");

        Book book1 = new Book("How to Train your Dragon.");
        student1.borrowResource(book1);

        System.out.println();

        Journal journal1 = new Journal("Me Against The World.");
        student1.borrowResource(journal1);

        System.out.println("\n");

        Student student2 = new Student("Maria Nicolette Vergara");
        Book book2 = new Book("A Guide to the Good Life: The Ancient Art of Stoic Joy.");
        student2.borrowResource(book2);

        System.out.println();

        Journal journal2 = new Journal("How I Become Rich at 21 years old.");
        student2.borrowResource(journal2);

    }
}

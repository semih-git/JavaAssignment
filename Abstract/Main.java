package Abstract;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //SOLID
        //Single Responsibility.
        //open-closed.
        //liskov substition.
        //interface segregation.
        //dependency inversion (NOT INJECTION)
        ArrayList<IReadable> books = new ArrayList<>();

        MathBook mathBook = new MathBook();
        books.add(mathBook);

        PhyBook phyBook = new PhyBook();
        books.add(phyBook);

        SocBook socBook = new SocBook();
        books.add(socBook);

        for (IReadable book: books)
            System.out.println(book.read());

        ArrayList<Writeable> notebooks = new ArrayList<>();
        HistoryNB historyNB = new HistoryNB();
        notebooks.add(historyNB);
        GeographyNB geographyNB = new GeographyNB();
        notebooks.add(geographyNB);
        ChemNB chemNB = new ChemNB();
        notebooks.add(chemNB);

        for (Writeable notebook: notebooks)
            System.out.println(notebook.write());


    }

}

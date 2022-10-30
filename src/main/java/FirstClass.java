public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(500, 1000  ,2020);
        Notebook heavyNotebook = new Notebook(2000, 1600, 2022);
        Notebook oldNotebook = new Notebook(1600, 500, 2011);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " kg" + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}
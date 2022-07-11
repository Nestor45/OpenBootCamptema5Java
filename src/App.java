public class App {
    public static void main(String[] args) throws Exception {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());
        cocheCRUD.save(new Coche());
        
        System.out.println("Hello, World!");
    }
}

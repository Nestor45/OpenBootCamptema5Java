import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Guardado");
        System.out.println("Dentro de save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Mostrando datos");
        System.out.println("Dentro de findAll");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Eliminado");
        System.out.println("Dentro de Delete");
    }

}

package dao;

import org.springframework.stereotype.Repository;

@Repository("daoDB")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version de la base de donne");
        double temp = 25;
        return temp;
    }
}

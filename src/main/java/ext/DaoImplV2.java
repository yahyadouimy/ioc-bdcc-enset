package ext;

import dao.IDao;
import org.springframework.stereotype.Component;


@Component("daoWeb")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double t = 10;
        return t;
    }
}

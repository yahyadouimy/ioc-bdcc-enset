package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    private IDao dao;
    public MetierImpl(@Qualifier("daoWeb") IDao dao){
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }

}

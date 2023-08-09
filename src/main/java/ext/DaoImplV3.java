package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("v3")
public class DaoImplV3 implements IDao {
    @Override
    public double getData() {
        System.out.println("VERSION CAPTEUR");
        double data = 88;
        return data;
    }
}

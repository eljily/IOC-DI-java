package ext;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSOutput;

public class DaoimplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Vsion Web SErvices");
        double data = 5 ;
        return data;
    }
}

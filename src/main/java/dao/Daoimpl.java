package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class Daoimpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de donnes ");
        double data = 10;
        return data;
    }
}

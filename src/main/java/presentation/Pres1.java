package presentation;

import ext.DaoimplV2;
import dao.IDao;
import metier.MetierImpl;

import java.util.HashMap;

public class Pres1 {
    public static void main(String[] args) {
        IDao dao = new DaoimplV2();//instanciation Statique :couplage fort
        MetierImpl metier =new MetierImpl(dao);//injection via le constructeur
        //metier.setDao(dao);//Injection des dependances
        System.out.println(metier.calcul());
    }
}

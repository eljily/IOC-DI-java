package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        //IDao dao = new DaoimplV2();//instanciation Statique :couplage fort
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassNAme=scanner.nextLine();
        System.out.println(daoClassNAme);
        Class<?> cDao = Class.forName(daoClassNAme);
        IDao dao =(IDao) cDao.getConstructor().newInstance();//=>new DaoImpl();
        System.out.println(dao.getData());

        //MetierImpl metier =new MetierImpl();
        String metierClassNAme = scanner.nextLine();
        Class<?> cMetier= Class.forName(metierClassNAme);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //metier.setDao(dao);//Injection des dependances Statique
       // Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier,dao);//injection des dépandances Dynamique

        System.out.println("RES  = "+metier.calcul());


    }
}

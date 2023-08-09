package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresVersionSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","metier");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        // IMetier metier = (IMetier) context.getBean("metier");=>same thing
        System.out.println("result = "+metier.calcul());
    }
}


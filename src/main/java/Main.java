import database.ExampleDAO;
import database.Models.MyObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Peter on 04.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/spring-config.xml");
        ExampleDAO dao = ctx.getBean("dao", ExampleDAO.class);
        dao.add("helloWorld"+System.currentTimeMillis()%1000);
        final List<MyObject> list = dao.get();
        if(list != null)
            list.forEach(System.out::println);
    }
}

import com.liuhao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2021/8/2
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user3");
        User user = (User) context.getBean("user");
        user.show();
    }
}
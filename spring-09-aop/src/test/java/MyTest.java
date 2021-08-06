import com.liuhao.service.UserService;
import com.liuhao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2021/8/4
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：动态代理所代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}

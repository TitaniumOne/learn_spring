import com.liuhao.dao.UserDao;
import com.liuhao.dao.UserDaoMysqlImpl;
import com.liuhao.dao.UserDaoOracleImpl;
import com.liuhao.service.UserService;
import com.liuhao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2021/8/2
 */
public class MyTest {
    public static void main(String[] args) {

        //手动控制反转
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserDaoMysqlImpl());
        service.getUser();

        service.setUserDao(new UserDaoOracleImpl());
        service.getUser();

        //Spring控制反转
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}

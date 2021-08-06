import com.liuhao.config.liuhaoConfig;
import com.liuhao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2021/8/3
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用配置类做，只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(liuhaoConfig.class);
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("getUser", User.class);
        System.out.println(user.getName());
        System.out.println(user2.getName());

    }

}

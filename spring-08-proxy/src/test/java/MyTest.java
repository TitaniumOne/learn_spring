import com.liuhao.demo01.Host;
import com.liuhao.demo01.Proxy;
import org.junit.Test;

import javax.swing.plaf.SpinnerUI;

/**
 * Created by Administrator on 2021/8/3
 */
public class MyTest {
    public static void main(String[] args) {
        Host host = new Host();
        //代理帮房东租房，中介一般会有附属操作
        Proxy proxy = new Proxy(host);
        //不直接找房东，直接找中介租房
        proxy.rent();
    }
}

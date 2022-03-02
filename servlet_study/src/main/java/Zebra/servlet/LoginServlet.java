package Zebra.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/2
 * Time: 17:14
 * Description: No Description
 */

//注解的使用：小括号包括对个属性，属性名=属性值，多个之间逗号间隔，属性名为value时可以缺省
//Servlet定义服务：注意服务路径必须是/开始，否则tomcat启动就会报错

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    /**
     * 每次http请求映射到某个Servlet的资源路径，都会调用service生命周期方法
     * 如果请求方法没有重写，就调用父类的doXXX（对应请求方法），返回405
     * 如果重写，会将请求数据包装为一个Request请求对象，这时候虽然还没有响应，但是也
     * 包装了一个Response响应对象
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

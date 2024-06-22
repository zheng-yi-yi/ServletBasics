package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends GenericServlet{
    @Override
    public void init() throws ServletException{
        super.init();
        log("方法init()完成初始化工作，仅执行一次！");
    }

    @Override
    public void service(ServletRequest servletRequest,ServletResponse servletResponse) throws IOException{
        servletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("请查看IDEA的Tomcat运行控制台输出...<br>");
        writer.println("1、生命周期方法inint()仅执行一次<br>");
        writer.println("2、生命周期方法service()可以被多次请求——按F5刷新浏览器测试<br>");
        writer.println("3、生命周期方法destroy()测试——停止Tomcat");
        log("调用业务方法service()。");
    }

    @Override
    public void destroy(){
        super.destroy();
        log("方法destroy()在Servlet销毁时自动执行--停止Tomcat");
    }
}



package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        prepareResponse(resp);
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("Hello，Servlet<br/>" );
        printWriter.println("现在时刻:"+new Date()+"<br/>");
        HttpSession session=req.getSession();
        resp.getWriter().println("在Web服务器端创建了一个会话对象："+session.hashCode());
        log("服务方法调用完毕！");
    }
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
        doPost(req,resp);
    }

    private void prepareResponse(HttpServletResponse resp) {
        //设置响应字符的编码，避免页面出现中文乱码
        resp.setContentType("text/html;charset=UTF-8");
    }
}


package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 本程序只能统计新用户上线人数。
 * 完备的在线人数统计，需要考虑用户下线（注销或关闭浏览器），这需要使用Servlet监听器。
 */
@WebServlet("/OnlineCountServlet")
public class OnlineCountServlet extends HttpServlet {
    private static final String COUNT_KEY = "onlineCount";

    @Override
    public void init() {
        // 初始化在线人数为1
        this.getServletContext().setAttribute(COUNT_KEY, 1);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 检查会话是否是新的
        if (req.getSession().isNew()) {
            log("有新用户上线！");
            // 新会话，增加在线人数
            int count = (Integer) this.getServletContext().getAttribute(COUNT_KEY);
            this.getServletContext().setAttribute(COUNT_KEY, ++count);
        }

        // 向客户端输出当前在线人数
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("当前在线人数: " + this.getServletContext().getAttribute(COUNT_KEY));
        log("当前在线人数: " + this.getServletContext().getAttribute(COUNT_KEY));
    }

    @Override
    public void destroy() {
        // 这里可以执行一些资源释放操作，但对于在线人数统计来说，可能不需要特别的操作
    }
}
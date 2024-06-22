package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TriangleAreaServlet")
public class TriangleAreaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户输入的三边长度
        double a = Double.parseDouble(request.getParameter("sideA"));
        double b = Double.parseDouble(request.getParameter("sideB"));
        double c = Double.parseDouble(request.getParameter("sideC"));

        // 检查输入的边长是否能构成三角形
        if (a + b <= c || a + c <= b || b + c <= a) {
            // 如果不能构成三角形，返回错误信息
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>错误</title></head>");
            out.println("<body>");
            out.println("<h2>输入的边长不能构成三角形</h2>");
            out.println("</body>");
            out.println("</html>");
        } else {
            // 计算半周长
            double s = (a + b + c) / 2;

            // 使用海伦公式计算面积
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // 设置响应内容类型
            response.setContentType("text/html;charset=UTF-8");

            // 发送响应到客户端
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>三角形面积计算结果</title></head>");
            out.println("<body>");
            out.println("<h2>三角形的面积是: " + area + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
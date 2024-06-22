<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>Servlet 基础知识要点</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            font-size: 16px;
            margin: 20px;
        }

        details {
            margin-top: 10px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        summary {
            font-weight: bold;
            margin: -10px;
            padding: 10px;
            cursor: pointer;
            border-radius: 5px;
            background-color: #e9ecef;
        }

        p {
            margin: 10px 0;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Servlet 基础知识要点</h2>
    <hr/>
    <details>
        <summary>Servlet 项目创建及运行 <a href="HelloServlet">浏览</a></summary>
        <p>Servlet 基于 <code>javax.servlet.http.HttpServlet</code> 类，需重写 <code>doPost()</code> 和 <code>doGet()</code>
            方法。</p>
        <p>使用 <code>@WebServlet</code> 注解或 <code>web.xml</code> 配置 Servlet，前者更推荐。</p>
        <p><code>doPost()</code> 和 <code>doGet()</code> 方法处理请求和响应。</p>
        <p><code>getSession()</code> 方法用于获取 <code>HttpSession</code> 对象，以建立会话信息。</p>
    </details>
    <details>
        <summary>了解 Servlet API 及生命周期 <a href="LifeCycleServlet">浏览</a></summary>
        <p>Servlet API 包括 <code>init()</code>, <code>service()</code>, <code>destroy()</code> 等生命周期方法。</p>
        <p><code>GenericServlet</code> 和 <code>HttpServlet</code> 类提供了这些方法的基本实现。</p>
    </details>
    <details>
        <summary>网站上线人数统计 <a href="OnlineCountServlet">浏览</a></summary>
        <p>Servlet 容器创建全局上下文环境 <code>ServletContext</code>。</p>
        <p>通过 <code>HttpSession</code> 的 <code>isNew()</code> 方法判断新用户，统计在线人数。</p>
    </details>
    <details>
        <summary>计算三角形的面积</summary>
        <br>
        <form action="TriangleAreaServlet" method="post">
            <label for="sideA">边A长度:</label>
            <input type="text" id="sideA" name="sideA"><br>
            <label for="sideB">边B长度:</label>
            <input type="text" id="sideB" name="sideB"><br>
            <label for="sideC">边C长度:</label>
            <input type="text" id="sideC" name="sideC"><br>
            <input type="submit" value="计算面积">
        </form>
    </details>

</body>
</html>
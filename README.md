# Servlet Web Application

## 项目介绍

本项目展示了使用 Java Servlet 技术创建的简易Web应用程序。

项目包含三个主要功能模块：

1. **基本Servlet处理**：展示如何创建和配置Servlet，处理HTTP请求和响应。
2. **Servlet生命周期管理**：展示Servlet的生命周期方法及其调用顺序。
3. **在线人数统计**：通过监听用户会话的创建和销毁，统计在线用户人数。

## 主要知识点

- **Servlet基础**：通过继承`HttpServlet`类并重写`doGet`和`doPost`方法，处理HTTP请求。
- **Servlet配置**：使用`@WebServlet`注解进行Servlet配置。
- **Servlet生命周期**：理解Servlet的`init`、`service`和`destroy`方法的调用顺序。
- **会话管理**：使用`HttpSession`对象管理用户会话。
- **监听器**：使用`ServletContextListener`和`HttpSessionListener`监听应用上下文和会话事件。

## 代码基础结构

```plaintext
src
├── servlet
│   ├── HelloServlet.java
│   ├── LifeCycleServlet.java
│   ├── OnlineCountServlet.java
└── webapp
    ├── index.jsp
    └── WEB-INF
        └── web.xml
```

## 运行指南

1. 在IDEA中导入本项目。
2. 配置Tomcat服务器，确保其运行环境支持Java 8以上。
3. 启动项目，访问以下URL测试各模块功能：
    - 基本Servlet处理: `http://localhost:8080/ServletBasics_war_exploded/HelloServlet`
    - Servlet生命周期管理: `http://localhost:8080/ServletBasics_war_exploded/LifeCycleServlet`
    - 在线人数统计: `http://localhost:8080/ServletBasics_war_exploded/OnlineCountServlet`
4. 查看Tomcat控制台输出，验证各模块功能是否正常。

> `/ServletBasics_war_exploded` 是你的Web应用的名称。通常，这个名称来自于你的WAR文件的名称。`_war_exploded`部分通常表示你正在使用IDE（如IntelliJ IDEA）直接运行项目，而IDE为了方便开发，会将WAR包解压（即“explode”），而不是以压缩形式部署。

## 注意事项

- 若出现中文乱码问题，可将IDEA的VM参数设置为`-Dfile.encoding=UTF-8`。
- 在线人数统计模块仅统计新用户上线人数，更完整的统计需要考虑用户注销或关闭浏览器的情况。

## 贡献

欢迎对本项目提出优化建议或贡献代码。
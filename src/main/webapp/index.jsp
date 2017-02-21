<%@ page import = "hanulhan.jms.broker.*, org.springframework.context.*,
                   org.springframework.web.context.support.*"%>
    
<%@ page contentType="text/html" %>

<%
    ApplicationContext beanFactory;
    ClickCounter counter;
    beanFactory = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
    counter     = (ClickCounter)beanFactory.getBean("clickCounter");
%>

<%
    String clickedButton = request.getParameter("command");
    if (clickedButton != null) { counter.setCount(counter.getCount()+1); }

%>

    <html>
        <body>

            <form action='index.jsp'>
                <input type='submit' name='command' value='ClickToCount!'>
            </form>

            Count: <%= counter.getCount() %>

        </body>
    </html>

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = " /college")
public class collegeServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        System.out.println(name);
        String number = servletRequest.getParameter("number");
        System.out.println(number);

        int num = Integer.parseInt("number");
        String address = servletRequest.getParameter("address");
        System.out.println(address);

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("result.jsp");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("number",number);
        servletRequest.setAttribute("address",address);
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}

package multiplynumbers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class MultiplyNumbers extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Enumeration parameterNames = request.getParameterNames();
        int product = 1;
        while(parameterNames.hasMoreElements()) {
            String value = request.getParameter((String)parameterNames.nextElement());
            product *= Integer.valueOf(value);
        }

        try (PrintWriter out = response.getWriter()) {
//			int a = Integer.valueOf(request.getParameter("a"));
//			int b = Integer.valueOf(request.getParameter("b"));
			response.getWriter().append("Product is " + product);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

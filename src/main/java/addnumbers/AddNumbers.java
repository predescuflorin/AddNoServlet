package addnumbers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbers extends HttpServlet {

	private static final long serialVersionUID = 2376899699873237398L;
	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Enumeration parameterNames = request.getParameterNames();
		int sum = 0;
		while (parameterNames.hasMoreElements()) {
		    String value = request.getParameter((String)parameterNames.nextElement());
		    sum += Integer.parseInt(value);
        }

//		int sum2 = 0;
//		Map<String, String[]> parametersMap = request.getParameterMap();
//		for(String[] strings: parametersMap.values()) {
//		    sum2 += Integer.valueOf(strings[0]);
//        }

		try (PrintWriter out = response.getWriter()) {
//			int a = Integer.valueOf(request.getParameter("a"));
//			int b = Integer.valueOf(request.getParameter("b"));
//			int c = Integer.valueOf(request.getParameter("c"));
//			response.getWriter().append("Result is " + (a + b + c));
            response.getWriter().append("The sum is " + sum + "<br>");
//            response.getWriter().append("The sum2 is " + sum2);
		}
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on
	// the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}

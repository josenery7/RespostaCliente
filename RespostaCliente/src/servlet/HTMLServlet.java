package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HTML")
public class HTMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = null;

		try {
			out = response.getWriter();

			response.setContentType("text/html");
			out.print("<html><body>");
			out.print("<h1>Título da Página</h1>");
			out.print("<strong>Este é um texto em negritos</strong>");
			out.print("</body></html>");

		} finally {
			if(out != null) {
				out.close();
			}
		}
	}

}

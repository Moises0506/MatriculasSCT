package gob.sct.matriculassct.servelts;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DescargaPdfMatriculas
 */
@WebServlet("/DescargaPdfMatriculas")
public class DescargaPdfMatriculas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/pdf");
		response.setHeader("Content-Disosition", "attachment; filename=html.pdf");
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		OutputStream os;
		
		os = new BufferedOutputStream(response.getOutputStream());
		in = new BufferedInputStream(new FileInputStream(getServletContext().getRealPath("/")+"archivos/capitalismo_solidario.pdf"));
		out = new BufferedOutputStream(os);
		byte[] buffer = new byte[1024 * 8];
		int j = -1;
		while ((j = in.read(buffer)) != -1) {
		    out.write(buffer, 0, j);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

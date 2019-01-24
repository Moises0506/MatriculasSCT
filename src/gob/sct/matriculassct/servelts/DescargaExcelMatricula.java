package gob.sct.matriculassct.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DescargaExcelMatricula
 */
@WebServlet("/DescargaExcelMatricula")
public class DescargaExcelMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =  response.getWriter();
		String strNombreCliente = request.getParameter("userChof");
		String strTipoLicencia = request.getParameter("tipoLic");
		String strRfc = request.getParameter("rfcUser");
		
		response.setContentType("application/vnd.ms-excel");							
		response.setHeader("Content-Disosition", "attachment; filename=SolicitudManejo.xlsx");
				
		
		pw.println("<table border>");
		pw.println("	<tr>");		
		pw.println("		<th><b>Nombre</b></th>");
		pw.println("		<th><b>Tipo de Licencia</b></th>");
		pw.println("		<th><b>RFC</b></th>");
		pw.println("	</tr>");
		pw.println("	<tr>");
		pw.println("		<td>"+strNombreCliente+"</td>");
		pw.println("		<td>"+strTipoLicencia+"</td>");
		pw.println("		<td>"+strRfc+"</td>");		
		pw.println("	</tr>");
		pw.println("</table>");
		
		
		pw.close();		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

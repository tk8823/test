package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] luckArray = {"最高", "スッキリ", "最悪"};
		int index = (int) (Math.random()*3);
		String luck = luckArray[index];
 
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M月dd日");
		String today = sdf.format(date);
 
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ポテパンスタイル占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>今日の運勢♪" + today + "の運勢は「" + luck + "」です</p>");
		out.println("</body>");
		out.println("</html>");
	}
}

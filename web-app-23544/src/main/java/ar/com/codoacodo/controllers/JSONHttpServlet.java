package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.stream.Collectors;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class JSONHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 8081441726189855730L;
	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.addHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
		try {
			//enable cors
			Object res  = get(request, response);
			response.getWriter().print(GlobalObjectMapper.getInstance().getObjectMapper().writeValueAsString(res));
			response.setStatus(200);
		} catch (Exception e) {
			response.setStatus(409);
			throw new RuntimeException(e);
		}
	}
	protected abstract Object get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	*/
	public void toJSON(Object obj, HttpServletResponse response) {
		
		try {
			response.getWriter().print(GlobalObjectMapper.getInstance().getObjectMapper().writeValueAsString(obj));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Object fromJSON(Class<?> clazz, HttpServletRequest request,HttpServletResponse response) {
		
		try {
			String jsonBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
			return GlobalObjectMapper.getInstance().getObjectMapper().readValue(jsonBody, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

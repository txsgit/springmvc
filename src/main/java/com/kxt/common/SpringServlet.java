package com.kxt.common;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mysql.jdbc.Driver;

/**
 * Servlet implementation class SpringServlet
 */
public class SpringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpringServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		/*ServletContext context=config.getServletContext();
		ApplicationContext application=WebApplicationContextUtils.getWebApplicationContext(context);
		application.getBean("sds");*/
		//路径是src
		//ApplicationContext application=new FileSystemXmlApplicationContext("applicationContext.xml");
		  
		//获取  WEB-INF/classes/
		//ApplicationContext  application=new ClassPathXmlApplicationContext("applicationContext.xml");
		super.init(config);
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//ApplicationContext application=new FileSystemXmlApplicationContext("applicationContext.xml");
		/*ApplicationContext  application=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		application.getBean("sdsd");
		try {
			Driver d=new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Class classType=Class.forName("com.mysql.jdbc.Driver");
		Method [] methods=classType.getDeclaredMethods();//获取类中所有的方法
		System.out.println(methods);
		for(int i=0; i<methods.length;i++ )
		{
			System.out.println(methods[i]);
		}
	}
	

}

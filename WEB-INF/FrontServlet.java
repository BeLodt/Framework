package etu1803.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import etu1803.framework.Mapping;

public class FrontServlet extends HttpServlet{

    public void ProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter go = response.getWriter();

        String path = request.getContextPath();

        go.print("The link path is : localhost:8080" + path);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.ProcessRequest(request, response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.ProcessRequest(request, response);
    }

    HashMap<String, Mapping> MappingURLs; 
    
}

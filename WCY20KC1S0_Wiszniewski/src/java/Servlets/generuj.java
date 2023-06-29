/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webservice.SOAP_Service;

/**
 *
 * @author student
 */
public class generuj extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WCY20KC1S0_Wiszniewski/SOAP.wsdl")
    private SOAP_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<head><title>Wygenerowane</title>");
            out.println("<link rel=\"stylesheet\" href=\"CSS\\main.css\"></head>");
            String hash = generuj(request.getParameter("hash"));
            out.println("<div id=\"wygenerowano\"><span style=\"font-size: 1.5rem\"> Twój Base64: " + hash + "</span><br/><br/>");
            out.println("<form action=\"wstaw\" method=\"POST\">");
            out.println("<input type=\"hidden\" name=\"autor\" value=\"" + request.getParameter("autor") + "\">");
            out.println("<input type=\"hidden\" name=\"hash\" value=\"" + hash + "\">");
            out.println("<input style=\"font-size: 1.5rem\" type=\"submit\" name=\"act\" value=\"Wstaw\">");
            out.println("<input style=\"font-size: 1.5rem\" type=\"submit\" name=\"act\" value=\"Powrót\">");
            out.println("</form></div>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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

    private String generuj(java.lang.String tekst) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.SOAP port = service.getSOAPPort();
        return port.generuj(tekst);
    }

}

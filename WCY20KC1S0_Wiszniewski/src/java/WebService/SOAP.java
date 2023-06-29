/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import DB.DBConnect;
import Hibernate.base64Query;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author student
 */
@WebService(serviceName = "SOAP")
public class SOAP {

    @EJB
    private DBConnect dBConnect;

    Connection con = DBConnect.connect();

    @WebMethod(operationName = "wyswietl")
    public String wyswietl(){           
        base64Query temp = new base64Query();
        return temp.wyswietl();
    }
    
    @WebMethod(operationName = "wstaw")
    public void wstaw(@WebParam(name = "autor") String autor, @WebParam(name = "hash") String text){
         base64Query temp = new base64Query();
         temp.wstaw(autor, text);
    }
    
    @WebMethod(operationName = "usun")
    public void usun(@WebParam(name = "id") String id){
        base64Query temp = new base64Query();
        temp.usun(Integer.valueOf(id));
    }
    
    @WebMethod(operationName = "generuj")
    public String generuj(@WebParam(name = "tekst") String text){
        base64Query temp = new base64Query();
        return temp.generuj(text);
    }
    
    @WebMethod(operationName = "pobierz")
    public void pobierz(@WebParam(name = "id") String id) throws IOException{
        String filename;
        try{
            String ps = "SELECT * FROM WCY20KC1S0_Wiszniewski WHERE id = " + id;
            PreparedStatement pst = con.prepareStatement(ps);
            ResultSet rs = pst.executeQuery();
	    if (rs.next()) {
                String autor = rs.getString("autor"); 
                String hash = rs.getString("hash"); 

                String desktopPath = System.getProperty("user.home") + "/Desktop/";
                BufferedWriter writer = new BufferedWriter(new FileWriter(desktopPath + autor + ".txt"));
                
                writer.write("Autor: " + autor);
                writer.newLine();
                writer.write("Base64: " + hash);
                writer.newLine();
                writer.close();             
            }
        }catch (SQLException e){}
    }
    
}

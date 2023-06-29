/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Base64;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author student
 */
public class base64Query {
    
    Session session = null;
    private List<Wcy20kc1s0Wiszniewski> base64List = null;
    private Query q = null;  
    
    public String generuj(String text) {

        byte[] textBytes = text.getBytes();


        byte[] base64Bytes = Base64.getEncoder().encode(textBytes);


        String base64Text = new String(base64Bytes);

        return base64Text;
    }
    
    public void wstaw(String autor, String text){
        
        int id = 0;
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        q = session.createQuery("from Wcy20kc1s0Wiszniewski");
        base64List = (List<Wcy20kc1s0Wiszniewski>) q.list();
        
        for (Wcy20kc1s0Wiszniewski base64 : base64List){
            id = base64.getId();
        }
        
        if(id == 0){
            id = 1;
        }else{
            id += 1;
        }
        
        Wcy20kc1s0Wiszniewski newbase64 = new Wcy20kc1s0Wiszniewski();
        newbase64.setId(id);
        newbase64.setAutor(autor);
        newbase64.setHash(text);
        
        session.save(newbase64);
        tx.commit();
              
    }
    
    public String wyswietl(){
        
        String wiersz,temp,temp2;
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        q = session.createQuery("from Wcy20kc1s0Wiszniewski");
        base64List = (List<Wcy20kc1s0Wiszniewski>) q.list();
        session.close();
        tx.commit();
        
        wiersz = ("<table><tr>");
        wiersz = wiersz.concat("<th>ID</th><th>Autor</th><th>Base64</th><th>Akcja</th>");    
        wiersz = wiersz.concat("</tr>");
                
        for (Wcy20kc1s0Wiszniewski base64 : base64List){
            wiersz = wiersz.concat("<tr>");
            wiersz = wiersz.concat("<td>" + base64.getId() + "</td>");
            wiersz = wiersz.concat("<td>" + base64.getAutor() + "</td>");
            wiersz = wiersz.concat("<td>" + base64.getHash() + "</td>");
            temp = "usun?id=" + base64.getId();
            temp2 = "pobierz?id=" + base64.getId();
            wiersz = wiersz.concat("<td><a href="+temp2+"><input style=\"font-size: 1.5rem\" type=\"button\" value=\"Pobierz\" /></a><a style=\"margin-left: 20px\" href="+temp+"><input style=\"font-size: 1.5rem\" type=\"button\" value=\"Usuń\" /></a></td>");
            wiersz = wiersz.concat("</tr>");        
        }        
        
        wiersz = wiersz.concat("</table>");
        
        return wiersz;    
    }
    
    public void usun(int id){
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        q = session.createQuery("delete from Wcy20kc1s0Wiszniewski where id = :id");
        q.setParameter("id", id);
        q.executeUpdate();
        
        session.close();
        tx.commit(); 
    }
    
    
    public base64Query(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
}

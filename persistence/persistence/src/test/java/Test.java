
import mx.appsw.persistencia.dao.UsuarioDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kitto
 */
public class Test {
    public static void main(String[] args) {
        UsuarioDAO dao=new UsuarioDAO();
        
        System.out.println(""+dao.findAll().size());
    }
}

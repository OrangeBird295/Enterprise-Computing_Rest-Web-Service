/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientrest;

import java.io.StringReader;
import java.util.Scanner;
import javax.xml.bind.JAXB;
import util.ClientRestcircle;

/**
 *
 * @author ec
 */

public class ClientRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ClientRestcircle obj = new ClientRestcircle();
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter radius => ");
         String radius = sc.next();
         String xml = obj.getXml(radius);
         //System.out.println(xml);
         String string = (String) JAXB.unmarshal(new StringReader(xml), String.class);
         System.out.println(string);
    }
    
}

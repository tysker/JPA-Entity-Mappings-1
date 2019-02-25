/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.Persistence;

/**
 *
 * @author oerte
 */
public class SchemaBuilder {
    
    /*
    You can recreate your database whenever you like, by running this method. But just using your Entity-classes,  will also create the database if Create or Drop and Create was chosen.
    Persistence.generateSchema("NAME_OF YOUR_PU", null);
     */
    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);

    }

    
}

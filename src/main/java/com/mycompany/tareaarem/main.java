/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareaarem;
import static spark.Spark.*;
import spark.*;
/**
 *
 * @author 2103021
 */

public class main {
    public static void main(String[] args){
        get("welcome",new Route(){
            @Override
            public Object handle(Request rqst, Response rspns) throws Exception {
                String number = rqst.queryParams("number");
                return "El cuadrado del numero es: "+Math.pow(Double.parseDouble(number),2);
            }
            
        });
        
    }
}

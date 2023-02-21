/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.zam.principal;

import com.zam.interfaces.Login;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    
    public static void main(String[] args) {
       
        // Cargar la configuración de Log4j
        PropertyConfigurator.configure("src/main/resources/log4j.properties");

        // Usar el logger de Log4j
        LOGGER.debug("Este es un mensaje de depuración.");
        LOGGER.info("Este es un mensaje informativo.");
        LOGGER.warn("Este es un mensaje de advertencia.");
        LOGGER.error("Este es un mensaje de error.");
        LOGGER.fatal("Este es un mensaje fatal.");
   
        Login inicio = new Login();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        
    }
}

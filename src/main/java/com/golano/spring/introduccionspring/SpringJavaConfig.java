/*
 * Implementación de la clase de Configuración para el ejercicio de Autowiring
 * http://acodigo.blogspot.com/2017/03/spring-inyeccion-automatica-con.html
 */
package com.golano.spring.introduccionspring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 18/04/2019
 * @author gaolanot
 */
@Configuration
public class SpringJavaConfig {
    @Bean 
    public EmpleadoDao empleadoDao(){
        return new EmpleadoDaoImpl();
    }
    
    @Bean(autowire = Autowire.BY_TYPE)
    public EmpleadoService empleadoService(){
        return new EmpleadoServiceImpl();
    }
}

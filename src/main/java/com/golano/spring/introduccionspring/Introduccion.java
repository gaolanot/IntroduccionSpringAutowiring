/*
 * Implementación de la clase Introducción para el ejercicio de Autowiring
 * Creación del contenedor y ejecución del ejemplo
 * http://acodigo.blogspot.com/2017/03/spring-inyeccion-automatica-con.html
 */
package com.golano.spring.introduccionspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 19/04/2019
 * @author gaolanot
 */
public class Introduccion {

    public static void main(String[] args) {
        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringJavaConfig.class);
        for (String beanName : ctx.getBeanDefinitionNames()){
            System.out.println(":: " + beanName);
        }
        EmpleadoService empleadoService = 
                ctx.getBean("empleadoService",EmpleadoService.class);
        System.out.println("EDao: "+((EmpleadoServiceImpl)empleadoService).getEmpleadoDAO());
        System.out.println("EDao: "+ empleadoService);
        ctx.close();
    }
    
}

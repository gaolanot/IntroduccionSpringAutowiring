/*
 * Implementación de la clase EmpleadoService para el ejercicio de Autowiring
 * http://acodigo.blogspot.com/2017/03/spring-inyeccion-automatica-con.html
 */
package com.golano.spring.introduccionspring;

/**
 * 18/04/2019
 * @author gaolanot
 */
public class EmpleadoServiceImpl implements EmpleadoService{
    private EmpleadoDao empleadoDAO;
    //Constructores
    public EmpleadoServiceImpl(){}
    public EmpleadoServiceImpl(EmpleadoDao empleadoDAO){
        this.empleadoDAO = empleadoDAO;
    }
    //Getters and Setters
    public EmpleadoDao getEmpleadoDAO() {
        return empleadoDAO;
    }
    public void setEmpleadoDAO(EmpleadoDao empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }
    
}

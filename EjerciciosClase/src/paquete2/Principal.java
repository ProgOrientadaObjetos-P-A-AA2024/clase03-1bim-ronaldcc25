/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        // System.out.printf("%s     ", i1.);
        String nombre = "La salle";
        String tipoInstitucion = "Privada";
        int numeroAlumnos = 3254;
        int numeroDocentes = 259;
        int numeroSedes = 1;
        
        i1.establecerNombre(nombre);
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);
        
        System.out.printf("Nombre de Institucion Educativa: %s\n"
                + "Tipo Institucion: %s\nNumero de Alumnos: %d\nNumero de "
                + "Docentes: %d\nNumero de sedes: %d\n",i1.obtenerNombre(), 
                i1.obtenerTipoInstitucion(),i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(),i1.obtenerNumeroSedes());
    }
}

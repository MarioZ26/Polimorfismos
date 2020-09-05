/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

/**
 *
 * @author marit
 */
public class Gallina extends Animal {
    private String accion;

    public Gallina(String accion,String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.accion = accion;

    }

     public Gallina(String accion, String nombre) {
        super(nombre);
        this.accion = accion;
    }

    public Gallina(String accion) {
        this.accion = accion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
   
    
    public void mostrar (){
        System.out.println(getNombre()+" - "+getTipo_alimentacion()+" - "+getEdad()+" - "+getAccion());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de cemillas");
    }

    @Override
    public void correr() {
        System.out.println("Corro con mis dos patas");
    }

}

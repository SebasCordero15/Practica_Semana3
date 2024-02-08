/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticaherencia;

/**
 *
 * @author Diego
 */
public class Gusano extends Invertebrado{
    private String dieta;
    private String especie;

    public Gusano() {
        this.dieta = " ";
        this.especie = " ";
    }

    public Gusano(int edad, String nombre, String claseIV, String dieta, String especie) {
        super(edad, nombre, claseIV);
        this.dieta = dieta;
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
     public String toString(){
        return super.toString()
                +"\nEspecie: "+this.getEspecie()
                +"\nDieta: "+this.getDieta();
    }
}

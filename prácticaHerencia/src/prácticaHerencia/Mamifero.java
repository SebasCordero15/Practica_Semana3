/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticaHerencia;

/**
 *
 * @author Diego
 */
public class Mamifero extends Vertebrado{
    private String dieta;
    private String especie;

    public Mamifero() {
        this.dieta = "";
        this.especie = "";
    }

    public Mamifero(int edad, String nombre, String claseV, String dieta, String especie) {
        super(edad, nombre, claseV);
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

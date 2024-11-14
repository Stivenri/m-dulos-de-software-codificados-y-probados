
package Entidad;

public class Persona {
    int id;
    String nom;
    String correo;
    String nacio;
    
    public Persona() {
    }

    public Persona(int id, String nom, String correo, String nacio) {
        this.id = id;
        this.nom = nom;
        this.correo = correo;
        this.nacio = nacio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }
  
        
}

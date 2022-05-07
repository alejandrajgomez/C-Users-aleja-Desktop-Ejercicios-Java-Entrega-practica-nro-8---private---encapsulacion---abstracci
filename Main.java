//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

public class Main{

    public static void main (String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Juan Pablo");
        persona.setTelefono("01154654564");

        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        System.out.println(persona.getEdad());
        
    }

}
class Persona {

    private int edad;
    private String nombre;
    private String telefono;


    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
        }



    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }


}
package facebook;

import java.util.ArrayList;

public class Sistema {
    public String usuario;
    public String contraseña;
    ArrayList<String> personas=new ArrayList<>();
    
    public Sistema(){
        personas.add("aliianampa,080803");
    }
    
    public boolean validar_ingreso(){
        boolean resultado=false;
        
        for (String persona : personas) {
            String [] datos_persona= persona.split(",");
            if (datos_persona[0].compareTo(usuario)==0 && datos_persona[1].compareTo(contraseña)==0){
                resultado=true;
            }
        }
        
        return resultado;
    }
}

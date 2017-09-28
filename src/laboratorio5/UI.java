package laboratorio5;

/**
 *
 * @author kevin
 */

import java.io.*;
import java.util.ArrayList;

public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Manager manager = new Manager();
    
    /**
     * 
     * @param args
     * @throws java.io.IOException 
     */
    public static void main(String[] args)throws java.io.IOException{      
        int option;
        option = -1;
        
        do {
            out.println("<--- Seleccione la tienda --->");
            out.println("1. Agregar categorias");
            out.println("2. Listar categorias");
            out.println("3. Salir");
            option = readOption();
            ejectOption(option);
        } while (option !=4);
    }
    
    /**
     * 
     * @return Selected option
     * @throws IOException 
     */
    static int readOption() throws IOException{
        int option = 0;
        out.println("Ingrese una opción");
        option = Integer.parseInt(in.readLine());
        return option;
    }
    
    static boolean ejectOption(int pOption) throws IOException{
        boolean finish = false;
        
        switch(pOption){
            case 1:
               registerCategory();
             break;
            case 2:
               listCategories();
            break;
            case 3:
               finish = true;
            break;

            default:
                out.println("Opción Inválida");
            break;           
        }
        return finish;
    }
    
    public static void registerCategory() throws IOException
    {
        String identification, name, description;
        boolean resultado;
        
        out.println("Digite la identidicaci\u00f3n de la nueva categoria");
        identification = in.readLine();
        
        out.println("Digite el nombre de la nueva categor\u00eda");
        name = in.readLine();
        
        out.println("Digite una breve descripci\u00f3n de la nueva categoria");
        description = in.readLine();
        
        resultado = Manager.addCaterogy(identification, name, description);
        
        if(resultado == true){
            out.println("¡Registro del video fue exitoso!");
        }else{
            out.println("Ha ocurrido un  error, int\u00e9ntelo desp\u00faes");
        }
    }
    
    public static void listCategories(){
        String [] allCategories;
        allCategories = Manager.getListCaterogies();
        int catSize = allCategories.length;
        
        if(catSize != 0){
            for(int i=0; i < catSize; i++){
                out.println(allCategories[i] + "\n");
                //out.println("El nombre de la tienda de la tienda es: " + listaTiendas.get(i).getNombreTienda() + ", la direccion de la tienda es: " + listaTiendas.get(i).getDireccion());
            }
        }else{
            out.println("Aún no hay tiendas registradas.");
            
        }
    }
}

package laboratorio5;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;

public class Manager {
    private static ArrayList <Category> allCategories = new ArrayList<>();
    
    /**
     * 
     * @return all Categories in memory 
     */
    
    public static String [] getListCaterogies(){
        int size = allCategories.size();
        String [] categories = new String[size];
        
        for (Category tmpCategory:allCategories){
            categories[0] = tmpCategory.toString();
        }
        
        return categories;
    }
    
    
    public static boolean addCaterogy(String pidentification, String pname, String pdescription) 
    {
        boolean validation;
        Category newCategory = new Category(pidentification, pname, pdescription);
        
        if(newCategory != null){
            allCategories.add(newCategory);
            validation = true;
        }else{
             validation = false;
        }
        return validation;
    }
    
    
}

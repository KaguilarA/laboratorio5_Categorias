package laboratorio5;

/**
 *
 * @author kevin
 */
public class Category {

    private String identification, name, description;
    
    public Category()
    {
    }
    
    /**
     * 
     * @param pidentification
     * @param pname
     * @param pdescription 
     */
    public Category (String pidentification, String pname, String pdescription)
    {
        this.name = pname;
        this.identification = pidentification;
        this.description = pdescription;
    }
    
    //GETTERS
    public String getIdentification() {
        return identification;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    
    //SETTERS
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "Categoria{" + "identification=" + identification + ", name=" + name + ", description=" + description + '}';
    }
    
}

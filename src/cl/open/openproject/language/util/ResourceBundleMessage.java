package cl.open.openproject.language.util;

import java.util.ResourceBundle;
import java.util.Locale;

/**
 * @author      : Nelson Guerra A.
 * @since       : JDK 1.5_06
 * version      : 1.0
 * Date         : 04-03-2008
 * Time         : 05:12:48 PM
 * Description  : This class is in charge of change the Locale of the ResourceBundle that it is use
 * for the interface.
 */
public class ResourceBundleMessage {
    //Attributes
    private static final String BASE_NAME="cl.open.openproject.config.application";
    private static ResourceBundleMessage instance = null;

    private ResourceBundle message = null;

    //Begin privates Constructors
    /**
     * @param baseName
     * @param locale
     * Description: First overload of the constructor
     */
    private ResourceBundleMessage(String baseName, Locale locale){
        message = ResourceBundle.getBundle(baseName, locale);
    }

    /**
     * @param baseName
     * Description: Second overload of the constructor
     */
    private ResourceBundleMessage(String baseName){
        message = ResourceBundle.getBundle(baseName);
    }

    /**
     * Description: Thir overload of the constructor
     */
    private ResourceBundleMessage(){
        message = ResourceBundle.getBundle(BASE_NAME);
    }
    // End privates Constructors


    // Begin getIntances methods
    /**
     * @param baseName
     * @param locale
     * @return ResourceBundleMessage instance
     * Description: This is the first implementation of this method
     */
    public static ResourceBundleMessage getInstance(String baseName, Locale locale){
        if (instance == null)
            instance = new ResourceBundleMessage(baseName, locale);

        return instance;
    }

    /**
     * @param baseName
     * @return ResourceBundleMessage instance
     * Description: This is the second implementation of the method
     */
    public static ResourceBundleMessage getInstance(String baseName){
        if (instance == null)
            instance = new ResourceBundleMessage(baseName);

        return instance;
    }

    /**
     * @return ResourceBundleMessage instance
     * Description: This is the third implementation of this method
     */
    public static ResourceBundleMessage getInstance(){
        if (instance == null)
            instance = new ResourceBundleMessage();

        return instance;
    }
    //End Implementation of method getInstance

    //Begin implementation of methods setLocaleResourceBundle
    /**
     * @param base_name
     * @param locale
     * Description: This is the first implementation of the method. The idea of this method is to change
     * the Locale of the class
     */
    public void setLocaleResourceBundle(String base_name, Locale locale){
        //instance = null;
        //this.getInstance(base_name, locale);
        message = null;
        System.gc();
        message = ResourceBundle.getBundle(base_name, locale);
    }

    /**
     * @param locale
     * Description: This is the second implementation of the method.
     */
    public void setLocaleResourceBundle(Locale locale){
        message = null;
        System.gc();
        message = ResourceBundle.getBundle(BASE_NAME, locale);
    }
    //End implementation of methods setLocaleResourceBundle

    //Begin implementation of the methods getMessage
    /**
     * @return ResourceBundle
     */
    public ResourceBundle getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(ResourceBundle message) {
        this.message = message;
    }

    /**
     * @param key
     * @return String
     */
    public String getString(String key){
        return(this.message.getString(key));
    }

    /**
     * @param key
     * @return Object
     */
    public Object getObject(String key){
        return(this.message.getObject(key));
    }


    /*
    public static void main(String[] args){
        ResourceBundleMessage test = ResourceBundleMessage.getInstance();
        String algo = test.getString("errors.cancel");
        System.out.println("Algo:" + algo);
        test.setLocaleResourceBundle(new Locale("en"));
        algo = test.getString("errors.cancel");
        System.out.println("Algo:" + algo);
    }
    */
}

package es.egc;
import org.apache.log4j.*; 

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log=Logger.getLogger(App.class); 

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
	public int suma(int a, int b){
		int result= a+b;
		log.info("Returning "+a+"+"+b+"="+result);
		return result;
	}
}

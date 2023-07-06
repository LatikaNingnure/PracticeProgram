package Sample;

public class designPattern {
	
	    private static final designPattern instance = new designPattern();

	    // private constructor to avoid client applications using the constructor
	    private designPattern(){}

	    public static designPattern getInstance() {
	        return instance;
	    }
}

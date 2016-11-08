
public class MimiTwitter {
	private static MimiTwitter instance = null;
	private MimiTwitter(){
		
	}
	
	public static MimiTwitter getInstance() {
        if (instance == null) {
            synchronized(MimiTwitter.class) {
                if (instance == null) {
                    instance = new MimiTwitter();
                }
            }
        }
        return instance;
    }

}
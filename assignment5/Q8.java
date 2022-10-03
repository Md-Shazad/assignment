package assignment5;

class Resource implements AutoCloseable{
	public Resource() {
		System.out.println("Resource Created");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Resource close method invoked"
				+" Now Since it's auto invoked we can close our"
				+ " resource from this close()");
		
	}
	
}
public class Q8{

	public static void main(String[] args) throws Exception{
		
		Resource source = new Resource();
		
		try(source;){
			System.out.println("perform operations with resource");
			
		}catch(Exception e) {
			//System.out.println("Catch exception here");
		}
	}

}

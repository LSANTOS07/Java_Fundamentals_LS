/**
 * 
 * @author Training Center
 *
 */
public class HelloWorld {
	
	
/** 
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Shirt S = new Shirt();
		int a = 0;
		System.out.println(a);
		// TODO Auto-generated method stub
		if (args.length != 0)
			{System.out.println("Olá Mundo " + args[0]+ " !!!!!");
			
			for ( int i = 0 ; i< args.length; i++)
				/*if (i == args.length-1)
					System.out.print(args[i]);
				else
				System.out.println(args[i]);*/
				
				System.out.print(args[i] + (i == args.length-1 ?"":"\n"));
			}
		
		
		
		else 
			{System.out.println("Olá Mundo !!!!!");}
		
	
	}

}



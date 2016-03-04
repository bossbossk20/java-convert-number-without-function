package cal;
import java.util.*;
public class three {

	public static void main(String[] args) {
		int choice, dec=0  , i=0 ,num = 0;
		int nBi=0,nOc=0,nHex=0;
		int numResultBi=0 , numResultOc=0, numResultHex=0;
		int n =0;
		int [] bit = new int[32];
		String [] b = new String[32];
		String resultBi="" , resultOc="",resultHex="", StResult = "";
		Scanner c = new Scanner(System.in);
		do{
			System.out.println("1 input Decimal Number ");
			System.out.println("2 To Binary Number");
			System.out.println("3 To Octa Number ");
			System.out.println("4 To Hexa Number ");
			System.out.println("5 Exit ");
			System.out.print("Enter choice : ");
			choice = c.nextInt();
			
			switch(choice){
			case 1 : 
				
				System.out.print("Enter number : ");
				dec = c.nextInt();
				nBi = dec;
				nOc = dec;
				nHex = dec;
				break;
			case 2 :
			     do{
			    	 
			    	 numResultBi = nBi % 2;
			    	 nBi = nBi/2;
			    	 resultBi =  numResultBi + resultBi;
			     }while(nBi>0);
			     	System.out.println("Decimal Value : "+dec);
			     	System.out.println("Binary Value : "+resultBi);
			    break;
			case 3 : 
			     do{
			    	 numResultOc = nOc % 8;
			    	 nOc = nOc/8;
			    	 resultOc =  numResultOc + resultOc;
			     }while(nOc>0);
			     	System.out.println("Decimal Value : "+nOc);
			     	System.out.println("Octa Value : "+resultOc);
			    break;
			case 4 :
				do{
					 
			    	 numResultHex = nHex % 16;
			    	 nHex = nHex/16;
			    	 if(numResultHex>9){
			    		 switch(numResultHex){
			    		 case 10 : StResult = "A";
			    		 break;
			    		 case 11 : StResult = "B";
			    		 break;
			    		 case 12 : StResult = "C";
			    		 break;
			    		 case 13 : StResult = "D";
			    		 break;
			    		 case 14 : StResult = "E";
			    		 break;
			    		 case 15 : StResult = "F";
			    		 break;
			    		 }
			    		 resultHex = StResult + resultHex;
			    	 }
			    	 else {
			    		 resultHex =  numResultHex + resultHex;
			    	 }
			     }while(nHex>0);
					System.out.println("Decimal value : "+dec);
			     	System.out.println("Hexa value : "+resultHex);
			    break;
			case 5 : System.out.println("Good Bye");
				break;
				
			}
		}while(choice!=5);
		
	}

}

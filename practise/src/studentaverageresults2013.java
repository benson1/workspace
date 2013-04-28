		import java.util.*;              //jack's program 22/02/2013
	import java.text.NumberFormat;       //imports the scanner API
	import java.awt.*;                   
	import javax.swing.*;                 //imports for scanner


	
	public class studentaverageresults2013 { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        
    
		 NumberFormat fmt1 = NumberFormat.getPercentInstance();
		 
        
            System.out.print("PLEASE SUBMIT THE STUDENT'S FIRST NAME IN UPPER CASE: ");
            String name = input.next();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR WEB TECHNOLOGIES A1 ");
            double webtechaveragemark1 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR WEB TECHNOLOGIES A2 ");
            double webtechaveragemark2 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR web technologies A3 ");
            double webtechaveragemark3 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR PERSONAL DEVELOPMENT PLANNING A1 ");
            double pdpaveragemark1 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR PERSONAL DEVELOPMENT PLANNING A2 ");
            double pdpaveragemark2 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S FIRST NAME IN UPPER CASE: ");
            
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR COMPTUER HARDWARE A1 ");
            double ch1 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR COMPTUER HARDWARE A2 ");
            double ch2 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR SYSTEMS ANALYSIS A1 ");
            double sysa1 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR SYSTEMS ANALYSIS A2 ");
            double sysa2= input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR SYSTEMS ANALYSIS EXAM A3 ");
            double sysa3= input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR CYBER SECURITIES A1 ");
            double csa1 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR CYBER SECURITIES A2 ");
            double csa2 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR APPLICATION OF STUDY SKILLS IN THE WORKPLACE A1 ");
            double aosa1 = input.nextDouble();
            System.out.print("PLEASE SUBMIT THE STUDENT'S SCORE OUT OF 100 FOR APPLICATION OF STUDY SKILLS IN THE WORKPLACE A2 ");
            double aosa2= input.nextDouble();
            
            
            ///////////////////////////////////////////////////
            //												 //
            //												 //
            //		           CALCULATIONS 				 //
            //												 //
            //												 //
            ///////////////////////////////////////////////////
            ///////////////////////////////////////////////////
            ///////////////////////////////////////////////////
            
            
            double wtaverage = ((webtechaveragemark1*0.4)+(webtechaveragemark2*0.5)+(webtechaveragemark3*0.1))/100;
            double pdpaverage = ((pdpaveragemark1+pdpaveragemark2)/2)/100;
            double chaverage = ((ch1+ch2)/2)/100;
            double sysaverage = ((sysa2*0.4)+(sysa2*0.4)+(sysa3*0.2))/100;
            double csaverage = ((csa1+csa2)/2)/100;
            double aosaverage = (((aosa1*0.75)+(aosa2*0.25))/100);
            System.out.println(" "); 
            
            System.out.println(" "); 
        
            
        System.out.println ("\t\t\t"+name+"'s RESULTS: FULL LIST OF AVERAGE RESULTS 2012-2013 FDSC COMPUTING COURSE WITH BATH CITY COLLEGE"); 
        System.out.println ("\t\t\t");  
        System.out.println ("\t\t\tIF YOU WOULD LIKE TO RE-TAKE AN ASSIGNMENT OR EXAM PLEASE CONTACT THE COLLEGE");
        System.out.println ("\t\t\t"); 
        System.out.println ("\t\t\t*************************************************************************************************");   
        System.out.println ("\t\t\t*************************************************************************************************");
        System.out.println ("\t\t\t**** WEB TECHNOLOGIES AVERAGE RESULT **** = \t\t\t"+fmt1.format(wtaverage)+ " *****************************");
        System.out.println ("\t\t\t**** P.D.P AVERAGE RESULT *************** = \t\t\t"+fmt1.format(pdpaverage)+" *****************************");
        System.out.println ("\t\t\t**** COMPUTER HARDWARE AVERAGE RESULT **** = \t\t\t"+fmt1.format(chaverage)+" *****************************");
        System.out.println ("\t\t\t**** SYSTEMS ANALYSIS AVERAGE RESULT **** = \t\t\t"+fmt1.format(sysaverage)+" *****************************");
        System.out.println ("\t\t\t**** CYBER SECURITIES AVERAGE RESULT **** = \t\t\t"+fmt1.format(csaverage)+" *****************************");
        System.out.println ("\t\t\t**** APP OF STUDY SKILLS AVERAGE RESULT **** = \t\t\t"+fmt1.format(aosaverage)+" *****************************") ;
        System.out.println ("\t\t\t*************************************************************************************************");  
        System.out.println ("\t\t\t*************************************************************************************************");
        System.out.println ("\t\t\t*************************************************************************************************");
   
        class Authority
        {
        public void main (String[] args)
           {
              JFrame frame = new JFrame ("Authority");

              frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

              JPanel primary = new JPanel();
              primary.setBackground (Color.yellow);
              primary.setPreferredSize (new Dimension(250, 75));

              JLabel label1 = new JLabel ("Question authority,");
              JLabel label2 = new JLabel ("but raise your hand first.");

              primary.add (label1);
              primary.add (label2);

              frame.getContentPane().add(primary);
              frame.pack();
              frame.setVisible(true);
           }
        }

	}
}

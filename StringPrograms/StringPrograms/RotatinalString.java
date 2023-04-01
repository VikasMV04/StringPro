package StringPrograms;

public class RotatinalString {

	public static void main(String[] args) {
      String orgstr="Vikas";
      String keystr="kasVi";
      String newstr=orgstr.concat(orgstr);
      if(newstr.contains(keystr))
      {
    	  System.out.println("Rotational String");
      }
      else
      {
    	  System.out.println("Not Rotational String");
      }
      
	}

}

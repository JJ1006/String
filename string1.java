public class string1{
    public static void main(String[] args){
       // String name = "Jaahanava Joshi";
       // System.out.println(name);
       // int a = 6;
       // float b = 5.6523f;
       // System.out.printf("The value of a and b is %d and %f\n",a,b);
       // System.out.format("The value of a and b is %d and %f",a,b);
       //System.out.println("Please enter a String : ");
       //Scanner  sc = new Scanner(System.in);
       //String st = sc.nextLine();
       String name = "Jaahanava Joshi"; //declaring string
       System.out.println(name);//output of string
       String alllower = name.toLowerCase();//converting to lower case
       String allupper = name.toUpperCase();//converting to upper case
       System.out.print(alllower);//output only in lower case
       System.out.println("");//nextline
       System.out.println(allupper);//output only in upper case
       String nonTrimmedString = "         Jaahanava      ";//considering non trimmed string
       System.out.println(nonTrimmedString);//output of non trimmed string
       String trimmedString = nonTrimmedString.trim();//making trimmed string
       System.out.println(trimmedString);//output of trimmed string
       System.out.println(name.substring(1,5));//output only certain letters to certain letters
       System.out.println(name.replace('h','k'));//replacing in string
    }
}

public class StringVsBuilder {

    public static void main(String[] args) {

        //Creates a new StringBuilder object
        StringBuilder str = new StringBuilder("Test immutability");
        StringBuilder newStr = new StringBuilder("Learning Java with Oracle");

        String str2 = "Test immutability";

        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());

        //change each objects value
        str.replace(0, str.length(), "HelloWorld");
        str2 = "HelloWorld";

        //check changed values
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());

        System.out.println("string = " + str);

        System.out.println("Text length " + newStr.length());
        System.out.println("First Character " + newStr.charAt(0));
        System.out.println("Second Character " + newStr.charAt(1));
        System.out.println("The psoition of the start of the text \"acl\" is : "
                           + newStr.indexOf("acl"));
        System.out.println("The following text is included within the String: "
                           + newStr.substring(1,4));

        //prints the String characters in reverse
        System.out.println("reverse = " + newStr.reverse());
        System.out.println("reverse = " + newStr.reverse());

        //adding text to the string using append
        newStr.append(" is fun");
        System.out.println("Appended string = " + newStr);

        //deleting specified characters
        newStr.delete(8,13);
        System.out.println("Deleted String = " + newStr);

        //inserting text
        newStr.insert(8, " Java Programming");
        System.out.println("Inserted String = " + newStr);

        //replacing existing String
        newStr.replace(13,25, " String Processing");
        System.out.println("replaced String = " + newStr);

        //Search using StringBuilder methods
        System.out.println(newStr.indexOf("a"));
        System.out.println(newStr.indexOf("q"));

        //position of specified String value after a specified location
        System.out.println(newStr.indexOf("a",7));

    }//end main

}//end class

package Strings;

public class Stringclass {
    public static void main(String[] args) {{

                String Name1="Aditi";
                String Name2=Name1.concat("Avhad");

                String Name3="ketki";
                String Name4=Name3+"ketki";

                String firstName="Aditi";
                String LastName="Avhad";

                String FullName=firstName+" " + LastName;
                String FullName1=firstName.concat(LastName);

                System.out.println(Name1);
                System.out.println(Name3);
                System.out.println(FullName);
                System.out.println(FullName1);


                char str1=LastName.charAt(2);
                System.out.println(str1);
                String str2=firstName.substring(1,3);
                System.out.println(str2);

                System.out.println(firstName.equals(LastName));


                String fullName1="My name is Aditi Avhad";
                boolean isParent= fullName1.contains("is");
                System.out.println(isParent);

                System.out.println(fullName1.indexOf('a'));
                String newName2=fullName1.replace('a','e');
                System.out.println(newName2);
            }
        }
    }


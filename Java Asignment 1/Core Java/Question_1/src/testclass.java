public class testclass {
        public boolean popInTheString(String strng)
        {
            int len = strng.length();
            for (int i = 0; i < len - 2; i++)
            {
                if (strng.charAt(i) == 'p' && strng.charAt(i+2) == 'p')
                    return true;
            }
            return false;
        }
        public static void main (String[] args)
        {
            testclass t= new testclass();
            String str1 =  "thepop";
            System.out.println("The given string is: "+str1);
            System.out.println("Is p?p appear in the given string? "+t.popInTheString(str1));
        }

}

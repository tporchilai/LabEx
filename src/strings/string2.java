package strings;

public class string2 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char current = str.charAt(i);
            if(builder.indexOf(String.valueOf(current))==-1)
            {
                builder.append(current);
            }


        } System.out.println(builder);
    }
}

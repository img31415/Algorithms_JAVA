public class Assignment_2 {
    public static void caesarCipher(String input, int num){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < input.length() ; i++){
            char x = input.charAt(i);
             if( 'z' - x < num){
                 sb.append((char)('a' + (num-('z'- x)-1)));
             }else{
                 sb.append((char)(x + num));
             }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        caesarCipher("vwxyz", 3);
    }
}

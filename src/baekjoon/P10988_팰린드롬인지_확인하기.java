import java.io.*;

public class P10988_팰린드롬인지_확인하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        String reversed = sb.append(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

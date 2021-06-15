package fs.apidef.identifyservice.java.BT;

public class BT1 {
    public static void main(String[] args) {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        char ch;
        int uppercase = 0, lowercase = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            int asciivalue = (int) ch;
            if (asciivalue >= 65 && asciivalue <= 90) {
                uppercase++;
            } else if (asciivalue >= 97 && asciivalue <= 122) {
                lowercase++;
            }
        }
        System.out.println("số từ viết in hoa trong chuỗi : " + uppercase);

        String[] token = str.split("\\s");
        str = "";

        for (int i = 0; i < token.length; i++) {
            char capLetter = Character.toUpperCase(token[i].charAt(0));
            str += " " + capLetter + token[i].substring(1);
        }
        str = str.trim();
        System.out.println("Chuỗi sau khi xử lý : " + str);
    }
}

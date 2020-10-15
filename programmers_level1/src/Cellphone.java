
public class Cellphone {
    public static void main(String[] args) {
        String phoneNumber = "01033334444";
        char[] phoneNumberChar = phoneNumber.toCharArray();
        for (int i=0; i<phoneNumber.length()-4; i++){
            phoneNumberChar[i] = '*';
        }
        String answer = String.valueOf(phoneNumberChar);
        System.out.println(answer);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Application extends EncryptionUtil{
    ArrayList<AuthenticationInfo> authinfoEn = new ArrayList<>();
    public void start(){
        Scanner input = new Scanner(System.in);

        System.out.println("--- MENU --");
        System.out.println("1. New login info");
        System.out.println("2. View login info");

        int val = input.nextInt();

        if (val == 1) {
            String URL = input.next();
            String username = input.next();
            String password = input.next();

            AuthenticationInfo authInfo = new AuthenticationInfo(URL, username, password);
            authinfoEn.add(createLoginRecord(authInfo));
        } else if (val == 2) {
            String aURL = input.next();
            ArrayList<AuthenticationInfo> ans = viewLoginRecord(aURL);
            for (AuthenticationInfo an : ans) {
                System.out.println(an.getUsername());
                System.out.println(an.getPassword());
                System.out.println();
            }
        } else {
            System.out.println("Enter a valid number!!");
        }
    }

    private AuthenticationInfo createLoginRecord(AuthenticationInfo authInfo){
        authInfo.setPassword(encrypt(authInfo.getPassword()));
        return authInfo;
    }

    private ArrayList<AuthenticationInfo> viewLoginRecord(String URL){
        ArrayList<AuthenticationInfo> ans = new ArrayList<>();
        for(AuthenticationInfo a : authinfoEn){
            if(a.getURL().equals(URL)){
                a.setPassword(decrypt(a.getPassword()));
                ans.add(a);
            }
        }
        return ans;
    }
}

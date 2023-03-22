package decorator;

import java.util.Scanner;

public class AccessControlDecorator extends DataStructure{
    private String password;

    public AccessControlDecorator(DataStructure data, String password) {
        super(data.getData());
        this.password = password;
    }

    public boolean checkPassword(String inputPassword) {
        return inputPassword.equals(this.password);
    }

    public int[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Syötä salasana: ");
        String inputPassword = scanner.nextLine();

        if (checkPassword(inputPassword)) {
            return super.getData();
        } else {
            System.out.println("Väärä salasana, pääsy evätty!");
            return null;
        }
    }
}

package decorator;

public class Main {
    public static void main(String[] args) {
        
        int[] data = {1, 2, 3};
        DataStructure dataStructure = new DataStructure(data);

        AccessControlDecorator accessControlledData = new AccessControlDecorator(dataStructure, "salasana");
        System.out.println("Dataa käsitellään pääsynvalvonnan kanssa:");
        int[] accessControlledDataArray = accessControlledData.getData();
        if (accessControlledDataArray != null) {
            for (int i = 0; i < accessControlledDataArray.length; i++) {
                System.out.println("Data[" + i + "] = " + accessControlledDataArray[i]);
            }
        }
    }
}

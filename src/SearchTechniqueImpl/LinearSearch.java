package SearchTechniqueImpl;

public class LinearSearch {
    public static void main(String[] args) {
        DataSet data= new DataSet(1000000);
        int Search=999;
        Boolean IsFound=false;
        for (int i = 0; i < data.getSize(); i++) {
            data.NumberTry++;
            if (data.data[i] == Search) {
                System.out.println("Element is found after try "+ data.NumberTry+ " try");
                IsFound=true;
                break;
            }
        }
    }
}

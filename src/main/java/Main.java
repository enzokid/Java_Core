import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> mainList = new ArrayList<>();

        mainList.add ("mama");
        mainList.add ("papa");
        mainList.add ("el ez zele");

        ArrayList<Character> listResult = new ArrayList<>();

        for(int i=0; i< mainList.size(); i++){

            char[] arrayResult = mainList.get(i).toCharArray();

            ArrayList<Character> tempList = new ArrayList<>();

                for(int j=0; j< arrayResult.length; j++){
                tempList.add(arrayResult[j]);

                }

            Set<Character> charSet = new HashSet<>();
            charSet.addAll(tempList);

            for(Character c : charSet){

                listResult.add(c);


            }

            System.out.println(listResult);
            return;


        }



    }

}

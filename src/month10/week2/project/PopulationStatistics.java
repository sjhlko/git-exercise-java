package month10.week2.project;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PopulationStatistics {
    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while(fileContents.length()<1000000){
            char c = (char) fileReader.read();
            fileContents+=c;
        }
        System.out.println(fileContents);


    }
//    public List<PopulationMove> readByLine(String filename) throws IOException{
////        List<PopulationMove> pm = new PopulationMove(filename);
////        BufferedReader reader = new BufferedReader(
////                new FileReader(filename)
////        );
////        String str;
////        while((str = reader.readLine())!=null){
////            System.out.println(str);
////            PopulationMove pm = parse(str);
////        }
////        reader.close();
//
//
//    }

    public void createAFile(String filename){
        File file = new File(filename);
        try{
            file.createNewFile();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename){
        File  file = new File(filename);
        String str = "Hello world";

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String s : strs) {
                writer.write((str));
            }
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido()+","+ populationMove.getToSido();
    }

//    public Map<String,Integer> getMoveCntMap(List<PopulationMove> pml){
//        Map<String,Integer> moveCntMap = new HashMap<>();
//        for (PopulationMove pm: pml) {
//            String key = pm.getFromSido() + "," +pm.getToSido();
//            if(moveCntMap.get(key)==null){
//                moveCntMap.put(key,1);
//            }
//            moveCntMap.put(key,moveCntMap.get(key)+1);
//            return moveCntMap;
//        }
//
//    }

    public static void main(String[] args) throws IOException {
        String address="C:\\Users\\User\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
//        //List<PopulationMove> pml = populationStatistics.readByLine(address);
//        List<String> strings = new ArrayList<>();
//        for (PopulationMove populationMove : pml) {
//            //System.out.printf("전입: %s, 전출: %s",populationMove.getFromSido(),populationMove.getToSido());
//            String fromTo =populationStatistics.fromToString(populationMove);
//            strings.add(fromTo);
//        }
//        Map<String,Integer> moveCntMap =new HashMap<>();
//        populationStatistics.write(strings,"./from_to.txt");

    }
}

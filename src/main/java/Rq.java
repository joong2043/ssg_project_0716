import java.util.Scanner;

public class Rq {
    String[] RequestList;
    String path;
    String queryStr;

    public String getIntParam(String cmd) {
        RequestList = cmd.split("\\?");

        path = RequestList[0];


        if(RequestList.length==1){
            return path;
        }


        queryStr = RequestList[1];
        return path;
    }
}

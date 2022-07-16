import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc;
    int lastIndex;

    ArrayList<WiseSaying> wiseSayings;

    App(){
        sc = new Scanner(System.in);
        lastIndex = -1;
        wiseSayings = new ArrayList<WiseSaying>();
    }

    void run(){

        outer:
        while(true){
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd){
                case "등록":
                    lastIndex++;
                    System.out.printf("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가 : ");
                    String author = sc.nextLine().trim();
                    WiseSaying wiseSaying = new WiseSaying(lastIndex,content,author);

                    wiseSayings.add(wiseSaying);

                    break;

                case "종료":
                    break outer;
            }
        }
    }
}

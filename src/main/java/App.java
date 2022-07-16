import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

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
                    write();
                    break;

                case "목록":
                    list();
                    break;

                case "삭제":
                    // 삭제?id=1
                    remove();

                case "종료":
                    break outer;
            }
        }
    }

    void write(){
        lastIndex++;
        System.out.printf("명언 : ");
        String content = sc.nextLine().trim();
        System.out.printf("작가 : ");
        String author = sc.nextLine().trim();
        WiseSaying wiseSaying = new WiseSaying(lastIndex,content,author);

        wiseSayings.add(wiseSaying);
    }

    void list(){
        Stream<WiseSaying> wiseSayingStream = wiseSayings.stream();
        wiseSayingStream.forEach(element -> System.out.print(element));
    }

    void remove(){

    }
}

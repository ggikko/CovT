package hello;

/**
 * Created by ggikko on 2017. 10. 17..
 */
public class HelloGgikko {

    public String getMessage(boolean isGgikko) {
        if(isGgikko){
            System.out.println("bye!");
        }
        if (isGgikko) {
            return "Hello Ggikko!";
        } else {
            return "Hello World!";
        }
    }
}

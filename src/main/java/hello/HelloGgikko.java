package hello;

/**
 * Created by ggikko on 2017. 10. 17..
 */
public class HelloGgikko {

    public String getMessage(boolean isGgikko) {
        if(isGgikko){
            good();
        }
        if (isGgikko) {
            return "Hello Ggikko!";
        } else {
            return "Hello World!";
        }
    }

    private void good() {
        System.out.println("good!");
    }

    protected String bye(){
        System.out.println("bye!");
        return "bye";
    }
}

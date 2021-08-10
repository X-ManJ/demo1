import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String say(){
        System.out.println("第一次输出");
        System.out.println("第二次输出");
        return "hello";
    }
}

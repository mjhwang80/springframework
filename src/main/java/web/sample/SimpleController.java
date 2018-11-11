package web.sample;


import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping(value = "/sample")
public class SimpleController {

    @ExceptionHandler(IOException.class)
    public String handleIOException(IOException ex, HttpServletRequest request){
        return ClassUtils.getShortName(ex.getClass());
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


}

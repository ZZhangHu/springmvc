package cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("data","SpringMVC");
        return "test";
    }
    @RequestMapping("/test2")
    public void test2(Model model){
        model.addAttribute("data","SpringMVC Test2");
    }
    @RequestMapping("/test3")
    public ModelAndView test3(){
        ModelAndView modelAndView=new ModelAndView("test3");
        modelAndView.addObject("data","SpringMVC Test3");
        return modelAndView;
    }
    @RequestMapping("/test4")
    public Map test4(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("key1","value1");
        map.put("key2","value2");
        return map;
    }
}

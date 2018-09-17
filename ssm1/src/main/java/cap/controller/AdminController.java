//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cap.controller;

import cap.cap.service.AdminService;
import cap.model.Admin;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/"})
public class AdminController {
    @Resource
    private AdminService adminService;

    public AdminController() {
    }

    @RequestMapping(
            value = {"/list"},
            method = {RequestMethod.GET}
    )
    public ModelAndView list() {
        List<Admin> adminList = this.adminService.selectAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("admins", adminList);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping(
            value = {"/delete"},
            method = {RequestMethod.GET}
    )
    public String del(@RequestParam("id") Integer id) {
        int res = this.adminService.deleteAdmin(id);
        return res > 0 ? "redirect:/list" : "error";
    }
}

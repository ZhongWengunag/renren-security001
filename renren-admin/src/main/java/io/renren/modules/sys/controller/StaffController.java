package io.renren.modules.sys.controller;


import io.renren.common.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @RequestMapping("/test")
    @ResponseBody
    public R test(){
        return R.ok();
    }
    @RequestMapping("/staff.html")
    public String page(){
        return "../modules/sys/staff.html";
    }
}

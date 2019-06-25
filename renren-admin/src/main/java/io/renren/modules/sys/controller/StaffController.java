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
    //返回用户登录页面
    @RequestMapping("/slogin.html")
    public String slogin(){
        return "../weekly/slogin.html";
    }
    //返回周报添加页面
    @RequestMapping("/staff.html")
    public String page(){
        return "../weekly/staff.html";
    }
}

package com.springboot.xishuimiao.controller;

import com.springboot.xishuimiao.entity.User;
import com.springboot.xishuimiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/p/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * <B>方法名称：</B>list<BR>
     * <B>概要说明：</B>跳转到数据列表展示页面 <BR>
     * @param   model
     * @return  String
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public String list(Model model) {
        return "/application/app_type_list";
    }

    /**
     * <B>方法名称：</B>addForAjax<BR>
     * <B>概要说明：</B>ajax方式添加数据 <BR>
     * @param   record
     * @return  String
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    @RequestMapping(value="/addForAjax", method=RequestMethod.POST)
    @ResponseBody
    public String add(User record) {
        User newRecord = userService.add(record);
        return newRecord.toString();
    }


}
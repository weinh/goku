package com.yongle.goku.base.controller;

import com.yongle.goku.utils.ConfigUtils;
import com.yongle.goku.utils.constant.ReturnCode;
import com.yongle.goku.vo.ReturnBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    final Logger log = LoggerFactory.getLogger(getClass());
    protected ReturnBean returnBean;

    /**
     * 全局异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class})
    public ReturnBean exception(Exception e) {
        returnBean = ConfigUtils.generateReturnBean(ReturnCode.ERROR);
        if (ConfigUtils.getProperty("debug").equals("true")) {
            returnBean.setDescription(e.getLocalizedMessage());
        }
        log.error(e.getMessage(), e);
        return returnBean;
    }

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }
}

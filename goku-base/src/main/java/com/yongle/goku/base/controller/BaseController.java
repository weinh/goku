package com.yongle.goku.base.controller;

import com.yongle.goku.constant.ErrorEnum;
import com.yongle.goku.model.vo.ResultVO;
import com.yongle.goku.utils.ConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 全局异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class})
    public ResultVO exception(Exception e) {
        log.error(e.getMessage(), e);
        ResultVO vo = new ResultVO(ErrorEnum.ERROR);
        if (ConfigUtils.getProperty("debug").equals("true")) {
            vo.setDescription(e.getLocalizedMessage());
        }
        return vo;
    }

    protected ResultVO validatorParam(BindingResult result) {
        ResultVO vo = new ResultVO(ErrorEnum.ERROR_PARAM);
        vo.setErrorInfo(result.getFieldError().getField() + result.getFieldError().getDefaultMessage());
        return vo;
    }
}

package org.epoch.security.endpoints;

import org.epoch.security.exception.ValidateCodeException;
import org.epoch.security.service.ValidateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 验证码生成
 *
 * @author Marshal
 * @date 2020/1/28
 *
 */
@RestController
@RequestMapping("/captcha")
public class CaptchaEndpoints {

    @Autowired
    private ValidateCodeService validateCodeService;

    @GetMapping("/create")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException, ValidateCodeException {
        validateCodeService.create(request, response);
    }
}

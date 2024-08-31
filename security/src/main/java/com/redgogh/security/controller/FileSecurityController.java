package com.redgogh.security.controller;

import com.redgogh.security.service.FileSecurityService;
import com.redgogh.vortextools.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件安全服务
 *
 * @author RedGogh
 */
@RestController
@RequestMapping("/")
public class FileSecurityController {

    @Autowired
    private FileSecurityService fileSecurityService;

    /**
     * 文件安全检查
     */
    @GetMapping("/check-file")
    public R<Boolean> check(@RequestParam("document") MultipartFile document) {
        return R.ok(fileSecurityService.checkFileSecurity(document));
    }

}
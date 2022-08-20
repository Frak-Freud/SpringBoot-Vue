package com.example.controller;

import cn.hutool.core.io.FileUtil;
import com.example.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/files")
public class FileController {

    @PostMapping("/upload")
    public Result<?> upload(MultipartFile file) throws IOException{
        String originalFilename = file.getOriginalFilename();
        String rootFilePath = System.getProperty("user.dir") + "/src/main/resources/files/" + originalFilename;
        FileUtil.writeBytes(file.getBytes(), rootFilePath);
        return Result.success();
    }
}

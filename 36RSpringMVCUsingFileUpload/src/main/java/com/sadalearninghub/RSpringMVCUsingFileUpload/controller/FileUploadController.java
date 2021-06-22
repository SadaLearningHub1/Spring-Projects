package com.sadalearninghub.RSpringMVCUsingFileUpload.controller;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {

	@RequestMapping(value="upload", method=RequestMethod.POST)
	public ModelAndView fileUpload(@RequestParam("file") MultipartFile file) {
		String fail="";
		String success="";
		if(file.getSize() != 0) {
			if(file.getContentType().equals("text/html")) {
				try {
					FileOutputStream fos = new FileOutputStream("G:\\"+file.getOriginalFilename());
					fos.write(file.getBytes());
					success = "your file : "+file.getOriginalFilename()+"uploaded successfully";
				}catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				fail = "The file should be in the format of text/html";
			}
		}else {
			fail = "The file Should not be Empty";
		}
		if(success.length()>1) {
			return new ModelAndView("success","msg",success);
		}else {
			return new ModelAndView("uploadfile","msg",fail);
		}
	}

}

package com.huschle.upload.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Maps http requests.
 * 
 * @author	Naoko Huschle
 * @since	2017-03-05
 *
 */

@Controller
public class FileUploadController {
	@RequestMapping(value="/fileUpload")
	public String fileUpload(){
		return "fileUpload";
	}
	@RequestMapping(value="/singleSave", method=RequestMethod.POST)
	public @ResponseBody String singleSave(@RequestParam("file") MultipartFile file, @RequestParam("desc") String desc ){
		System.out.println("File Description:"+desc);
		String fileName = null;
		if (!file.isEmpty()) {
		    try {
		        fileName = file.getOriginalFilename();
		        byte[] bytes = file.getBytes();
		        BufferedOutputStream buffStream = 
		                new BufferedOutputStream(new FileOutputStream(new File("C:/bootstrap-upload/yourFiles/" + fileName)));
		        buffStream.write(bytes);
		        buffStream.close();
		        return "You have successfully uploaded " + fileName;
		    }
		    catch (Exception e) {
		        return "You failed to upload " + fileName + ": " + e.getMessage();
		    }
		}
		else {
		    return "Unable to upload. File is empty.";
		}
	}
}
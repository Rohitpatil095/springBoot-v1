package com.app.file.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	@RequestMapping("/")
	public String check()
	{
		return "home";
	}
	
	@RequestMapping(value="/file", method = RequestMethod.POST)
	public ResponseEntity<String> getFile(@RequestParam("file") MultipartFile file)
	{
		if (file.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Atleast 1 file need to provide..");
		}
		else if(!file.getContentType().equals("image/jpeg"))
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only Jpeg format accepted");
		}
		
		final String dataDir="C:\\Users\\rohit\\OneDrive\\Desktop\\Programming\\Current\\projects\\springboot\\starter01\\day07-rest-fileuplaoder\\src\\main\\resources\\static\\allData";
		try {
		
			Files.copy(file.getInputStream(),Paths.get(dataDir+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return ResponseEntity.ok("Working");	
	}
}

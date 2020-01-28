package com.example.demo.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class uploadImageService implements IupLoadImageService{
	
	   public static String uploadDirectory = System.getProperty("user.dir")+ "\\uploads";

	   @Override
	       public void uploadImage(MultipartFile image) throws Exception {
	           String folder = this.uploadDirectory;
	           byte[] bytes = image.getBytes();
	           Path path = Paths.get(folder + image.getOriginalFilename());
	           Files.write(path, bytes);
	       }

	public String getUploadDirectory() {
		return uploadDirectory;
	}
	   
}


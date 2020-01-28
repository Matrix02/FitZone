package com.example.demo.services;

import org.springframework.web.multipart.MultipartFile;

public interface IupLoadImageService {
	
	public void uploadImage(MultipartFile image) throws Exception;
	
	public String getUploadDirectory();

}

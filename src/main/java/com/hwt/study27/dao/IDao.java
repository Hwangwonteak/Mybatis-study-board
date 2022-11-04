package com.hwt.study27.dao;

import java.util.ArrayList;

import com.hwt.study27.dto.ContentDto;

public interface IDao {
	
	public void deleteDao(String mid);
	
	public void writeDao(String mwriter,String mcontent);
	
	public ArrayList<ContentDto> listDao();
	
}

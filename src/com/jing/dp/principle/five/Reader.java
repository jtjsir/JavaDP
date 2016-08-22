package com.jing.dp.principle.five;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 实现读取文件的功能
 * @author hspcadmin
 *
 */
public class Reader {
	private String path ;
	
	private int a ;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	private int b ;
	
	public Reader(String path){
		this.path = path ;
	}
	
	public void read(){
		File readFile = new File(this.path);
		if(readFile.isFile()){
			try {
				BufferedReader bReader = new BufferedReader(new FileReader(readFile)) ;
				this.a = Integer.valueOf(bReader.readLine()) ;
				this.b = Integer.valueOf(bReader.readLine()) ;
				
				bReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

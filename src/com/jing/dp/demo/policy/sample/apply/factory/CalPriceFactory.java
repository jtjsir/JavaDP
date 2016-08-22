package com.jing.dp.demo.policy.sample.apply.factory;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.jing.dp.demo.policy.sample.apply.annotation.TotalValidRegion;
import com.jing.dp.demo.policy.sample.apply.ifs.CalPrice;

public class CalPriceFactory {

	// ע��ɨ��İ�
	private static final String scanPackage = "com.jing.dp.demo.policy.sample.apply.impl";

	private ClassLoader classLoader = getClass().getClassLoader();

	private List<Class<? extends CalPrice>> calPricePolicy = new ArrayList<>(10);
	
	public CalPriceFactory(){
		init() ;
	}

	private void init() {
		File[] files = getResource() ;
		
		Class<CalPrice> class1 = null ;
		try {
			class1 = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName()) ;
		} catch (Exception e) {
			throw new RuntimeException("�Ҳ���calPrice������") ;
		}
		int fileLen = files.length ;
		try {
			Class<?> priceClass = null ;
			for(int j = 0 ; j < fileLen ; j++){
				priceClass = classLoader.loadClass(scanPackage + "." + files[j].getName().replace(".class", "")) ;
				if(CalPrice.class.isAssignableFrom(priceClass)&& class1!=priceClass){
					calPricePolicy.add((Class<? extends CalPrice>)priceClass) ;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private File[] getResource() {
		try {
			File pkg = new File(classLoader.getResource(scanPackage.replace(".", "/")).toURI()) ;
			return pkg.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					//ֻȡclass�ļ�
					if(file.getName().endsWith(".class")){
						return true ;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}

	// ����ע��
	private TotalValidRegion handleAnnotation(Class<? extends CalPrice> clazze) {
		TotalValidRegion totalValidRegion = null;
		// ��ñ�class�е�����ע��
		Annotation[] annotations = clazze.getDeclaredAnnotations();
		if (null == annotations || (annotations.length) <= 0) {
			return null;
		} else {
			int size = annotations.length;
			for (int i = 0; i < size; i++) {
				if (annotations[i] instanceof TotalValidRegion) {
					totalValidRegion = (TotalValidRegion) annotations[i];
				}
			}
		}
		return totalValidRegion;
	}

	public CalPrice createCalPricePolicy(Double totalAmount) {
		TotalValidRegion region = null;
		try {
			for (Class<? extends CalPrice> cls : calPricePolicy) {
				region = handleAnnotation(cls);
				//������Сֵ�����ֵ������Ӧ�Ĳ���
				if (totalAmount >= region.min() && totalAmount <= region.max()) {
					return cls.newInstance();
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return null;
	}
}

package com.xin.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public final class PropUtils {
	private static final String SYSTEM_PROPERTIES = "System.properties";

	public static String getKey(String key) {
		Properties props = new Properties();

		String path = PropUtils.class.getResource("/").getPath();
		path += File.separator + SYSTEM_PROPERTIES;
		try {
			FileReader reader = new FileReader(path);
			props.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props.getProperty(key);
	}
//	public static void main(String[] args) {
//		String value = PropUtils.getKey("uploadFileLibrary");
//		System.out.println(value);
//	}
}



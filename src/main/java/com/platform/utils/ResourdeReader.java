package com.platform.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.platform.configure.result.CustomException;
import com.thoughtworks.xstream.XStream;

public class ResourdeReader {

	public static void fileReader(String fileName) throws CustomException {
		Resource resource = new ClassPathResource("exception.xml");
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
		} catch (IOException e) {
			throw new CustomException(e);
		} finally {
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new CustomException(e);
				}
			}
		}
	}

	public static Object toBean(Class<?> clazz, String xml) {
		Object xmlObject = null;
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
		xstream.autodetectAnnotations(true);
		xmlObject = xstream.fromXML(xml);
		return xmlObject;
	}
}

package io.mosip.authentication.fw.dto;

import java.util.List; 
import java.util.Map;

/**
 * Dto Class to hold all biometric data from yml config file
 * 
 * @author Vignesh
 *
 */
public class BiometricDto {
	
	public static Map<String, Map<String, Map<String, List<Object>>>> fir;
	public static Map<String, Map<String, Map<String, List<Object>>>> iir;
	public static Map<String, Map<String, List<Object>>> fid;

	/**
	 * The method get all finger data
	 * 
	 * @return Map<String, Map<String, Map<String, List<Object>>>> - Finger
	 */
	public static Map<String, Map<String, Map<String, List<Object>>>> getFir() {
		return fir;
	}

	/**
	 * The method set finger data from config file
	 * 
	 * @param fir
	 */
	public static void setFir(Map<String, Map<String, Map<String, List<Object>>>> fir) {
		BiometricDto.fir = fir;
	}

	/**
	 * The method get all iris data
	 * 
	 * @return Map<String, Map<String, Map<String, List<Object>>>> - IRIS
	 */
	public static Map<String, Map<String, Map<String, List<Object>>>> getIir() {
		return iir;
	}

	/**
	 * The method set iris data from config file
	 * 
	 * @param iir
	 */
	public static void setIir(Map<String, Map<String, Map<String, List<Object>>>> iir) {
		BiometricDto.iir = iir;
	}

	/**
	 * The method get all face data
	 * 
	 * @return Map<String, Map<String, List<Object>>> - FACE
	 */
	public static Map<String, Map<String, List<Object>>> getFid() {
		return fid;
	}

	/**
	 * The method set face data from config file
	 * 
	 * @param fid
	 */
	public static void setFid(Map<String, Map<String, List<Object>>> fid) {
		BiometricDto.fid = fid;
	}

}

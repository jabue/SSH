package com.jabue.struts.intface;

/**
 * Struts acton interface
 * 
 * @author Kris
 *
 */
public interface Action {
	public static String SUCCESS = "success";
	public static String ERROR = "error";

	public String execute() throws Exception;

}

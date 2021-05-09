package com.dakam.app.JSPCustomagsLabApp.ctags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeDate extends SimpleTagSupport {
	String color;
	String size;

	// render custom tag
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		String defaultcolor = "#6F8FAF";
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		String mdate = ft.format(dNow);

		if (color == null) {

			out.write("<span style='font-size: "+size+"';>"+mdate+"</span>");
		} else {
			out.write("<span style='color:"+color+"; font-size: "+size+"';>"+mdate+"</span>");
		}
	}

	// Need a setter for each attribute of custom tag
	public void setColor(String color) {
		this.color = color;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
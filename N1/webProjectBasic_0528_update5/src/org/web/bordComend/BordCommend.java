package org.web.bordComend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BordCommend {

	void excuteQuery(HttpServletRequest request,HttpServletResponse response)
						throws ServletException, IOException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tags;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Nik
 */
public class MyCustomTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        try {
            JspWriter out = pageContext.getOut();
            out.println("<h1>Hello,This is out custom tag.</h1>");
            out.println("<h2>Todays date and time : " + new Date() + "</h2>");
            out.println("<p style='font-size:25px;'>We are learning about creating custyom tags in JSP.</p>");
            out.println("<h1>following steps to be followed for creating custom tags -</h1>");
            out.println("<ol style='font-size:25px;'>");
            out.println("<li>create a class which extends TagSupport class</li>");
            out.println("<li>override its doStartTag() method.</li>");
            out.println("<li>create tag lib descriptor file in WEB-INF folder</li>");
            out.println("<li>add this in out jsp page using taglib directive by giving proper uri</li>");
            out.println("<li>declare our tag in that file using ");
            out.println("tag(outer),name(inner),tag-class(inner) tags");
            out.println("</ol>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

}

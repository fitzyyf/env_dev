#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import goja.mvc.Controller;

#parse("File Header.java")
public class ${NAME} extends Controller {

    /**
     * The index route.
     */
    public void index(){}
}
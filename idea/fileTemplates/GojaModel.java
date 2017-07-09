#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import goja.core.annotation.TableBind;
import com.jfinal.plugin.activerecord.Model;

#parse("File Header.java")
@TableBind(tableName = "${tablename}")
public class ${NAME} extends Model<${NAME}> {
  
    /**
     * The public dao.
     */
    public static final ${NAME} dao = new ${NAME}();
    
    
}
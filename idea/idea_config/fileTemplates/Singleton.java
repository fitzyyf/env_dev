#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    /**
     * 获取单例对象,如果要调用该单例的使用,只能通过该方法获取.
     */
    public static ${NAME} getInstance() {
        return ${NAME}Holder.instance;
    }
    /**
     * 私有构造函数,确保对象只能通过单例方法来调用.
     */
    private ${NAME}() {
    }
    /**
     * lazy 加载的内部类,用于实例化单例对象.
     */
    private static class ${NAME}Holder{
        static ${NAME} instance = new ${NAME}();
    }
}

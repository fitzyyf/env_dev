#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public enum ${NAME} {
    /**
     * 单例对象
     */
    INSTANCE;

    /**
     * 默认构造函数
     */
    ${NAME}() {
    }
}

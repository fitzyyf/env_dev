# 开发环境配置

SOGYF 开发环境配置

## Maven 配置

> 由于国内访问Maven的国外中心仓库速度非常慢，所以需要将中心仓库指定到阿里云仓库；并设置好Maven的中心仓库

1. 拷贝 `./maven/settings.xml` 到 个人目录下 `${USER_HOME}/.m2/settings.xml`

    `USER_HOME` 的地址为

    * Windows: `C:\Users\${system login name}`
    * OS X: `~/`

2. 修改个人仓库的路径，不建议将本地仓库放到默认位置;

    编辑 `settings.xml` , 找到内容 `${USER_REPOS}` 并修改为指定路径即可。 比如我的设置为 `~/iDev/.repos/`

## Intellij Idea 配置

### Idea JVM 配置

> 适用于所有的 Intellij 系列的IDEA工具

在 Intellij Idea 的安装目录下， 找到 `idea.vmoptions`文件。

> 在 Mac 中，找到 Intellij Idea.app 然后右键 显示文件内容，文件路径为 `Contents/bin/idea.vmoptions`

将 本仓库中的 `./idea/jvm/idea.vmoptions` 拷贝到 `bin`目录下，替换或者将内容复制过去即可。

### Idea Java 编码设置

> Android Studio 的设置方法如下，只是对应配置目录为 `./idea/as_config`

1. 将 本仓库中的 `./idea/idea_config` 目录 拷贝到指定的目录，具体如下

* Windows: <code>~\\.IntelliJIdeaXX\config</code>
* Linux: <code>~/.IntelliJIdeaXX/config</code>
* OS X: <code>~/Library/Preferences/IntelliJIdeaXX</code>

具体替换规则如下：

    <INTELLIJ-IDEA-CONFIG_DIR>
    ├── codestyles           <--- 替换这个目录
    ├── colors
    ├── componentVersions
    ├── consoles
    ├── eval
    ├── extensions
    ├── fileTemplates        <--- 替换这个目录
    ├── ideTalk
    ├── inspection
    ├── javascript
    ├── jdbc-drivers
    ├── options
    ├── quicklists
    ├── tasks
    ├── templates            <--- 替换这个目录
    └── trp

2. 覆盖导入完成后，打开Intellij，进行设置

    * 在 `设置` 中找到 `Editor > Code Style`选择 `GoogleStyle`
    * 在 `设置` 中找到 `Editor > Inspections`选择 `TeamInsp`

3. 安装 必要插件

    * 安装 `Alibaba Java Coding Guidelines` 插件
    * 安装 `Lombok Plugin` 插件



### live tempalte 的一些指令

#### Java

-- **`$log`**: "New SLF4J logger"
-- **`$logd`**: "SLF4J debug log"
-- **`$loge`**: "SLF4J error log"
-- **`$logi`**: "SLF4J info log"
-- **`$logw`**: "SLF4J warning log"
-- **`$meth`**: "New method"
-- **`prf`**: "private final"
-- **`prfi`**: "private final int"
-- **`prfs`**: "private final String"
-- **`.average`**: "Stream#collect(averageLong(toLong))"
-- **`.groupBy`**: "Stream#collect(groupingBy(e -> e.getKey()))"
-- **`.join`**: "Stream#collect(joining("separator"))"
-- **`.maxBy`**: "Stream#collect(maxBy(comparator))"
-- **`.minBy`**: "Stream#collect(maxBy(comparator))"
-- **`.partitionBy`**: "Stream#collect(partitionBy(pred)))"
-- **`.reduce`**: "Stream#collect(reduce(binaryReducer))"
-- **`.sum`**: "Stream#collect(summingLong(toLong)))"
-- **`.toList`**: "Stream#collect(toList())"
-- **`.toMap`**: "Stream#collect(toMap(keyMapper, valueMapper)"
-- **`.toSet`**: "Stream#collect(toSet())"

#### android

- **`temp_classtag`**: "A static logtag with your current classname"
- **`temp_const_boolean`**: "private static final boolean"
- **`temp_const_int`**: "private static final int"
- **`temp_const_long`**: "private static final long"
- **`temp_const_string`**: "private static final String"
- **`temp_find_button`**: "findViewById Button"
- **`temp_find_edit`**: "findViewById EditText"
- **`temp_find_image`**: "findViewById ImageView"
- **`temp_find_list`**: "findViewById ListView"
- **`temp_find_progress`**: "findViewById ProgressBar"
- **`temp_find_text`**: "findViewById TextView"
- **`temp_foreach`**: "Create a for each loop"
- **`temp_handler`**: "Create a new handler object"
- **`temp_handlerpost`**: "Implement handler post method"
- **`temp_inflate`**: "Create layoutinflater and inflate view"
- **`temp_logd`**: "Send a DEBUG log message"
- **`temp_loge`**: "Send an Error log message"
- **`temp_logi`**: "Send an INFO log message"
- **`temp_logv`**: "Send a VERBOSE log message"
- **`temp_logw`**: "Send a WARN log message"
- **`temp_new_activity`**: "Start a new activity"
- **`temp_parcelable`**: "Create a parcelable block for your current class"
- **`temp_path_assets`**: "Assets directory path"
- **`temp_psf`**: "private static final variable with type and member"
- **`temp_psfb`**: "private static final boolean"
- **`temp_psfi`**: "private static final int"
- **`temp_psfs`**: "private static final String"
- **`temp_res_drawable`**: "resources.getDrawable(...)"
- **`temp_res_string`**: "resources.getString(...)"
- **`temp_res_color`**: "resources.getColor(...)"
- **`temp_runui`**: "runOnUIThread"
- **`temp_toast`**: "Create a new Toast message"
- **`temp_newinstance`**: "Create a new Fragment instance with arguments"
- **`temp_key`**: "Key variable for preferences, bundles...
- **`temp_calendar`**: "Get a current Calendar"
- **`temp_listener`**: "Observer Design Pattern (Listener)"
- **`temp_porterduff`**: "A color filter that can be used to tint a drawable"
- **`temp_attrs`**: "Retrieve XML attributes with style and theme information applied"
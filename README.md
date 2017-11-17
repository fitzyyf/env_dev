# 开发环境配置

SOGYF 开发环境配置

## Maven 配置

> 由于国内访问Maven的国外中心仓库速度非常慢，所以需要将中心仓库指定到阿里云仓库；并设置好Maven的中心仓库

1. 拷贝 `./maven/settings.xml` 到 个人目录下 `${USER_HOME}/.m2/settings.xml`

    `USER_HOME` 的地址为

    * Windows: `C:\Users\${system login name}`
    * OS X: `~/`

2. 修改个人仓库的路径，不建议将本地仓库放到默认位置;

    编辑 `settings.xml` , 调整 `${USER_REPOS}`为指定路径即可。 比如我的设置为 `~/iDev/.repos/`

## Intellij Idea 配置

### Idea JVM 配置

> 适用于所有的 Intellij 系列的IDEA工具

在 Intellij Idea 的安装目录下， 找到 `idea.vmoptions`文件。

> 在 Mac 中，找到 Intellij Idea.app 然后右键 显示文件内容，文件路径为 `Contents/bin/idea.vmoptions`

将 本仓库中的 `./idea/jvm/idea.vmoptions` 拷贝到 `bin`目录下，替换或者将内容复制过去即可。

### Idea Java 编码设置

将 本仓库中的 `./idea/idea_config` 目录 拷贝到指定的目录，具体如下

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


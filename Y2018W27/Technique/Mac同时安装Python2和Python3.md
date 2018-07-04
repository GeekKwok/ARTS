## **MacOSX上同时安装Python2和Python3**

本文介绍如何在Mac中同时安装Python2和Python3的两个版本.

### 安装步骤
> - Step1: 安装Xcode
> - Step2: 安装套件管理工具Homebrew
> - Step3: 安装Python
> - Step4: 设定路径$PATH(不与系统Python冲突)
> - Step5: 确认安装结果

##### Step1: 安装Xcode
直接到AppStore搜索Xcode并点击安装, 完成后打开Xcode, 第一次开启时提示License Agreement, 然后到Terminal输入`xcode-select --install`来完成安装.

##### Step2: 安装套件管理工具Homebrew
在Terminal输入如下命令来完成安装Homebrew:
> ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

在Terminal输入如下命令来确认安装成功:
> brew doctor<br>
>
> *#如果出现如下提示说明已安装成功<br>
> Your system is ready to brew.*

##### Step3: 安装Python
在Terminal输入如下命令来检查系统Python版本:
> python --version

在Terminal输入如下命令来安装Python3(3.7.0)版本:
> brew install python # 安装过程中可能会提示安装gdbm、openssl、readline、sqlite、xz
>
> #在安装Python时可能会有如下错误提示:<br>
> > *Error: An unexpected error occurred during the `brew link` step
> > The formula built, but is not symlinked into /usr/local
> > Permission denied @ dir_s_mkdir - /usr/local/Frameworks*<br>
> > *Error: Permission denied @ dir_s_mkdir - /usr/local/Frameworks*
> #通过在Terminal输入如下命令来解决该问题:<br>
> sudo install -d -o $(whoami) -g admin /usr/local/Frameworks
> #通过在Terminal输入如下命令来继续完成安装:<br>
> brew link python

在Terminal输入如下命令来查看安装的Python3版本:
> python3 --version

在Terminal输入如下命令来安装Python2(2.7.15)版本:
> brew install python@2 #安装过程中可能会提示安装gdbm

在Terminal输入如下命令来查看安装的Python2版本:
> python2 --version

##### Step4: 设定路径$PATH(不与系统Python冲突)
在Terminal输入如下命令来查看$PATH变量:
> echo $PATH
> #可能的显示结果: /usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin

从$PATH的内容, 我们知道路径的搜索有顺序, 即按照先后顺序, 系统python安装目录`/usr/bin`, 通过brew安装的python目录`/usr/local/bin`, 因此我们可以通过编辑`/etc/paths`文件以调整路径的搜索顺序:
> - sudo vim /etc/paths<br>
> - 输入密码<br>
> - 编辑路径的顺序<br>
> - 保存并退出

##### Step5: 确认安装结果
在Terminal输入如下命令来确认安装版本:
> python3 --version<br>
> python2 --version<br>
> python --version

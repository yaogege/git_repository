郑重说明：
这是用来练习的，项目只是完成了一小部分，请大家不要下载哈，我是个新手。

git is a free software.
git_repository,原来可以这么玩:


1、创建一个目录：mkdir learngit
2、通过git init命令把这个目录变成Git可以管理的仓库：
3、要关联一个远程库，使用命令git remote add origin git@server-name:path/repo-name.git；
4、关联后，使用命令git push -u origin master第一次推送master分支的所有内容；
5、此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改
6、下一步是用命令git clone克隆一个本地库：git clone git@github.com:yaogege/git_repository.git

7、 创建dev分支并切换到dev分支：git checkout -b dev
     相当于：git branch dev 
	         git checkout dev 
	这两条命令。
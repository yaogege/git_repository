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

8、切换到主分支分支（master分支）：git checkout master
9、把dev分支的工作成果合并到master分支上：git merge dev 。
     git merge命令用于合并指定分支到当前分支
10、合并完成后，可以把放心的删除dev分支了,删除后，查看branch，就只剩下master分支了：
     git branch -d dev
	 git branch
	

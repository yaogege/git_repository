郑重说明：
来源：https://blog.csdn.net/u011535541/article/details/83379151
这是用来练习的，项目只是完成了一小部分，请大家不要下载哈，我是个新手。

git is a free software.
git_repository,原来可以这么玩:


1、创建一个目录：mkdir learngit
2、通过git init命令把这个目录变成Git可以管理的仓库：

步骤：
	git add 文件名。# 将该文件加入缓冲区，如果你确定所有的修改都需要提交，可以使用git add .来加入所有修改
    git commit -m "使用说明（如：修改登录功能）"
同步到github服务器：git push origin master

查看最近到最远的提交日志：
    git log --pretty=oneline
	
版本回退：
	git reset --hard HEAD^   (回退上一个版本)
	git reset --hard 12345678(回退到这个版本commit id为12345678)

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

	 
Git Clone 命令直接使用用户名:密码：
git clone https://用户名:密码@git.coding.net/sample/HelloWorld.git	 
	 
	

版本回退小结
	HEAD指向的版本就是当前版本，因此，Git允许我们在版本的历史之间穿梭，使用命令git reset --hard commit_id。
	穿梭前，用git log可以查看提交历史，以便确定要回退到哪个版本。
	要重返未来，用git reflog查看命令历史，以便确定要回到未来的哪个版本。	
	
添加远程库 小结
	要关联一个远程库，使用命令git remote add origin git@server-name:path/repo-name.git；
	关联后，使用命令git push -u origin master第一次推送master分支的所有内容；
	此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改；

克隆远程库 小结
	要克隆一个仓库，首先必须知道仓库的地址，然后使用git clone命令克隆。
	Git支持多种协议，包括https，但通过ssh支持的原生git协议速度最快。

创建与合并分支 小结
	Git鼓励大量使用分支：
	查看分支：git branch
	创建分支：git branch <name>
	切换分支：git checkout <name>
	创建+切换分支：git checkout -b <name>
	合并某分支到当前分支：git merge <name>
	删除分支：git branch -d <name>



python自动化简介：
   https://blog.csdn.net/a464057216/article/details/52717464



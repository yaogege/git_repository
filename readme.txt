git is a free software.
git_repository,原来可以这么玩:


1、创建一个目录：mkdir learngit
2、通过git init命令把这个目录变成Git可以管理的仓库：


要关联一个远程库，使用命令git remote add origin git@server-name:path/repo-name.git；
关联后，使用命令git push -u origin master第一次推送master分支的所有内容；
此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改
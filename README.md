# Lab2
图书管理系统

### 功能介绍
- 主要是提供电子资料下载
- 介绍按钮：显示电子资料的基本资料（还未实现）
- 下载：提供电子资料下载（下载源来自云服务器）
- 备用下载：提供电子资料下载（下载源来自百度云盘）
- 反馈：告知管理员相应的电子资源存在问题（之后会添加更多详细咨询，例如链接失效，下载内容错误等）

### 目前未实现的工能
- 用户登录：目前是对任何用户都能使用，之后添加用户登录，登录的用户可以上传文件分享
- 文件上传：毕竟作者资源有限，所以之后会提供资源上传功能，以便获取更多资源

### 备注
- com/favccxx/favsoft/util中，提供了一个下载方案：使用ftp下载，但是目前只能下载到本地，就是只能下载到云服务器上，但是如果在本地使用的话，能成功下载到本地，并且提供上传，删除云服务器上文件等功能
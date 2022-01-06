# LangV 视频分享订阅网站      
一个基于SpringBoot、Mybatis-Plus、ffmpeg、Redis、Dplayer.js、vue.js的视频分享订阅网站，实现了一个视频网站的上传视频、播放视频、个人主页、订阅、评论、订阅评论通知等基本功能。
（具体技术交流请联系qq 1845780976） <br>
 演示地址：http://120.39.221.137:8083/ <br><br>
**新版本：新版本不再像以前把视频和封面文件都存储在服务器的本地磁盘，而是存储在阿里云的oss对象存储服务器。oss服务器可以存储大型文件，并可通过文件的url直接获取到服务器上的文件，这样就免去了在原服务器上io存储视频和读取视频的操作，速度得到了极大的提升。(前提是要购买阿里云的oss服务器，并在配置文件填写自己oss的相关信息，最后还需要在oss管理控制台中的权限管理里选中跨越设置，允许所有方法，防止出现跨越问题而无法播放视频)**



**一、具体页面如下：**

**1、登录页面**
![image](https://github.com/ljx1845780976/img/blob/main/%E7%99%BB%E5%BD%95%E9%A1%B5.png)

**2、个人主页**
![image](https://github.com/ljx1845780976/img/blob/main/%E4%B8%AA%E4%BA%BA%E4%B8%BB%E9%A1%B5.png)

**3、主页**
![image](https://github.com/ljx1845780976/img/blob/main/%E4%B8%BB%E9%A1%B5.png)

**4、具体视频播放页**
![image](https://github.com/ljx1845780976/img/blob/main/%E5%85%B7%E4%BD%93%E6%92%AD%E6%94%BE%E8%A7%86%E9%A2%91%E9%A1%B5.png)

**5、播放页下方评论区**
![image](https://github.com/ljx1845780976/img/blob/main/%E6%92%AD%E6%94%BE%E8%A7%86%E9%A2%91%E9%A1%B5%E4%B8%8B%E8%AF%84%E8%AE%BA%E5%8C%BA.png)

**6、通知栏信息**
![image](https://github.com/ljx1845780976/img/blob/main/%E9%80%9A%E7%9F%A5%E6%A0%8F%E4%BF%A1%E6%81%AF.png)

**7、上传页面**
![image](https://github.com/ljx1845780976/img/blob/main/%E4%B8%8A%E4%BC%A0%E9%A1%B5%E9%9D%A2.png)

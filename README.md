# springboot-multiple-modules
整体说明：
工程采用spring-boot模块支持，用gradle编译

使用方法：
在Application.java中右键运行，platform-node-server模块调用了platform-ca-server模块的方法
platform-node-server 和 platform-ca-server都是springboot框架，实现此工程包含多个springboot模块


框架目标：
    1、增加javaSE模块，对其他模块提供支持，起到core和util的作用<br/>
    2、工程包含多个springboot<br/>
    3、访问链接之前统一进行用户访问权限验证<br/>
    4、微服务管理<br/>
    5、微服务接口管理<br/>
    ......
        



#基础镜像选择alpine 小巧安全流行方便
FROM java:8-jre-alpine-cst
#复制固定路径下打包好的jar包(target/*.jar)并重命名到容器跟目录(/app.jar)，或ADD
COPY build/libs/*.jar app.jar
#健康检查 -s 静默模式，不下载文件，端口号无法动态传入，所以屏蔽
#HEALTHCHECK CMD wget -s http://127.0.0.1:14031/actuator/health || exit 1
#启动容器执行的命令 java -jar app.jar ,如果加其他参数加 ,"-参数",
CMD ["java","-jar","app.jar"]
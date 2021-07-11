FROM java:8
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
ADD *.jar app.jar
COPY agent /usr/local/agent
ENV JAVA_OPTS=""
ENV SPRING_PROFILES_ACTIVE="dev"
ENV SKYWALKING_AGENT_SERVICE_NAME=""
ENV SKYWALKING_COLLECTOR_BACKEND_SERVICE=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE:-docker} -javaagent:/usr/local/agent/skywalking-agent.jar -Dskywalking.agent.service_name=$SKYWALKING_AGENT_SERVICE_NAME -Dskywalking.collector.backend_service=$SKYWALKING_COLLECTOR_BACKEND_SERVICE -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
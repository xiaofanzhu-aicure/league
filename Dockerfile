FROM public.ecr.aws/amazoncorretto/amazoncorretto:8
# FROM 489478819445.dkr.ecr.us-west-2.amazonaws.com/amazoncorretto:8
# FROM amazoncorretto:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

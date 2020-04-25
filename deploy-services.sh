# deploy microservices jars to Azure
. ./enabled.sh
cd modules
alias az="az.cmd"
az spring-cloud app deploy -n gateway --jar-path ./gateway/target/gateway.jar
az spring-cloud app deploy -n city-service --jar-path ./city-service/target/city-service.jar
az spring-cloud app deploy -n weather-service --jar-path ./weather-service/target/weather-service.jar
az spring-cloud app deploy -n cities-weather-service --jar-path ./cities-weather-service/target/cities-weather-service.jar
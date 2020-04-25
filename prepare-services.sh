# create microservices in azure
. ./enabled.sh
alias az="az.cmd"
az spring-cloud app create --name gateway
az spring-cloud app create --name city-service
az spring-cloud app create --name weather-service
az spring-cloud app create --name cities-weather-service
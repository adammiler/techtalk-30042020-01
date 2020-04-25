# prepare microservices in azure from start.spring.io
. ./enabled.sh
mkdir modules
cd modules
cp ../pom-files/azure-spring-cloud-modules-pom.xml pom.xml
# this will be created in azure automatically 
# curl https://start.spring.io/starter.zip -d baseDir=config -d artifactId=config -d groupId=pl.amiler -d applicationName=ConfigApp -o config.zip && unzip config.zip && cp ../pom-files/config-pom.xml config/pom.xml
# curl https://start.spring.io/starter.zip -d baseDir=registry -d artifactId=registry -d groupId=pl.amiler -d applicationName=RegistryApp -o registry.zip && unzip registry.zip && cp ../pom-files/registry-pom.xml registry/pom.xml
curl https://start.spring.io/starter.zip -d baseDir=gateway -d artifactId=gateway -d groupId=pl.amiler -d applicationName=GatewayApp -o gateway.zip && unzip gateway.zip && cp ../pom-files/gateway-pom.xml gateway/pom.xml
curl https://start.spring.io/starter.zip -d baseDir=city-service -d artifactId=city-service -d groupId=pl.amiler -d applicationName=CityApp -o city-service.zip && unzip city-service.zip && cp ../pom-files/city-service-pom.xml city-service/pom.xml
curl https://start.spring.io/starter.zip -d baseDir=weather-service -d artifactId=weather-service -d groupId=pl.amiler -d applicationName=WeatherApp -o weather-service.zip && unzip weather-service.zip && cp ../pom-files/weather-service-pom.xml weather-service/pom.xml
curl https://start.spring.io/starter.zip -d baseDir=cities-weather-service -d artifactId=cities-weather-service -d groupId=pl.amiler -d applicationName=CitiesWeatherApp -o cities-weather-service.zip && unzip cities-weather-service.zip && cp ../pom-files/cities-weather-service-pom.xml cities-weather-service/pom.xml
find . -name "*Tests.java" -exec rm -rf {} \;
rm -f gateway.zip
rm -f city-service.zip
rm -f weather-service.zip
rm -f cities-weather-service.zip

package pl.amiler.weatherservice;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Document(collection = "Weather")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Weather {

    @Id
    private String id;

    @PartitionKey
    private String city;


    private String desc;


}

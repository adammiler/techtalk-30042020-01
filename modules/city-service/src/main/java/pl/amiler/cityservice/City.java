package pl.amiler.cityservice;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Document(collection = "City")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {

    @Id
    private String id;

    @PartitionKey
    private String name;

}

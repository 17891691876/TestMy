package bigtest.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.http.Header;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProxyResponse {
    String content;
    Header[] headers;
}

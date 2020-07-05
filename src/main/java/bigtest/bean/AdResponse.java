package bigtest.bean;

import lombok.Data;
import org.apache.http.Header;

/**
 * @author liaoyongfa
 */
@Data
public class AdResponse {
    private Header[] headers;
    private String content;
}

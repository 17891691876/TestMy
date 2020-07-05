package bigtest.validate.request;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ClientValidate {
    public static void validate(String client){
        if (StringUtils.isEmpty(client)){
           log.error("client设备编号为空");
        }
    }

}

package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmMaterialUrlValidate {
    public static void pmmaterialurlvalidate(String material_url){
        if (StringUtils.isEmpty(material_url)){
            log.error("material_url为空");
        }
    }
}

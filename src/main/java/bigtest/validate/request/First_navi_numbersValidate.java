package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class First_navi_numbersValidate {
    public static void validate(String first_navi_numbers){
        if (StringUtils.isEmpty(first_navi_numbers)){
            log.error("first_navi_numbers一级导航位置为空");
        }
    }
}

package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class News_first_naviValidate {
    public static void validate(String news_first_navi){
        if (StringUtils.isEmpty(news_first_navi)){
            log.error("news_first_navi新闻一级导航为空");
        }
    }
}

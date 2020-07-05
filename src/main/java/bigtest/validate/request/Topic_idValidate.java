package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class Topic_idValidate {
    public static void validate(String topic_id){
        if (StringUtils.isEmpty(topic_id)){
            log.error("topic_id社区话题id为空");
        }
    }
}

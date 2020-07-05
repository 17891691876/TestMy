package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ProjectIdValidate {
    public static void validate(String projectId){
        if (StringUtils.isEmpty(projectId)){
            log.error("projectId");
        }else if(!"1".equals(projectId) && !"3".equals(projectId)&& !"2".equals(projectId)){
            log.error("projectId取值非1，2，3而是为"+projectId);
        }
    }
}


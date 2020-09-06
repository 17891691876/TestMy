package bigtest.Utils;

import java.io.File;
import java.io.FileReader;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import cn.hutool.core.util.StrUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.io.IOException;

public class JsonUtils {


    /**
     * 读取json文件并转换成字符串
     * @return
     */
    public static String getJson(String path) {
        String jsonStr = "";
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            Reader reader = new InputStreamReader(new FileInputStream(file),"Utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
                //    System.out.println(sb);
                // System.out.println(sb);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 处理json字符串，找出要替换的数据并替换
     */
    public static Set<String> findtodata(String newJson){
        JSONArray dataArray = JSONArray.fromObject(newJson);
        Set<String> keySet = new HashSet<String>();
        int size = dataArray.size();
        for(int  i = 0; i < size; i++){
            JSONObject jsonObject = dataArray.getJSONObject(i);
            Object aa = jsonObject.get("response");
            JSONArray dataArray2 = JSONArray.fromObject(aa);
            for(int  j = 0; j < dataArray2.size(); j++){
                JSONObject jsonObject2 = dataArray2.getJSONObject(i);
                Object bb = jsonObject2.get("json");
                JSONArray dataArray3 = JSONArray.fromObject(bb);
                for(int  m = 0; m < dataArray3.size(); m++){
                    JSONObject jsonObject3 = dataArray3.getJSONObject(i);
                    Object cc = jsonObject3.get("data");
                    JSONArray dataArray4 = JSONArray.fromObject(cc);
                    for(int  n = 0; n < dataArray3.size(); n++){
                        JSONObject jsonObject4 = dataArray4.getJSONObject(i);
                        keySet = jsonObject4.keySet();
                        System.out.println("keySet=="+keySet);
                    }
                }
            }

        }
        return keySet;
    }

    /**
     * 处理数据
     * @param json
     * @param keySet
     * @return
     */
    public static String  replacedata(String json,Set<String> keySet,String data) {
        String str ="";
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            str = (String) iterator.next();
        }
        String s = StrUtil.replace(json,str,data);
        System.out.println("s=="+s);
        return s;

    }


    /**
     * 写出json文件
     */
    public static boolean writeJsonFile(String newJsonString, String path){
        boolean flag = false;
        try {
            FileWriter fw = new FileWriter(path);
            PrintWriter out = new PrintWriter(fw);
            out.write(newJsonString);
            out.println();
            fw.close();
            out.close();
            flag= true;
        } catch (IOException e) {
            e.printStackTrace();
        }
         return flag;
    }


}

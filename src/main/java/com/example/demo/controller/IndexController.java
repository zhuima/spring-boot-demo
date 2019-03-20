package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

/**
 * index controller
 * @author xuxueli 2015-12-19 16:13:16
 */
@Controller
public class IndexController {


  @RequestMapping("/hello" )
  @ResponseBody
  public Map<String, Object> chartInfo() {
    Map<String, Object> chartInfo = new HashMap<>();
    chartInfo.put("name","李达康");
    return chartInfo;
  }


}

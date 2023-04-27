package com.kbstar.controller;


import com.kbstar.dto.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tables")
public class TablesController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    String dir = "tables/"; // 매번, tables 라는 폴더 경로를 붙이기 귀찮을 때.

    // 상단 - tables 클릭 시 나오는 기본 페이지
    @RequestMapping("") // 127.0.0.1/tables
    public String main(Model model){
        List<Item> list = new ArrayList<>();
        list.add(new Item(101, "Tiger Nixon","System Architect","Edinburgh","61", new Date(), "320800")); //db에는 이미지 이름만 들어감.
        list.add(new Item(102, "김마니","System Architect","Edinburgh","61",new Date(), "500125"));
        list.add(new Item(103, "변사또","System Architect","Edinburgh","22",new Date(), "60875"));
        list.add(new Item(104, "허지웅","System Architect","Edinburgh","33",new Date(), "7852.4"));
        list.add(new Item(105, "당나라","System Architect","Edinburgh","44",new Date(), "8585"));
        list.add(new Item(106, "가나다","System Architect","Edinburgh","12",new Date(), "99999"));
        list.add(new Item(107, "도레미","System Architect","Edinburgh","44",new Date(), "111111"));
        list.add(new Item(108, "파솔라","System Architect","Edinburgh","55",new Date(), "12345"));
        list.add(new Item(109, "시도레","System Architect","Edinburgh","44",new Date(), "5642"));
        list.add(new Item(110, "미파솔","System Architect","Edinburgh","77",new Date(), "7654"));
        list.add(new Item(111, "라피도","System Architect","Edinburgh","88",new Date(), "9876"));
        list.add(new Item(112, "피카소","System Architect","Edinburgh","99",new Date(), "9999"));
        list.add(new Item(113, "밀레","System Architect","Edinburgh","44",new Date(), "2234"));
        list.add(new Item(114, "니엄","System Architect","Edinburgh","44",new Date(), "5412"));
        list.add(new Item(115, "세대","System Architect","Edinburgh","44",new Date(), "679"));
        list.add(new Item(116, "안녕","System Architect","Edinburgh","44",new Date(), "88754"));
        list.add(new Item(117, "반가운","System Architect","Edinburgh","44",new Date(), "768364"));
        list.add(new Item(118, "오나라","System Architect","Edinburgh","44",new Date(), "12343.9"));
        list.add(new Item(119, "이몸이","System Architect","Edinburgh","44",new Date(), "232435.99"));
        list.add(new Item(120, "죽고죽어","System Architect","Edinburgh","44",new Date(), "2345"));

        model.addAttribute("alltables", list); // 명칭 jsp파일에서 사용

        model.addAttribute("center", dir + "center");
        model.addAttribute("leftNav", dir + "leftNav");
        return "index";
    }

//     // tables - "id" 클릭 시 나오는 center 상세 페이지
//    @RequestMapping("/get") // 127.0.0.1/tables/get?id=
//    public String get(Model model, int id){
//       Item item = new Item(id, "Tiger Nixon","System Architect","Edinburgh","61", new Date(), "320800");
//        model.addAttribute("gitem", item);
//
//        model.addAttribute("center", dir + "get"); // center만 변경
//        model.addAttribute("leftNav", dir + "leftNav"); // leftNav 그대로
//        return "index";
//    }

    // tables - "id" 클릭 시 나오는 center 상세 페이지
    @RequestMapping("/get") // 127.0.0.1/tables/get?id=
    public String get(Model model, Item item){
        model.addAttribute("gitem", item);

        model.addAttribute("center", dir + "get"); // center만 변경
        model.addAttribute("leftNav", dir + "leftNav"); // leftNav 그대로
        return "index";
    }
}





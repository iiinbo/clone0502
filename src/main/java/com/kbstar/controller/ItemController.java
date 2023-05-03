package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j //log 출력가능하게 도와줌. 밑에 안써도 됨.
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService service;

    String dir = "item/"; // 매번, item 라는 폴더 경로를 붙이기 귀찮을 때.


    // 1. item - "add" 클릭 시 나오는 center 페이지
    @RequestMapping("/add") // 127.0.0.1/item/add
    public String add(Model model){
        model.addAttribute("center", dir + "add"); // center만 변경
        model.addAttribute("leftNav", "leftNav");
        return "index";
    }

    // 2. item - "all" 클릭 시 나오는 center 페이지
    @RequestMapping("/all") // 127.0.0.1/item/all

    public String all(Model model ) throws Exception {
        // 상세설명 : List<Cust> list = null ; 담기위해 바구니를 준비한다는 의미
        List<Item> list = null;
        try {
            list = service.get();
        } catch (Exception e) {
            throw new Exception("시스템 장애 발생 : ER0003");
        }

       model.addAttribute("itemlist", list); // db에 저장된 list 보여주기(jsp파일에서 itemlist 로 사용)
        model.addAttribute("center", dir + "all"); // center만 변경
        model.addAttribute("leftNav", "leftNav");
        return "index";
    }
    // 3. item- "all" 에서 특정 id 1건 선택 시 상세조회로 나오는 center 페이지명 :detail
    @RequestMapping("/detail") // 127.0.0.1/item/detail?id=
    public String detail(Model model, Integer id) throws Exception {
        // ?id= 에 대한 정보 가져오기
        Item item = null; // 가져올 준비하기.
        try {
            item  = service.get( id );
        } catch (Exception e) {
            throw new Exception("시스템 장애 발생 : ER0004");
        }
        model.addAttribute("itemdetail", item); //jsp파일에서 뿌릴 이름 정하기
        model.addAttribute("center", dir + "detail"); // center만 변경
        model.addAttribute("leftNav", "leftNav");
        return "index";
    }


}

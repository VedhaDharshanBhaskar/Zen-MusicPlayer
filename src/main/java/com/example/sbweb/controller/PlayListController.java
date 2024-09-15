package com.example.sbweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.sbweb.entities.PlayList;
import com.example.sbweb.entities.Songs;
import com.example.sbweb.services.PlayListService;
import com.example.sbweb.services.SongsService;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class PlayListController 
{
	@Autowired
   PlayListService pserv;
	
	@Autowired
   SongsService  sserv; 
	
   @GetMapping("/createplaylist")
   public String  createPlayList(Model model)
   {
	   //fetching the songs using song service
     List<Songs> songslist = sserv.fetchAllSongs();
     //adding the songs in the model
     model.addAttribute("songslist",songslist);
     //sending createplaylist 
     return "createplaylist";
   }
   @PostMapping("/addplaylist")
   public  String addPlayList (@ModelAttribute PlayList playlist)
   {
       
       
       return "playlistsuccess";
   }
   
   
   
   
}

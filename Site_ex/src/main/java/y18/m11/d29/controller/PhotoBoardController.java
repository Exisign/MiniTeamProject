package y18.m11.d29.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import y18.m11.d29.domain.PhotoBoard;
import y18.m11.d29.service.EmpService;

@Controller
public class PhotoBoardController {
	private static final Logger logger = LoggerFactory.getLogger(PhotoBoardController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	private EmpService photoService;
	
	@RequestMapping(value="/photo/list", method = RequestMethod.GET)
	public void getPhotoList(Model model, HttpServletRequest request){
		System.out.println("list");
		model.addAttribute("photoBoardList", photoService.getAllPhotoBoards());
	}
	
	@RequestMapping(value="photo/writeForm", method = RequestMethod.GET)
	public void getPhotoWriteForm(Model model, HttpServletRequest request){
		System.out.println("writeView");
	}
	
	@RequestMapping(value="/write")
	public String getPhotoWrite(@ModelAttribute PhotoBoard p){
		System.out.println("write");
		photoService.insertPhotoBoard(p);
		
		return "redirect:photo/list";
	}
	
	@RequestMapping(value="/photo/contentView", method = RequestMethod.GET)
	public void getPhotoContent_View(@ModelAttribute PhotoBoard p, Model model){
		System.out.println("contentView");
		model.addAttribute("photoContent", photoService.selectPhotoBoard(p.getPhoto_number()));
	}

	@RequestMapping(value="/photo/modify", method = RequestMethod.GET)
	public void getPhotoModify(Model model, HttpServletRequest request){
		System.out.println("modify");
	}
	
//	@RequestMapping(value="/delete", method = RequestMethod.GET)
//	public void getPhotoDelte(Model model, HttpServletRequest request){
//		System.out.println(request.getParameter("delete"));
//		model.addAttribute("count", photoService.getAllEmpCount());
//	}
//	
//	@RequestMapping(value="/photo/reply_view", method = RequestMethod.GET)
//	public void getPhotoReply_View(Model model, HttpServletRequest request){
//		System.out.println(request.getParameter("reply_view"));
//		model.addAttribute("count", empService.getAllEmpCount());
//	}
//	
//	@RequestMapping(value="/photo/reply", method = RequestMethod.GET)
//	public void getPhotoReply(Model model, HttpServletRequest request){
//		System.out.println(request.getParameter("reply"));
//		model.addAttribute("count", empService.getAllEmpCount());
//	}

	
	
	
}

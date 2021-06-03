package sjk.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index.tiles";
	}
	
	@RequestMapping("/join/agree")
	public String agree() {
		return "join/agree.tiles";
	}
	
	@RequestMapping("/join/checkme")
	public String checkme() {
		return "join/checkme.tiles";
	}
	
	@RequestMapping("/join/joinme")
	public String joinme() {
		return "join/joinme.tiles";
	}
	
	@RequestMapping("/join/joinok")
	public String joinok() {
		return "join/joinok.tiles";
	}
	
	@RequestMapping("/board/list")
	public String list() {
		return "board/list.tiles";
	}
	
	@RequestMapping("/board/write")
	public String write() {
		return "board/write.tiles";
	}
	
	@RequestMapping("/board/view")
	public String view() {
		return "board/view.tiles";
	}
	
	@RequestMapping("/pds/list")
	public String list2() {
		return "pds/list.tiles";
	}
	
	@RequestMapping("/pds/write")
	public String write2() {
		return "pds/write.tiles";
	}
	
	@RequestMapping("/pds/view")
	public String view2() {
		return "pds/view.tiles";
	}
	
	@RequestMapping("/gallery/list")
	public String list3() {
		return "gallery/list.tiles";
	}
	
	@RequestMapping("/gallery/write")
	public String write3() {
		return "gallery/write.tiles";
	}
	
	@RequestMapping("/gallery/view")
	public String view3() {
		return "gallery/view.tiles";
	}
	
}
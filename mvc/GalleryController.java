package sjk.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
	
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
package SpringPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringPractice.entity.NoticeEntity;
import SpringPractice.service.NoticeService;




@Controller
public class MainContoller {
	
	@Autowired
	NoticeService noticeService;
	
	
//	@RequestMapping("/test")
//	public String test(Model model) {
//		List<NoticeEntity> list = noticeService.noticelist();
//		model.addAttribute("list", list);
//		
//		return "index";
//	}
	@GetMapping
	public String home(Model model) {
		List <NoticeEntity> list=noticeService.noticelist();
		if(list != null)
		model.addAttribute("list",list);

	return "index";
	}
	
	@RequestMapping("/write.do")
	public String write() {
		return "/board/write";
	}
	
	@PostMapping("/write.do")
	public String save(NoticeEntity noticeEntity) {	//제목 글쓴이 등 가지고 있는 엔티티를 매개변수로 받는다 form을 컨트롤러에게 보내기때문
		noticeService.save(noticeEntity); //노티스엔티티를 세이브에 담는다
		return "redirect:/";
	}

	@RequestMapping("/detail/{idx}")	
	public String detail(@PathVariable long idx, Model model) { //패스벨류는 이 아이디엑스를 변수로 선언하겠다
		NoticeEntity noticeEntity = noticeService.getByIdx(idx);
		//대표적인게 컬럼들 중에 해당하는 아이디 하나를 가져오려면 그 해당하는 것 중 다 포함하고 있는 객체는 엔티티뿐이다
		model.addAttribute("list",noticeEntity);
		return "/board/detail"; 
	}
	//글쓰기를 할떄나 수정할때 post 데이터 보이지말라고..
	@GetMapping("delete/{idx}") //뿌려줄거 아니면 모델 쓸필요 없음..!
	public String delete(@PathVariable long idx) { //idx를 가져와서 지우기만 하면 되는거니까 (요청만할거니까) 그릇에 담을필요없다
		noticeService.deleteByIdx(idx); //리턴할게 없으면 entity가 필요없다 
		return "redirect:/";
	}
	
//	private static final Logger logger = LoggerFactory.getLogger(boardController.class);
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//		logger.info("Welcome home!");
//		
//		return "index";
//	}
	
//	@GetMapping
//	public String home(Model model) {
//		List <TestBoard> list=testService.getList();
//		if(list != null)
//		model.addAttribute("list",list);
//	
//		return "index";
//	}
//	
//	@RequestMapping("/test/write.do")
//	public String write() {
//		return "/board/write";
//	}
//	
//	
//	@RequestMapping("/test/save.do")
//	public String save(TestBoard testBoard) {
//		testService.save(testBoard);
//		return "redirect:/";
//	}
//	
//	@GetMapping("/test/{idx}")
//	public String detail(@PathVariable Long idx, Model model) {
//		TestBoard detail=testService.findIdx(idx);
//		model.addAttribute("detail", detail);
//		return "/board/detail";
//	}
//	
//	@GetMapping("/delete/{idx}")
//	public String delete(@PathVariable Long idx) {
//		testService.delete(idx);
//		return "redirect:/";
//	}
//	
//
//	@GetMapping("/update/{idx}")
//	public String update(@PathVariable Long idx , Model model) {
//		TestBoard detail=testService.findIdx(idx);
//		model.addAttribute("detail", detail);
//		return "/board/update";
//	}
//	
//	@PostMapping("/update")
//	public String update(TestBoard testBoard) {
//		testService.update(testBoard);
//		return "redirect:/";
//	}
	

}

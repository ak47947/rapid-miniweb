package org.rapid.examples.web.demo;

import org.rapid.examples.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * demo管理的Controller, 使用Restful风格的Urls:
 * 
 * @author lcw
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;

	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "demo/index";
	}

//	@RequestMapping(value = "test", method = RequestMethod.GET)
//	public String createForm(Model model) {
//		model.addAttribute("action", "create");
//		return "demo/test";
//	}
	
//	@RequestMapping(value = "delete/{id}")
//	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
//		
//		redirectAttributes.addFlashAttribute("message", "操作成功");
//		return "redirect:/task/";
//	}

	
}

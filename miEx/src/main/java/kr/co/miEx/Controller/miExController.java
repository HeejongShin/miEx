package kr.co.miEx.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.miEx.Service.miExService;

@Controller
public class miExController {
	
	@Resource(name = "service")
	private miExService miexservice;
	
	@RequestMapping("insert")
	public String insert() {
		
		return "";
	}
}

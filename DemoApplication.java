package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
		@RequestMapping("/")
		@ResponseBody
		public String index() {
			return "<ul>"
					+ "<li><a href=\"doctor/1\">William Hartnell</a></li>"
					+ " <li><a href=\"doctor/10\">David Tennant</a></li> "
					+ "<li><a href=\"doctor/13\">Jodie Whittaker</a></li> "
					+ "<li><a href=\"doctor/4\">Tom Baker</a></li> "
					+ "</ul>";
		}
		@RequestMapping("/doctor/1")
		@ResponseBody
		public String doctorOne () {
			return "William Hartnell";
		}
		@RequestMapping("/doctor/10")
		@ResponseBody
		public String doctorTen () {
			return "David Tennant";
		}
		@RequestMapping("/doctor/13")
		@ResponseBody
		public String doctorThirteen () {
			return "Jodie Whittaker";
		}
		@RequestMapping("/doctor/4")
		@ResponseBody
		public String doctorFour () {
			return "Tom Baker";
		}





}

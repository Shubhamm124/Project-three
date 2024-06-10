package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.model.Employee;
import com.example.demo.model.Policy;

import com.example.demo.model.User;
import com.example.demo.repository.PolicyRepository;
import com.example.demo.repository.UserRepository;

@Controller
@SessionAttributes({ "uid", "policyname", "years", "amount", "sum", "pName" }) // session.setAttribute("id",id)
public class UserController {

	@Autowired // EmployeeRepository employeeRepository = new EmployeeRepository()
	private UserRepository userRepository;

	@Autowired // EmployeeRepository employeeRepository = new EmployeeRepository()
	private PolicyRepository policyRepository;

	@GetMapping("showIndex")
	public String showIndex() {
		System.out.println("Inside showIndex");
		return "index1";

	}

	@GetMapping("showLogin")
	public String showLogin() {
		System.out.println("Inside showLogin");
		return "login";
	}

	@GetMapping("showSignUp")
	public String showSignUp() {
		System.out.println("Inside showSignUp");
		return "signup";
	}

	@GetMapping("showBuyPolicy")
	public String showBuyPolicy() {
		System.out.println("Inside showBuyPolicy");
		return "buyPolicy";
	}

	@GetMapping("showDeleteForm")
	public String showDeleteForm() {
		System.out.println("Inside showDeleteForm");
		return "deletePolicy";
	}

	@PostMapping("submitDelInfo")
	public String submitDelInfo(@RequestParam("polName") String polName) {
		System.out.println(polName);
		return "policyDeletion";
	}

	@GetMapping("showPortfolio")
	public String showPortfolio() {
		System.out.println("Inside showPortfolio");
		return "portfolio";
	}

	@PostMapping("submitData")
	public String submitData(@RequestParam("id") String id, @RequestParam("password") String password,
			@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("email") String email, @RequestParam("phone") String phone, @ModelAttribute User userobj,
			Model model) {
		System.out.println(userobj.getId());
		System.out.println(userobj.getPassword());
		System.out.println(userobj.getName());
		System.out.println(userobj.getAddress());
		System.out.println(userobj.getEmail());
		System.out.println(userobj.getPhone());
		userRepository.save(userobj);
		return "hello";
	}

	@PostMapping("showDashboard")
	public String showDashboard(@RequestParam("userid") String userid,
			@RequestParam("userpassword") String userpassword) {
		System.out.println("Inside showDashboard");

		if ((userid.equals("1") || userid.equals("2")) && userpassword.equals("Abc123")) {
			return "dashboard";
		} else if ((userid.equals("1") || userid.equals("2")) && userpassword != ("Abc123")) {
			return "error";
		} else if (userid != ("1") && userid != ("2") && userpassword != ("Abc123")) {
			System.out.println("Please sign up first!");
			return "index1";
		}
		return "dashboard";

	}

	@PostMapping("policyform")
	public String policyform(@RequestParam("uid") String uid, @RequestParam("policyname") String policyname,
			@RequestParam("years") String years, @RequestParam("amount") String amount, @RequestParam("sum") String sum,
			@ModelAttribute Policy policyobj, Model model) {
		System.out.println(uid);
		System.out.println(policyname);
		System.out.println(years);
		System.out.println(amount);
		System.out.println(sum);
		policyRepository.save(policyobj);
		return "message";

	}

	@GetMapping("submitPortfolioInfo")
	public String submitPortfolioInfo(@RequestParam("userid") String userid, @ModelAttribute Policy policyobj,
			Model model) {
		Optional<Policy> polOpt = policyRepository.findById(Integer.parseInt(userid));
		Policy emp = polOpt.get();
		System.out.println(emp.getPolicyname());
		String pName = emp.getPolicyname();
		model.addAttribute("pName", pName);
		return "policyNames";

	}

}
